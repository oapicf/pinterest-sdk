package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionEventResponse;
import org.openapitools.vertxweb.server.model.ConversionTagCreate;
import org.openapitools.vertxweb.server.model.ConversionTagListResponse;
import org.openapitools.vertxweb.server.model.ConversionTagResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PageVisitConversionTagsGet200Response;

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

public class ConversionTagsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConversionTagsApiHandler.class);

    private final ConversionTagsApi api;

    public ConversionTagsApiHandler(ConversionTagsApi api) {
        this.api = api;
    }

    @Deprecated
    public ConversionTagsApiHandler() {
        this(new ConversionTagsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("conversionTagsCreate").handler(this::conversionTagsCreate);
        builder.operation("conversionTagsGet").handler(this::conversionTagsGet);
        builder.operation("conversionTagsList").handler(this::conversionTagsList);
        builder.operation("ocpmEligibleConversionTagsGet").handler(this::ocpmEligibleConversionTagsGet);
        builder.operation("pageVisitConversionTagsGet").handler(this::pageVisitConversionTagsGet);
    }

    private void conversionTagsCreate(RoutingContext routingContext) {
        logger.info("conversionTagsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ConversionTagCreate conversionTagCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConversionTagCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionTagCreate is {}", conversionTagCreate);

        api.conversionTagsCreate(adAccountId, conversionTagCreate)
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

    private void conversionTagsGet(RoutingContext routingContext) {
        logger.info("conversionTagsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String conversionTagId = requestParameters.pathParameter("conversion_tag_id") != null ? requestParameters.pathParameter("conversion_tag_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter conversionTagId is {}", conversionTagId);

        api.conversionTagsGet(adAccountId, conversionTagId)
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

    private void conversionTagsList(RoutingContext routingContext) {
        logger.info("conversionTagsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Boolean filterDeleted = requestParameters.queryParameter("filter_deleted") != null ? requestParameters.queryParameter("filter_deleted").getBoolean() : false;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter filterDeleted is {}", filterDeleted);

        api.conversionTagsList(adAccountId, filterDeleted)
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

    private void ocpmEligibleConversionTagsGet(RoutingContext routingContext) {
        logger.info("ocpmEligibleConversionTagsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.ocpmEligibleConversionTagsGet(adAccountId)
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

    private void pageVisitConversionTagsGet(RoutingContext routingContext) {
        logger.info("pageVisitConversionTagsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)
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
