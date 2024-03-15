package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AudienceDefinitionResponse;
import org.openapitools.vertxweb.server.model.AudienceInsightType;
import org.openapitools.vertxweb.server.model.AudienceInsightsResponse;
import org.openapitools.vertxweb.server.model.Error;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class AudienceInsightsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AudienceInsightsApiHandler.class);

    private final AudienceInsightsApi api;

    public AudienceInsightsApiHandler(AudienceInsightsApi api) {
        this.api = api;
    }

    @Deprecated
    public AudienceInsightsApiHandler() {
        this(new AudienceInsightsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("audienceInsightsGet").handler(this::audienceInsightsGet);
        builder.operation("audienceInsightsScopeAndTypeGet").handler(this::audienceInsightsScopeAndTypeGet);
    }

    private void audienceInsightsGet(RoutingContext routingContext) {
        logger.info("audienceInsightsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        AudienceInsightType audienceInsightType = requestParameters.queryParameter("audience_insight_type") != null ? requestParameters.queryParameter("audience_insight_type").getAudienceInsightType() : ;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceInsightType is {}", audienceInsightType);

        api.audienceInsightsGet(adAccountId, audienceInsightType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void audienceInsightsScopeAndTypeGet(RoutingContext routingContext) {
        logger.info("audienceInsightsScopeAndTypeGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.audienceInsightsScopeAndTypeGet(adAccountId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
