package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class IntegrationsApiService {
    public abstract Response integrationsCommerceDel(String externalBusinessId
 ) throws NotFoundException;
    public abstract Response integrationsCommerceGet(String externalBusinessId
 ) throws NotFoundException;
    public abstract Response integrationsCommercePatch(String externalBusinessId
 ,IntegrationRequestPatch integrationRequestPatch
 ) throws NotFoundException;
    public abstract Response integrationsCommercePost(IntegrationRequest integrationRequest
 ) throws NotFoundException;
    public abstract Response integrationsGetById(String id
 ) throws NotFoundException;
    public abstract Response integrationsGetList(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest
 ) throws NotFoundException;
}
