package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;

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

public class PinsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(PinsApiHandler.class);

    private final PinsApi api;

    public PinsApiHandler(PinsApi api) {
        this.api = api;
    }

    @Deprecated
    public PinsApiHandler() {
        this(new PinsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("pinsAnalytics").handler(this::pinsAnalytics);
        builder.operation("pinsCreate").handler(this::pinsCreate);
        builder.operation("pinsDelete").handler(this::pinsDelete);
        builder.operation("pinsGet").handler(this::pinsGet);
    }

    private void pinsAnalytics(RoutingContext routingContext) {
        logger.info("pinsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<String>>(){}) : null;
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : null;
        String splitField = requestParameters.queryParameter("split_field") != null ? requestParameters.queryParameter("split_field").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter splitField is {}", splitField);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
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

    private void pinsCreate(RoutingContext routingContext) {
        logger.info("pinsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        Pin pin = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<Pin>(){}) : null;

        logger.debug("Parameter pin is {}", pin);

        api.pinsCreate(pin)
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

    private void pinsDelete(RoutingContext routingContext) {
        logger.info("pinsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);

        api.pinsDelete(pinId)
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

    private void pinsGet(RoutingContext routingContext) {
        logger.info("pinsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsGet(pinId, adAccountId)
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
