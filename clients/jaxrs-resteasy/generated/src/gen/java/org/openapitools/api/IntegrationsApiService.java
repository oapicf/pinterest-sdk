package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface IntegrationsApiService {
      Response integrationsCommerceDel(String externalBusinessId,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommerceGet(String externalBusinessId,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommercePatch(String externalBusinessId,IntegrationMetadataUpdate integrationMetadataUpdate,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsGetById(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsGetList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate,SecurityContext securityContext)
      throws NotFoundException;


}
