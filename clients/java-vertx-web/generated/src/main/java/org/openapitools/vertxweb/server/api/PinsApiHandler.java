package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;
import org.openapitools.vertxweb.server.model.PinAnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.PinCreate;
import org.openapitools.vertxweb.server.model.PinUpdate;
import org.openapitools.vertxweb.server.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.PinsSaveRequest;

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
        builder.operation("multiPinsAnalytics").handler(this::multiPinsAnalytics);
        builder.operation("pinsAnalytics").handler(this::pinsAnalytics);
        builder.operation("pinsCreate").handler(this::pinsCreate);
        builder.operation("pinsDelete").handler(this::pinsDelete);
        builder.operation("pinsGet").handler(this::pinsGet);
        builder.operation("pinsList").handler(this::pinsList);
        builder.operation("pinsSave").handler(this::pinsSave);
        builder.operation("pinsUpdate").handler(this::pinsUpdate);
    }

    private void multiPinsAnalytics(RoutingContext routingContext) {
        logger.info("multiPinsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> pinIds = requestParameters.queryParameter("pin_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("pin_ids").get(), new TypeReference<List<String>>(){}) : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<PinsAnalyticsMetricTypesParameterInner> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<PinsAnalyticsMetricTypesParameterInner>>(){}) : null;
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : "ALL";
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinIds is {}", pinIds);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)
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

    private void pinsAnalytics(RoutingContext routingContext) {
        logger.info("pinsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<PinsAnalyticsMetricTypesParameterInner> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<PinsAnalyticsMetricTypesParameterInner>>(){}) : null;
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : "ALL";
        String splitField = requestParameters.queryParameter("split_field") != null ? requestParameters.queryParameter("split_field").getString() : "NO_SPLIT";
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
        PinCreate pinCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PinCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinCreate is {}", pinCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsCreate(pinCreate, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsDelete(pinId, adAccountId)
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
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsGet(pinId, pinMetrics, adAccountId)
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

    private void pinsList(RoutingContext routingContext) {
        logger.info("pinsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String pinFilter = requestParameters.queryParameter("pin_filter") != null ? requestParameters.queryParameter("pin_filter").getString() : null;
        Boolean includeProtectedPins = requestParameters.queryParameter("include_protected_pins") != null ? requestParameters.queryParameter("include_protected_pins").getBoolean() : false;
        String pinType = requestParameters.queryParameter("pin_type") != null ? requestParameters.queryParameter("pin_type").getString() : null;
        List<String> creativeTypes = requestParameters.queryParameter("creative_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("creative_types").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter pinFilter is {}", pinFilter);
        logger.debug("Parameter includeProtectedPins is {}", includeProtectedPins);
        logger.debug("Parameter pinType is {}", pinType);
        logger.debug("Parameter creativeTypes is {}", creativeTypes);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);

        api.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)
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

    private void pinsSave(RoutingContext routingContext) {
        logger.info("pinsSave()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        RequestParameter body = requestParameters.body();
        PinsSaveRequest pinsSaveRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PinsSaveRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter pinsSaveRequest is {}", pinsSaveRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsSave(pinId, pinsSaveRequest, adAccountId)
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

    private void pinsUpdate(RoutingContext routingContext) {
        logger.info("pinsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pinId = requestParameters.pathParameter("pin_id") != null ? requestParameters.pathParameter("pin_id").getString() : null;
        RequestParameter body = requestParameters.body();
        PinUpdate pinUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PinUpdate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter pinId is {}", pinId);
        logger.debug("Parameter pinUpdate is {}", pinUpdate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.pinsUpdate(pinId, pinUpdate, adAccountId)
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
