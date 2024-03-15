package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DetailedError;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.IntegrationLogsRequest;
import org.openapitools.vertxweb.server.model.IntegrationLogsSuccessResponse;
import org.openapitools.vertxweb.server.model.IntegrationMetadata;
import org.openapitools.vertxweb.server.model.IntegrationRecord;
import org.openapitools.vertxweb.server.model.IntegrationRequest;
import org.openapitools.vertxweb.server.model.IntegrationRequestPatch;
import org.openapitools.vertxweb.server.model.IntegrationsGetList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface IntegrationsApi  {
    Future<ApiResponse<Void>> integrationsCommerceDel(String externalBusinessId);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommerceGet(String externalBusinessId);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch);
    Future<ApiResponse<IntegrationMetadata>> integrationsCommercePost(IntegrationRequest integrationRequest);
    Future<ApiResponse<IntegrationRecord>> integrationsGetById(String id);
    Future<ApiResponse<IntegrationsGetList200Response>> integrationsGetList(String bookmark, Integer pageSize);
    Future<ApiResponse<IntegrationLogsSuccessResponse>> integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest);
}
