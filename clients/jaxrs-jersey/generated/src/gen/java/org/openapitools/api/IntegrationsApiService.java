package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class IntegrationsApiService {
    public abstract Response integrationsCommerceDel(String externalBusinessId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsCommerceGet(String externalBusinessId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsCommercePatch(String externalBusinessId,IntegrationRequestPatch integrationRequestPatch,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsCommercePost(IntegrationRequest integrationRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsGetById(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsGetList(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest,SecurityContext securityContext) throws NotFoundException;
}
