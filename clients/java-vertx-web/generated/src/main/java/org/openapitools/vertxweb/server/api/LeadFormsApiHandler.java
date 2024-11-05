package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LeadFormArrayResponse;
import org.openapitools.vertxweb.server.model.LeadFormCreateRequest;
import org.openapitools.vertxweb.server.model.LeadFormResponse;
import org.openapitools.vertxweb.server.model.LeadFormTestRequest;
import org.openapitools.vertxweb.server.model.LeadFormTestResponse;
import org.openapitools.vertxweb.server.model.LeadFormUpdateRequest;
import org.openapitools.vertxweb.server.model.LeadFormsList200Response;

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

public class LeadFormsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(LeadFormsApiHandler.class);

    private final LeadFormsApi api;

    public LeadFormsApiHandler(LeadFormsApi api) {
        this.api = api;
    }

    @Deprecated
    public LeadFormsApiHandler() {
        this(new LeadFormsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("leadFormGet").handler(this::leadFormGet);
        builder.operation("leadFormTestCreate").handler(this::leadFormTestCreate);
        builder.operation("leadFormsCreate").handler(this::leadFormsCreate);
        builder.operation("leadFormsList").handler(this::leadFormsList);
        builder.operation("leadFormsUpdate").handler(this::leadFormsUpdate);
    }

    private void leadFormGet(RoutingContext routingContext) {
        logger.info("leadFormGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String leadFormId = requestParameters.pathParameter("lead_form_id") != null ? requestParameters.pathParameter("lead_form_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadFormId is {}", leadFormId);

        api.leadFormGet(adAccountId, leadFormId)
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

    private void leadFormTestCreate(RoutingContext routingContext) {
        logger.info("leadFormTestCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String leadFormId = requestParameters.pathParameter("lead_form_id") != null ? requestParameters.pathParameter("lead_form_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LeadFormTestRequest leadFormTestRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LeadFormTestRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadFormId is {}", leadFormId);
        logger.debug("Parameter leadFormTestRequest is {}", leadFormTestRequest);

        api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)
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

    private void leadFormsCreate(RoutingContext routingContext) {
        logger.info("leadFormsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<LeadFormCreateRequest> leadFormCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<LeadFormCreateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadFormCreateRequest is {}", leadFormCreateRequest);

        api.leadFormsCreate(adAccountId, leadFormCreateRequest)
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

    private void leadFormsList(RoutingContext routingContext) {
        logger.info("leadFormsList()");

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

        api.leadFormsList(adAccountId, pageSize, order, bookmark)
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

    private void leadFormsUpdate(RoutingContext routingContext) {
        logger.info("leadFormsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<LeadFormUpdateRequest> leadFormUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<LeadFormUpdateRequest>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter leadFormUpdateRequest is {}", leadFormUpdateRequest);

        api.leadFormsUpdate(adAccountId, leadFormUpdateRequest)
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
