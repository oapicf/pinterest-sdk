package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CustomerList;
import org.openapitools.server.api.model.CustomerListRequest;
import org.openapitools.server.api.model.CustomerListUpdateRequest;
import org.openapitools.server.api.model.CustomerListsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CustomerListsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CustomerListsApiVerticle.class);

    static final String CUSTOMER_LISTS/CREATE_SERVICE_ID = "customer_lists/create";
    static final String CUSTOMER_LISTS/GET_SERVICE_ID = "customer_lists/get";
    static final String CUSTOMER_LISTS/LIST_SERVICE_ID = "customer_lists/list";
    static final String CUSTOMER_LISTS/UPDATE_SERVICE_ID = "customer_lists/update";
    
    final CustomerListsApi service;

    public CustomerListsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CustomerListsApiImpl");
            service = (CustomerListsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CustomerListsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for customer_lists/create
        vertx.eventBus().<JsonObject> consumer(CUSTOMER_LISTS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "customer_lists/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject customerListRequestParam = message.body().getJsonObject("CustomerListRequest");
                if (customerListRequestParam == null) {
                    manageError(message, new MainApiException(400, "CustomerListRequest is required"), serviceId);
                    return;
                }
                CustomerListRequest customerListRequest = Json.mapper.readValue(customerListRequestParam.encode(), CustomerListRequest.class);
                service.customerListsCreate(adAccountId, customerListRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "customer_lists/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("customer_lists/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for customer_lists/get
        vertx.eventBus().<JsonObject> consumer(CUSTOMER_LISTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "customer_lists/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String customerListIdParam = message.body().getString("customer_list_id");
                if(customerListIdParam == null) {
                    manageError(message, new MainApiException(400, "customer_list_id is required"), serviceId);
                    return;
                }
                String customerListId = customerListIdParam;
                service.customerListsGet(adAccountId, customerListId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "customer_lists/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("customer_lists/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for customer_lists/list
        vertx.eventBus().<JsonObject> consumer(CUSTOMER_LISTS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "customer_lists/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.customerListsList(adAccountId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "customer_lists/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("customer_lists/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for customer_lists/update
        vertx.eventBus().<JsonObject> consumer(CUSTOMER_LISTS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "customer_lists/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String customerListIdParam = message.body().getString("customer_list_id");
                if(customerListIdParam == null) {
                    manageError(message, new MainApiException(400, "customer_list_id is required"), serviceId);
                    return;
                }
                String customerListId = customerListIdParam;
                JsonObject customerListUpdateRequestParam = message.body().getJsonObject("CustomerListUpdateRequest");
                if (customerListUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CustomerListUpdateRequest is required"), serviceId);
                    return;
                }
                CustomerListUpdateRequest customerListUpdateRequest = Json.mapper.readValue(customerListUpdateRequestParam.encode(), CustomerListUpdateRequest.class);
                service.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "customer_lists/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("customer_lists/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
