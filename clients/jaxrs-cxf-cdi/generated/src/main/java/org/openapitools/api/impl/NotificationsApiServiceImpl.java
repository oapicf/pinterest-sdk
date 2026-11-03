package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-11-03T06:15:11.297068727Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NotificationsApiServiceImpl implements NotificationsApiService {
      @Override
      public Response notificationPost(NotificationPostRequest notificationPostRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
