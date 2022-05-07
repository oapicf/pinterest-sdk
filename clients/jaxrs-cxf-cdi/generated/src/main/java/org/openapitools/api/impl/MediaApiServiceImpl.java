package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Error;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;
import org.openapitools.model.Paginated;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-07T06:41:45.100230Z[Etc/UTC]")
public class MediaApiServiceImpl implements MediaApiService {
      @Override
      public Response mediaCreate(MediaUploadRequest mediaUploadRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response mediaGet(String mediaId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response mediaList(String bookmark, Integer pageSize, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
