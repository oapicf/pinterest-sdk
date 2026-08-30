package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface IntegrationsApiService {
      public Response integrationsCommerceDel(String externalBusinessId, SecurityContext securityContext);
      public Response integrationsCommerceGet(String externalBusinessId, SecurityContext securityContext);
      public Response integrationsCommercePatch(String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate, SecurityContext securityContext);
      public Response integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate, SecurityContext securityContext);
      public Response integrationsGetById(String id, SecurityContext securityContext);
      public Response integrationsGetList(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate, SecurityContext securityContext);
}
