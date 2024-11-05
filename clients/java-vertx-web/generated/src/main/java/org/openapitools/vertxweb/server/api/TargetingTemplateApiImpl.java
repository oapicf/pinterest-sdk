package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.TargetingTemplateCreate;
import org.openapitools.vertxweb.server.model.TargetingTemplateGetResponseData;
import org.openapitools.vertxweb.server.model.TargetingTemplateList200Response;
import org.openapitools.vertxweb.server.model.TargetingTemplateUpdateRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class TargetingTemplateApiImpl implements TargetingTemplateApi {
    public Future<ApiResponse<TargetingTemplateGetResponseData>> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TargetingTemplateList200Response>> targetingTemplateList(String adAccountId, String order, Boolean includeSizing, String searchQuery, Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
