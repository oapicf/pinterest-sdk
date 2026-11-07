package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-07T04:06:44.072323441Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface NotificationsApiService {
      Response notificationPost(NotificationPostRequest notificationPostRequest,SecurityContext securityContext)
      throws NotFoundException;


}
