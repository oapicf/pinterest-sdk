package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AudienceInsightType;
import org.openapitools.vertxweb.server.model.AudienceInsights;
import org.openapitools.vertxweb.server.model.AudienceInsightsScopeAndTypeGet200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AudienceInsightsApi  {
    Future<ApiResponse<AudienceInsights>> audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType);
    Future<ApiResponse<AudienceInsightsScopeAndTypeGet200Response>> audienceInsightsScopeAndTypeGet(String adAccountId);
}
