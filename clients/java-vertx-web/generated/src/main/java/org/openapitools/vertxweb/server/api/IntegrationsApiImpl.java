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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class IntegrationsApiImpl implements IntegrationsApi {
    public Future<ApiResponse<IntegrationMetadata>> integrationsCommerceDel(String externalBusinessId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommerceGet(String externalBusinessId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommercePatch(String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationMetadata>> integrationsCommercePost(IntegrationMetadataCreate integrationMetadataCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationRecord>> integrationsGetById(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationsGetList200Response>> integrationsGetList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<IntegrationLogsSuccessResponse>> integrationsLogsPost(IntegrationLogsRequestCreate integrationLogsRequestCreate) {
        return Future.failedFuture(new HttpException(501));
    }

}
