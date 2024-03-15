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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class IntegrationsApiImpl implements IntegrationsApi {
    public Future<ApiResponse<Void>> integrationsCommerceDel(String externalBusinessId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommerceGet(String externalBusinessId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommercePost(IntegrationRequest integrationRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationRecord>> integrationsGetById(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationsGetList200Response>> integrationsGetList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationLogsSuccessResponse>> integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
