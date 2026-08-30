package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.vertxweb.server.model.IntegrationLogsRequestCreate;
import org.openapitools.vertxweb.server.model.IntegrationLogsSuccessResponse;
import org.openapitools.vertxweb.server.model.IntegrationMetadata;
import org.openapitools.vertxweb.server.model.IntegrationMetadataCreate;
import org.openapitools.vertxweb.server.model.IntegrationMetadataUpdate;
import org.openapitools.vertxweb.server.model.IntegrationRecord;
import org.openapitools.vertxweb.server.model.IntegrationsGetList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface IntegrationsApi  {
    Future<ApiResponse<IntegrationMetadata>> integrationsCommerceDel(String externalBusinessId);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommerceGet(String externalBusinessId);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommercePatch(String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate);
    Future<ApiResponse<IntegrationRecord>> integrationsGetById(String id);
    Future<ApiResponse<IntegrationsGetList200Response>> integrationsGetList(String bookmark, Integer pageSize);
    Future<ApiResponse<IntegrationLogsSuccessResponse>> integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate);
}
