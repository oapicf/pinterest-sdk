package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCountryResponse;
import org.openapitools.vertxweb.server.model.BookClosedResponse;
import org.openapitools.vertxweb.server.model.DeliveryMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SingleInterestTargetingOptionResponse;

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

public class ResourcesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ResourcesApiHandler.class);

    private final ResourcesApi api;

    public ResourcesApiHandler(ResourcesApi api) {
        this.api = api;
    }

    @Deprecated
    public ResourcesApiHandler() {
        this(new ResourcesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adAccountCountriesGet").handler(this::adAccountCountriesGet);
        builder.operation("deliveryMetricsGet").handler(this::deliveryMetricsGet);
        builder.operation("interestTargetingOptionsGet").handler(this::interestTargetingOptionsGet);
        builder.operation("leadFormQuestionsGet").handler(this::leadFormQuestionsGet);
        builder.operation("metricsReadyStateGet").handler(this::metricsReadyStateGet);
        builder.operation("targetingOptionsGet").handler(this::targetingOptionsGet);
    }

    private void adAccountCountriesGet(RoutingContext routingContext) {
        logger.info("adAccountCountriesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.adAccountCountriesGet()
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

    private void deliveryMetricsGet(RoutingContext routingContext) {
        logger.info("deliveryMetricsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String reportType = requestParameters.queryParameter("report_type") != null ? requestParameters.queryParameter("report_type").getString() : null;

        logger.debug("Parameter reportType is {}", reportType);

        api.deliveryMetricsGet(reportType)
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

    private void interestTargetingOptionsGet(RoutingContext routingContext) {
        logger.info("interestTargetingOptionsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String interestId = requestParameters.pathParameter("interest_id") != null ? requestParameters.pathParameter("interest_id").getString() : null;

        logger.debug("Parameter interestId is {}", interestId);

        api.interestTargetingOptionsGet(interestId)
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

    private void leadFormQuestionsGet(RoutingContext routingContext) {
        logger.info("leadFormQuestionsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.leadFormQuestionsGet()
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

    private void metricsReadyStateGet(RoutingContext routingContext) {
        logger.info("metricsReadyStateGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String date = requestParameters.queryParameter("date") != null ? requestParameters.queryParameter("date").getString() : null;

        logger.debug("Parameter date is {}", date);

        api.metricsReadyStateGet(date)
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

    private void targetingOptionsGet(RoutingContext routingContext) {
        logger.info("targetingOptionsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String targetingType = requestParameters.pathParameter("targeting_type") != null ? requestParameters.pathParameter("targeting_type").getString() : null;
        String clientId = requestParameters.queryParameter("client_id") != null ? requestParameters.queryParameter("client_id").getString() : null;
        String oauthSignature = requestParameters.queryParameter("oauth_signature") != null ? requestParameters.queryParameter("oauth_signature").getString() : null;
        String timestamp = requestParameters.queryParameter("timestamp") != null ? requestParameters.queryParameter("timestamp").getString() : null;

        logger.debug("Parameter targetingType is {}", targetingType);
        logger.debug("Parameter clientId is {}", clientId);
        logger.debug("Parameter oauthSignature is {}", oauthSignature);
        logger.debug("Parameter timestamp is {}", timestamp);

        api.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp)
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
