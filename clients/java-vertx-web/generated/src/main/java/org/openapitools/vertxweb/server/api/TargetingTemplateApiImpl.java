package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.TargetingTemplate;
import org.openapitools.vertxweb.server.model.TargetingTemplateCreate;
import org.openapitools.vertxweb.server.model.TargetingTemplateList200Response;
import org.openapitools.vertxweb.server.model.TargetingTemplateUpdateRequestReadOrUpdate;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class TargetingTemplateApiImpl implements TargetingTemplateApi {
    public Future<ApiResponse<TargetingTemplate>> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TargetingTemplateList200Response>> targetingTemplateList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

}
