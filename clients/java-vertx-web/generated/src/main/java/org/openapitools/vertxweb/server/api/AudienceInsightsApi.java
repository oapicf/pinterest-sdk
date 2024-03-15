package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AudienceDefinitionResponse;
import org.openapitools.vertxweb.server.model.AudienceInsightType;
import org.openapitools.vertxweb.server.model.AudienceInsightsResponse;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AudienceInsightsApi  {
    Future<ApiResponse<AudienceInsightsResponse>> audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType);
    Future<ApiResponse<AudienceDefinitionResponse>> audienceInsightsScopeAndTypeGet(String adAccountId);
}
