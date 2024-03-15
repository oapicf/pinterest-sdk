package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.IntegrationLogsRequest;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationRequest;
import org.openapitools.model.IntegrationRequestPatch;
import org.openapitools.model.IntegrationsGetList200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface IntegrationsApiService {
      public Response integrationsCommerceDel(String externalBusinessId, SecurityContext securityContext);
      public Response integrationsCommerceGet(String externalBusinessId, SecurityContext securityContext);
      public Response integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch, SecurityContext securityContext);
      public Response integrationsCommercePost(IntegrationRequest integrationRequest, SecurityContext securityContext);
      public Response integrationsGetById(String id, SecurityContext securityContext);
      public Response integrationsGetList(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest, SecurityContext securityContext);
}
