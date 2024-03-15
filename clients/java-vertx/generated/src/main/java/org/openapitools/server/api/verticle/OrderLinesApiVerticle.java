package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderLine;
import org.openapitools.server.api.model.OrderLinesList200Response;

import java.util.List;
import java.util.Map;

public class OrderLinesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OrderLinesApiVerticle.class);

    static final String ORDER_LINES/GET_SERVICE_ID = "order_lines/get";
    static final String ORDER_LINES/LIST_SERVICE_ID = "order_lines/list";
    
    final OrderLinesApi service;

    public OrderLinesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OrderLinesApiImpl");
            service = (OrderLinesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OrderLinesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for order_lines/get
        vertx.eventBus().<JsonObject> consumer(ORDER_LINES/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "order_lines/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String orderLineIdParam = message.body().getString("order_line_id");
                if(orderLineIdParam == null) {
                    manageError(message, new MainApiException(400, "order_line_id is required"), serviceId);
                    return;
                }
                String orderLineId = orderLineIdParam;
                service.orderLinesGet(adAccountId, orderLineId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "order_lines/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("order_lines/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for order_lines/list
        vertx.eventBus().<JsonObject> consumer(ORDER_LINES/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "order_lines/list";
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
                service.orderLinesList(adAccountId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "order_lines/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("order_lines/list", e);
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
