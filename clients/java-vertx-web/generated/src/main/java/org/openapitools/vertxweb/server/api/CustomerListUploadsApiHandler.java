package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerListUpload;
import org.openapitools.vertxweb.server.model.CustomerListUploadCreateRequest;
import org.openapitools.vertxweb.server.model.CustomerListUploadCreateResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;

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

public class CustomerListUploadsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomerListUploadsApiHandler.class);

    private final CustomerListUploadsApi api;

    public CustomerListUploadsApiHandler(CustomerListUploadsApi api) {
        this.api = api;
    }

    @Deprecated
    public CustomerListUploadsApiHandler() {
        this(new CustomerListUploadsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("customerListUploadsCreate").handler(this::customerListUploadsCreate);
        builder.operation("customerListUploadsGet").handler(this::customerListUploadsGet);
        builder.operation("customerListUploadsRun").handler(this::customerListUploadsRun);
    }

    private void customerListUploadsCreate(RoutingContext routingContext) {
        logger.info("customerListUploadsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String customerListId = requestParameters.pathParameter("customer_list_id") != null ? requestParameters.pathParameter("customer_list_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CustomerListUploadCreateRequest customerListUploadCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CustomerListUploadCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListId is {}", customerListId);
        logger.debug("Parameter customerListUploadCreateRequest is {}", customerListUploadCreateRequest);

        api.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)
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

    private void customerListUploadsGet(RoutingContext routingContext) {
        logger.info("customerListUploadsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String customerListId = requestParameters.pathParameter("customer_list_id") != null ? requestParameters.pathParameter("customer_list_id").getString() : null;
        String customerListUploadId = requestParameters.pathParameter("customer_list_upload_id") != null ? requestParameters.pathParameter("customer_list_upload_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListId is {}", customerListId);
        logger.debug("Parameter customerListUploadId is {}", customerListUploadId);

        api.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
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

    private void customerListUploadsRun(RoutingContext routingContext) {
        logger.info("customerListUploadsRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String customerListId = requestParameters.pathParameter("customer_list_id") != null ? requestParameters.pathParameter("customer_list_id").getString() : null;
        String customerListUploadId = requestParameters.pathParameter("customer_list_upload_id") != null ? requestParameters.pathParameter("customer_list_upload_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListId is {}", customerListId);
        logger.debug("Parameter customerListUploadId is {}", customerListUploadId);

        api.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
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
