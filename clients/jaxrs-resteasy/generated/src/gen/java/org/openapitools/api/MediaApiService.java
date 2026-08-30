package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Media;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadCreate;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface MediaApiService {
      Response mediaCreate(MediaUploadCreate mediaUploadCreate,SecurityContext securityContext)
      throws NotFoundException;
      Response mediaGet(String mediaId,SecurityContext securityContext)
      throws NotFoundException;
      Response mediaList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;


}
