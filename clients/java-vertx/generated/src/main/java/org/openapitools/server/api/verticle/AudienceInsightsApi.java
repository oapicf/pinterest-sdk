package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AudienceDefinitionResponse;
import org.openapitools.server.api.model.AudienceInsightType;
import org.openapitools.server.api.model.AudienceInsightsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AudienceInsightsApi  {
    //audience_insights/get
    void audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType, Handler<AsyncResult<AudienceInsightsResponse>> handler);

    //audience_insights_scope_and_type/get
    void audienceInsightsScopeAndTypeGet(String adAccountId, Handler<AsyncResult<AudienceDefinitionResponse>> handler);

}
