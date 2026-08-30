package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerList;
import org.openapitools.vertxweb.server.model.CustomerListCreate;
import org.openapitools.vertxweb.server.model.CustomerListUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.CustomerListsList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

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

public class CustomerListsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomerListsApiHandler.class);

    private final CustomerListsApi api;

    public CustomerListsApiHandler(CustomerListsApi api) {
        this.api = api;
    }

    @Deprecated
    public CustomerListsApiHandler() {
        this(new CustomerListsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("customerListsCreate").handler(this::customerListsCreate);
        builder.operation("customerListsGet").handler(this::customerListsGet);
        builder.operation("customerListsList").handler(this::customerListsList);
        builder.operation("customerListsUpdate").handler(this::customerListsUpdate);
    }

    private void customerListsCreate(RoutingContext routingContext) {
        logger.info("customerListsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CustomerListCreate customerListCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CustomerListCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListCreate is {}", customerListCreate);

        api.customerListsCreate(adAccountId, customerListCreate)
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

    private void customerListsGet(RoutingContext routingContext) {
        logger.info("customerListsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String customerListId = requestParameters.pathParameter("customer_list_id") != null ? requestParameters.pathParameter("customer_list_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListId is {}", customerListId);

        api.customerListsGet(adAccountId, customerListId)
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

    private void customerListsList(RoutingContext routingContext) {
        logger.info("customerListsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        Boolean excludeNca = requestParameters.queryParameter("exclude_nca") != null ? requestParameters.queryParameter("exclude_nca").getBoolean() : false;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter excludeNca is {}", excludeNca);

        api.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)
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

    private void customerListsUpdate(RoutingContext routingContext) {
        logger.info("customerListsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String customerListId = requestParameters.pathParameter("customer_list_id") != null ? requestParameters.pathParameter("customer_list_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CustomerListUpdateWithRequiredBody>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerListId is {}", customerListId);
        logger.debug("Parameter customerListUpdateWithRequiredBody is {}", customerListUpdateWithRequiredBody);

        api.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)
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
