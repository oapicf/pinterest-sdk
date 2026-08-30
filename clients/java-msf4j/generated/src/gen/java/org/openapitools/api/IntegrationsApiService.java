package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class IntegrationsApiService {
    public abstract Response integrationsCommerceDel(String externalBusinessId
 ) throws NotFoundException;
    public abstract Response integrationsCommerceGet(String externalBusinessId
 ) throws NotFoundException;
    public abstract Response integrationsCommercePatch(String externalBusinessId
 ,IntegrationMetadataUpdate integrationMetadataUpdate
 ) throws NotFoundException;
    public abstract Response integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate
 ) throws NotFoundException;
    public abstract Response integrationsGetById(String id
 ) throws NotFoundException;
    public abstract Response integrationsGetList(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate
 ) throws NotFoundException;
}
