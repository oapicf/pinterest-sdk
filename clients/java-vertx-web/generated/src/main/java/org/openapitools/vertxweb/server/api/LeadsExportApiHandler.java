package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LeadsExportCreateRequest;
import org.openapitools.vertxweb.server.model.LeadsExportCreateResponse;
import org.openapitools.vertxweb.server.model.LeadsExportResponseData;

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

public class LeadsExportApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(LeadsExportApiHandler.class);

    private final LeadsExportApi api;

    public LeadsExportApiHandler(LeadsExportApi api) {
        this.api = api;
    }

    @Deprecated
    public LeadsExportApiHandler() {
        this(new LeadsExportApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("leadsExportCreate").handler(this::leadsExportCreate);
        builder.operation("leadsExportGet").handler(this::leadsExportGet);
    }

    private void leadsExportCreate(RoutingContext routingContext) {
        logger.info("leadsExportCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LeadsExportCreateRequest leadsExportCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LeadsExportCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadsExportCreateRequest is {}", leadsExportCreateRequest);

        api.leadsExportCreate(adAccountId, leadsExportCreateRequest)
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

    private void leadsExportGet(RoutingContext routingContext) {
        logger.info("leadsExportGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String leadsExportId = requestParameters.pathParameter("leads_export_id") != null ? requestParameters.pathParameter("leads_export_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadsExportId is {}", leadsExportId);

        api.leadsExportGet(adAccountId, leadsExportId)
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
