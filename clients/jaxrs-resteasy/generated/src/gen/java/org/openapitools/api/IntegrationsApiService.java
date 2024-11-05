package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface IntegrationsApiService {
      Response integrationsCommerceDel(String externalBusinessId,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommerceGet(String externalBusinessId,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommercePatch(String externalBusinessId,IntegrationRequestPatch integrationRequestPatch,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsCommercePost(IntegrationRequest integrationRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsGetById(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsGetList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest,SecurityContext securityContext)
      throws NotFoundException;
}
