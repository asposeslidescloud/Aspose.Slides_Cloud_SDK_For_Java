package com.aspose.slides.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.slides.model.FontSchemeResponse;
import com.aspose.slides.model.SlideBackgroundResponse;
import com.aspose.slides.model.SplitDocumentResponse;
import com.aspose.slides.model.DocumentResponse;
import com.aspose.slides.model.ResponseMessage;
import com.aspose.slides.model.TextItemsResponse;
import com.aspose.slides.model.SlideCommentsResponse;
import com.aspose.slides.model.OrderedMergeRequest;
import com.aspose.slides.model.DocumentProperties;
import com.aspose.slides.model.ColorSchemeResponse;
import com.aspose.slides.model.DocumentProperty;
import com.aspose.slides.model.DocumentPropertiesResponse;
import com.aspose.slides.model.PresentationStringReplaceResponse;
import com.aspose.slides.model.Portion;
import com.aspose.slides.model.Shape;
import com.aspose.slides.model.DocumentPropertyResponse;
import com.aspose.slides.model.SlideStringReplaceResponse;
import com.aspose.slides.model.ThemeResponse;
import com.aspose.slides.model.CommonResponse;
import com.aspose.slides.model.PlaceholderResponse;
import com.aspose.slides.model.ShapeListResponse;
import com.aspose.slides.model.ImagesResponse;
import com.aspose.slides.model.SlideListResponse;
import com.aspose.slides.model.PlaceholdersResponse;
import com.aspose.slides.model.PresentationsMergeRequest;
import com.aspose.slides.model.FormatSchemeResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class SlidesApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesDocument
	* Read presentation info.
	* @param name	String	The document name.
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlidesDocument (String name, String password, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/?appSid={appSid}&amp;password={password}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesDocumentWithFormat
	* Export presentation to some format.
	* @param name	String	The document name.
	* @param format	String	The conversion format.
	* @param jpegQuality	String	Quality of the JPEG images inside PDF document.
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param outPath	String	Path to save result
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlidesDocumentWithFormat (String name, String format, String jpegQuality, String password, String storage, String folder, String outPath) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/?appSid={appSid}&amp;toFormat={toFormat}&amp;jpegQuality={jpegQuality}&amp;password={password}&amp;storage={storage}&amp;folder={folder}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(jpegQuality!=null)
      queryParams.put("jpegQuality", String.valueOf(jpegQuality));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesDocument
	* Create presentation
	* @param name	String	The document name.
	* @param templatePath	String	Template file path.
	* @param templateStorage	String	Template storage name.
	* @param isImageDataEmbeeded	Boolean	Is Image Data Embeeded
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostSlidesDocument (String name, String templatePath, String templateStorage, Boolean isImageDataEmbeeded, String password, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || templatePath == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/?appSid={appSid}&amp;templatePath={templatePath}&amp;templateStorage={templateStorage}&amp;isImageDataEmbeeded={isImageDataEmbeeded}&amp;password={password}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(templatePath!=null)
      queryParams.put("templatePath", String.valueOf(templatePath));
    if(templateStorage!=null)
      queryParams.put("templateStorage", String.valueOf(templateStorage));
    if(isImageDataEmbeeded!=null)
      queryParams.put("isImageDataEmbeeded", String.valueOf(isImageDataEmbeeded));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesSplit
	* Splitting presentations. Create one image per slide.
	* @param name	String	The document name.
	* @param width	Integer	The width of created images.
	* @param height	Integer	The height of created images.
	* @param to	Integer	The last slide number for splitting, if is not specified splitting ends at the last slide of the document.
	* @param from	Integer	The start slide number for splitting, if is not specified splitting starts from the first slide of the presentation.
	* @param destFolder	String	Folder on storage where images are going to be uploaded. If not specified then images are uploaded to same folder as presentation.
	* @param format	String	The format. Default value is jpeg.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SplitDocumentResponse
	*/

  public SplitDocumentResponse PostSlidesSplit (String name, Integer width, Integer height, Integer to, Integer from, String destFolder, String format, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/split/?appSid={appSid}&amp;width={width}&amp;height={height}&amp;to={to}&amp;from={from}&amp;destFolder={destFolder}&amp;toFormat={toFormat}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(to!=null)
      queryParams.put("to", String.valueOf(to));
    if(from!=null)
      queryParams.put("from", String.valueOf(from));
    if(destFolder!=null)
      queryParams.put("destFolder", String.valueOf(destFolder));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SplitDocumentResponse) ApiInvoker.deserialize(response, "", SplitDocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutNewPresentation
	* Create presentation
	* @param name	String	The document name.
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutNewPresentation (String name, String password, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/?appSid={appSid}&amp;password={password}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutNewPresentationFromStoredTemplate
	* Create presentation from stored template
	* @param name	String	The document name.
	* @param templatePath	String	Template file path.
	* @param templateStorage	String	Template storage name.
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutNewPresentationFromStoredTemplate (String name, String templatePath, String templateStorage, String password, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || templatePath == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/?appSid={appSid}&amp;templatePath={templatePath}&amp;templateStorage={templateStorage}&amp;password={password}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(templatePath!=null)
      queryParams.put("templatePath", String.valueOf(templatePath));
    if(templateStorage!=null)
      queryParams.put("templateStorage", String.valueOf(templateStorage));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSlidesConvert
	* Convert presentation from request content to format specified.
	* @param password	String	The document password.
	* @param format	String	The format.
	* @param outPath	String	Path to save result
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutSlidesConvert (String password, String format, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/convert/?appSid={appSid}&amp;password={password}&amp;toFormat={toFormat}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSlidesDocumentFromHtml
	* Create presentation document from html
	* @param name	String	The document name.
	* @param password	String	The document password.
	* @param storage	String	Document's storage.
	* @param folder	String	Document's folder.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PutSlidesDocumentFromHtml (String name, String password, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/fromHtml/?appSid={appSid}&amp;password={password}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(password!=null)
      queryParams.put("password", String.valueOf(password));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesImages
	* Read presentation images info.
	* @param name	String	The presentation name.
	* @param folder	String	The presentation folder.
	* @param storage	String	Document's storage.
	* @return ImagesResponse
	*/

  public ImagesResponse GetSlidesImages (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/images/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ImagesResponse) ApiInvoker.deserialize(response, "", ImagesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideImages
	* Read slide images info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	The slide index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Document's storage.
	* @return ImagesResponse
	*/

  public ImagesResponse GetSlidesSlideImages (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/images/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ImagesResponse) ApiInvoker.deserialize(response, "", ImagesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostPresentationMerge
	* Merge presentations.
	* @param name	String	Original presentation name.
	* @param storage	String	The storage.
	* @param folder	String	The folder.
	* @param body	PresentationsMergeRequest	with a list of presentations to merge.
	* @return DocumentResponse
	*/

  public DocumentResponse PostPresentationMerge (String name, String storage, String folder, PresentationsMergeRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/merge/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutPresentationMerge
	* Merge presentations.
	* @param name	String	Original presentation name.
	* @param storage	String	The storage.
	* @param folder	String	The folder.
	* @param body	OrderedMergeRequest	with a list of presentations to merge.
	* @return DocumentResponse
	*/

  public DocumentResponse PutPresentationMerge (String name, String storage, String folder, OrderedMergeRequest body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/merge/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentResponse) ApiInvoker.deserialize(response, "", DocumentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesPlaceholder
	* Read slide placeholder info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide index.
	* @param placeholderIndex	Integer	Pleceholder index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Document's storage.
	* @return PlaceholderResponse
	*/

  public PlaceholderResponse GetSlidesPlaceholder (String name, Integer slideIndex, Integer placeholderIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || placeholderIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/placeholders/{placeholderIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(placeholderIndex!=null)
      queryParams.put("placeholderIndex", String.valueOf(placeholderIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (PlaceholderResponse) ApiInvoker.deserialize(response, "", PlaceholderResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesPlaceholders
	* Read slide placeholders info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Document's storage.
	* @return PlaceholdersResponse
	*/

  public PlaceholdersResponse GetSlidesPlaceholders (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/placeholders/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (PlaceholdersResponse) ApiInvoker.deserialize(response, "", PlaceholdersResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteSlidesDocumentProperties
	* Clean document properties.
	* @param name	String	The presentation name.
	* @param folder	String	The presentation folder.
	* @param storage	String	Document's storage.
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse DeleteSlidesDocumentProperties (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/documentproperties/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteSlidesDocumentProperty
	* Delete document property.
	* @param name	String	The presentation name.
	* @param propertyName	String	The property name.
	* @param folder	String	The presentation folder.
	* @param storage	String	Document's storage.
	* @return CommonResponse
	*/

  public CommonResponse DeleteSlidesDocumentProperty (String name, String propertyName, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (CommonResponse) ApiInvoker.deserialize(response, "", CommonResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesDocumentProperties
	* Read presentation document properties.
	* @param name	String	The document name.
	* @param folder	String	Document's folder.
	* @param storage	String	Document's storage.
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse GetSlidesDocumentProperties (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/documentproperties/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesSetDocumentProperties
	* Set document properties.
	* @param name	String	The document name.
	* @param folder	String	Document's folder.
	* @param storage	String	Document's storage.
	* @param body	DocumentProperties	New properties.
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse PostSlidesSetDocumentProperties (String name, String folder, String storage, DocumentProperties body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/documentproperties/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSlidesSetDocumentProperty
	* Set document property.
	* @param name	String	The presentation name.
	* @param propertyName	String	The property name.
	* @param folder	String	Document's folder.
	* @param storage	String	Document's storage.
	* @param body	DocumentProperty	Property with the value.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse PutSlidesSetDocumentProperty (String name, String propertyName, String folder, String storage, DocumentProperty body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || propertyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetParagraphPortion
	* Reads paragraph portion in shape's textBody.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Index of slide starting from 1
	* @param shapeIndex	Integer	Index of shape starting from 1
	* @param paragraphIndex	Integer	Index of paragraph starting from 1
	* @param portionIndex	Integer	Index of portion starting from 1
	* @param folder	String	Presentation folder.
	* @param storage	String	Document's storage.
	* @return ResponseMessage
	*/

  public ResponseMessage GetParagraphPortion (String name, Integer slideIndex, Integer shapeIndex, Integer paragraphIndex, Integer portionIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || shapeIndex == null || paragraphIndex == null || portionIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapeIndex!=null)
      queryParams.put("shapeIndex", String.valueOf(shapeIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(portionIndex!=null)
      queryParams.put("portionIndex", String.valueOf(portionIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetShapeParagraph
	* Reads paragraph in shape's textBody.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Index of slide starting from 1
	* @param shapeIndex	Integer	Index of shape starting from 1
	* @param paragraphIndex	Integer	Index of paragraph starting from 1
	* @param folder	String	Presentation folder.
	* @param storage	String	Document's storage.
	* @return ResponseMessage
	*/

  public ResponseMessage GetShapeParagraph (String name, Integer slideIndex, Integer shapeIndex, Integer paragraphIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || shapeIndex == null || paragraphIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/paragraphs/{paragraphIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapeIndex!=null)
      queryParams.put("shapeIndex", String.valueOf(shapeIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlideShapeParagraphs
	* Reads a list of paragraphs in shape's textBody.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Index of slide starting from 1
	* @param shapeIndex	Integer	Index of shape starting from 1
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlideShapeParagraphs (String name, Integer slideIndex, Integer shapeIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || shapeIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/paragraphs/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapeIndex!=null)
      queryParams.put("shapeIndex", String.valueOf(shapeIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideShapes
	* Read slides shapes info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return ShapeListResponse
	*/

  public ShapeListResponse GetSlidesSlideShapes (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ShapeListResponse) ApiInvoker.deserialize(response, "", ShapeListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideShapesParent
	* Read slide shapes or shape info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide index.
	* @param shapePath	String	Shape path.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlidesSlideShapesParent (String name, Integer slideIndex, String shapePath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || shapePath == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapePath}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapePath!=null)
      queryParams.put("shapePath", String.valueOf(shapePath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSetParagraphPortionProperties
	* Updates paragraph portion properties.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param shapeIndex	Integer	
	* @param paragraphIndex	Integer	
	* @param portionIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @param body	Portion	
	* @return ResponseMessage
	*/

  public ResponseMessage PutSetParagraphPortionProperties (String name, Integer slideIndex, Integer shapeIndex, Integer paragraphIndex, Integer portionIndex, String folder, String storage, Portion body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || slideIndex == null || shapeIndex == null || paragraphIndex == null || portionIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapeIndex!=null)
      queryParams.put("shapeIndex", String.valueOf(shapeIndex));
    if(paragraphIndex!=null)
      queryParams.put("paragraphIndex", String.valueOf(paragraphIndex));
    if(portionIndex!=null)
      queryParams.put("portionIndex", String.valueOf(portionIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSlideShapeInfo
	* Updates shape properties.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide index.
	* @param shapePath	String	Shape path.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @param body	Shape	Shape dto.
	* @return ResponseMessage
	*/

  public ResponseMessage PutSlideShapeInfo (String name, Integer slideIndex, String shapePath, String folder, String storage, Shape body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || slideIndex == null || shapePath == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapePath}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(shapePath!=null)
      queryParams.put("shapePath", String.valueOf(shapePath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteSlideByIndex
	* Delete presentation slide by its index.
	* @param name	String	The presentation name.
	* @param slideIndex	Integer	The slide index.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse DeleteSlideByIndex (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteSlidesCleanSlidesList
	* Delete presentation slides.
	* @param name	String	The presentation name.
	* @param folder	String	The presentation folder.
	* @param storage	String	Presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse DeleteSlidesCleanSlidesList (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteSlidesSlideBackground
	* Remove presentation slide background color.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @return SlideBackgroundResponse
	*/

  public SlideBackgroundResponse DeleteSlidesSlideBackground (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/background/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideBackgroundResponse) ApiInvoker.deserialize(response, "", SlideBackgroundResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlide
	* Read slide info.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlidesSlide (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideBackground
	* Read presentation slide background color type.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @return SlideBackgroundResponse
	*/

  public SlideBackgroundResponse GetSlidesSlideBackground (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/background/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideBackgroundResponse) ApiInvoker.deserialize(response, "", SlideBackgroundResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideComments
	* Read presentation slide comments.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @return SlideCommentsResponse
	*/

  public SlideCommentsResponse GetSlidesSlideComments (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/comments/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideCommentsResponse) ApiInvoker.deserialize(response, "", SlideCommentsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlidesList
	* Read presentation slides info.
	* @param name	String	The presentation name.
	* @param folder	String	The presentation folder.
	* @param storage	String	Presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse GetSlidesSlidesList (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlideWithFormat
	* Convert slide to some format.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param format	String	
	* @param width	Integer	
	* @param height	Integer	
	* @param folder	String	
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetSlideWithFormat (String name, Integer slideIndex, String format, Integer width, Integer height, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/?appSid={appSid}&amp;toFormat={toFormat}&amp;width={width}&amp;height={height}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostAddEmptySlide
	* Add empty slide to the end of presentation
	* @param name	String	The presentation name.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostAddEmptySlide (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostAddEmptySlideAtPosition
	* Add empty presentation slide to the end of presentation
	* @param name	String	The presentation name.
	* @param position	Integer	The presentation slide position.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostAddEmptySlideAtPosition (String name, Integer position, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || position == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;position={position}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(position!=null)
      queryParams.put("position", String.valueOf(position));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostAddSlideCopy
	* Add a copy of slide to the end of presentation
	* @param name	String	The presentation name.
	* @param slideToClone	Integer	The presentation slide to clone.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostAddSlideCopy (String name, Integer slideToClone, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideToClone == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;slideToClone={slideToClone}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideToClone!=null)
      queryParams.put("slideToClone", String.valueOf(slideToClone));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostClonePresentationSlide
	* Clone presentation slide
	* @param name	String	The presentation name.
	* @param position	Integer	The presentation slide position.
	* @param slideToClone	Integer	The presentation slide to clone.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostClonePresentationSlide (String name, Integer position, Integer slideToClone, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || position == null || slideToClone == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;position={position}&amp;slideToClone={slideToClone}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(position!=null)
      queryParams.put("position", String.valueOf(position));
    if(slideToClone!=null)
      queryParams.put("slideToClone", String.valueOf(slideToClone));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostCopySlideFromSourcePresentation
	* Copy slide from source presentation
	* @param name	String	The presentation name.
	* @param slideToCopy	Integer	The presentation slide to copy.
	* @param source	String	The source presentation.
	* @param position	Integer	The presentation slide position.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostCopySlideFromSourcePresentation (String name, Integer slideToCopy, String source, Integer position, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideToCopy == null || source == null || position == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;slideToCopy={slideToCopy}&amp;source={source}&amp;position={position}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideToCopy!=null)
      queryParams.put("slideToCopy", String.valueOf(slideToCopy));
    if(source!=null)
      queryParams.put("source", String.valueOf(source));
    if(position!=null)
      queryParams.put("position", String.valueOf(position));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesReorderPosition
	* Reorder presentation slide position
	* @param name	String	The presentation name.
	* @param oldPosition	Integer	The new presentation slide position.
	* @param newPosition	Integer	The new presentation slide position.
	* @param folder	String	The presentation folder.
	* @param storage	String	The presentation storage.
	* @return SlideListResponse
	*/

  public SlideListResponse PostSlidesReorderPosition (String name, Integer oldPosition, Integer newPosition, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || oldPosition == null || newPosition == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/?appSid={appSid}&amp;oldPosition={oldPosition}&amp;newPosition={newPosition}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(oldPosition!=null)
      queryParams.put("oldPosition", String.valueOf(oldPosition));
    if(newPosition!=null)
      queryParams.put("newPosition", String.valueOf(newPosition));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideListResponse) ApiInvoker.deserialize(response, "", SlideListResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutSlidesSlideBackground
	* Set presentation slide background color.
	* @param name	String	
	* @param slideIndex	Integer	
	* @param folder	String	
	* @param storage	String	
	* @param body	String	
	* @return SlideBackgroundResponse
	*/

  public SlideBackgroundResponse PutSlidesSlideBackground (String name, Integer slideIndex, String folder, String storage, String body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || slideIndex == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/background/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideBackgroundResponse) ApiInvoker.deserialize(response, "", SlideBackgroundResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesPresentationTextItems
	* Extract presentation text items.
	* @param name	String	Presentation name.
	* @param withEmpty	Boolean	Incude empty items.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetSlidesPresentationTextItems (String name, Boolean withEmpty, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/textItems/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesSlideTextItems
	* Extract slide text items.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param withEmpty	Boolean	Include empty items.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return TextItemsResponse
	*/

  public TextItemsResponse GetSlidesSlideTextItems (String name, Integer slideIndex, Boolean withEmpty, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/textItems/?appSid={appSid}&amp;withEmpty={withEmpty}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(withEmpty!=null)
      queryParams.put("withEmpty", String.valueOf(withEmpty));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TextItemsResponse) ApiInvoker.deserialize(response, "", TextItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesPresentationReplaceText
	* Replace text by a new value.
	* @param name	String	The presentation name.
	* @param oldValue	String	Text value to replace.
	* @param newValue	String	The new text value.
	* @param ignoreCase	Boolean	Is case must be ignored.
	* @param folder	String	The presentation folder.
	* @param storage	String	Presentation storage.
	* @return PresentationStringReplaceResponse
	*/

  public PresentationStringReplaceResponse PostSlidesPresentationReplaceText (String name, String oldValue, String newValue, Boolean ignoreCase, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || oldValue == null || newValue == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/replaceText/?oldValue={oldValue}&amp;newValue={newValue}&amp;appSid={appSid}&amp;ignoreCase={ignoreCase}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(oldValue!=null)
      queryParams.put("oldValue", String.valueOf(oldValue));
    if(newValue!=null)
      queryParams.put("newValue", String.valueOf(newValue));
    if(ignoreCase!=null)
      queryParams.put("ignoreCase", String.valueOf(ignoreCase));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (PresentationStringReplaceResponse) ApiInvoker.deserialize(response, "", PresentationStringReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostSlidesSlideReplaceText
	* Replace text by a new value.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param oldValue	String	Text to replace.
	* @param newValue	String	New text value.
	* @param ignoreCase	Boolean	Is case must be ignored.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return SlideStringReplaceResponse
	*/

  public SlideStringReplaceResponse PostSlidesSlideReplaceText (String name, Integer slideIndex, String oldValue, String newValue, Boolean ignoreCase, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null || oldValue == null || newValue == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/replaceText/?oldValue={oldValue}&amp;newValue={newValue}&amp;appSid={appSid}&amp;ignoreCase={ignoreCase}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(oldValue!=null)
      queryParams.put("oldValue", String.valueOf(oldValue));
    if(newValue!=null)
      queryParams.put("newValue", String.valueOf(newValue));
    if(ignoreCase!=null)
      queryParams.put("ignoreCase", String.valueOf(ignoreCase));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SlideStringReplaceResponse) ApiInvoker.deserialize(response, "", SlideStringReplaceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesTheme
	* Read slide theme info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return ThemeResponse
	*/

  public ThemeResponse GetSlidesTheme (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/theme/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ThemeResponse) ApiInvoker.deserialize(response, "", ThemeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesThemeColorScheme
	* Read slide theme color scheme info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return ColorSchemeResponse
	*/

  public ColorSchemeResponse GetSlidesThemeColorScheme (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/theme/colorScheme/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ColorSchemeResponse) ApiInvoker.deserialize(response, "", ColorSchemeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesThemeFontScheme
	* Read slide theme font scheme info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return FontSchemeResponse
	*/

  public FontSchemeResponse GetSlidesThemeFontScheme (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/theme/fontScheme/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FontSchemeResponse) ApiInvoker.deserialize(response, "", FontSchemeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetSlidesThemeFormatScheme
	* Read slide theme color scheme info.
	* @param name	String	Presentation name.
	* @param slideIndex	Integer	Slide's index.
	* @param folder	String	Presentation folder.
	* @param storage	String	Presentation storage.
	* @return FormatSchemeResponse
	*/

  public FormatSchemeResponse GetSlidesThemeFormatScheme (String name, Integer slideIndex, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || slideIndex == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/slides/{name}/slides/{slideIndex}/theme/toFormatScheme/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(slideIndex!=null)
      queryParams.put("slideIndex", String.valueOf(slideIndex));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (FormatSchemeResponse) ApiInvoker.deserialize(response, "", FormatSchemeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }
