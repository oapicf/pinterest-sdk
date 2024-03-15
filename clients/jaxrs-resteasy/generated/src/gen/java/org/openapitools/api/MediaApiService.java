package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Error;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface MediaApiService {
      Response mediaCreate(MediaUploadRequest mediaUploadRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response mediaGet(String mediaId,SecurityContext securityContext)
      throws NotFoundException;
      Response mediaList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
}
