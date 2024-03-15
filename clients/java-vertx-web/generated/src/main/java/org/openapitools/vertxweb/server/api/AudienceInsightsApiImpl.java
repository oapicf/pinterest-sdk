package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AudienceDefinitionResponse;
import org.openapitools.vertxweb.server.model.AudienceInsightType;
import org.openapitools.vertxweb.server.model.AudienceInsightsResponse;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AudienceInsightsApiImpl implements AudienceInsightsApi {
    public Future<ApiResponse<AudienceInsightsResponse>> audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AudienceDefinitionResponse>> audienceInsightsScopeAndTypeGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
