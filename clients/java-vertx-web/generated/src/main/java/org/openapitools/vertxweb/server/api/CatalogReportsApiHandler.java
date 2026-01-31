package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsCreateReportResponse;
import org.openapitools.vertxweb.server.model.CatalogsReport;
import org.openapitools.vertxweb.server.model.CatalogsReportParameters;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.ReportsStats200Response;
import org.openapitools.vertxweb.server.model.ReportsStatsParametersParameter;

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

public class CatalogReportsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogReportsApiHandler.class);

    private final CatalogReportsApi api;

    public CatalogReportsApiHandler(CatalogReportsApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogReportsApiHandler() {
        this(new CatalogReportsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("reportsCreate").handler(this::reportsCreate);
        builder.operation("reportsGet").handler(this::reportsGet);
        builder.operation("reportsStats").handler(this::reportsStats);
    }

    private void reportsCreate(RoutingContext routingContext) {
        logger.info("reportsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CatalogsReportParameters catalogsReportParameters = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CatalogsReportParameters>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter catalogsReportParameters is {}", catalogsReportParameters);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.reportsCreate(catalogsReportParameters, adAccountId)
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

    private void reportsGet(RoutingContext routingContext) {
        logger.info("reportsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String token = requestParameters.queryParameter("token") != null ? requestParameters.queryParameter("token").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter token is {}", token);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.reportsGet(token, adAccountId)
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

    private void reportsStats(RoutingContext routingContext) {
        logger.info("reportsStats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        ReportsStatsParametersParameter parameters = requestParameters.queryParameter("parameters") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("parameters").get(), new TypeReference<ReportsStatsParametersParameter>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter parameters is {}", parameters);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.reportsStats(parameters, adAccountId, pageSize, bookmark)
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
