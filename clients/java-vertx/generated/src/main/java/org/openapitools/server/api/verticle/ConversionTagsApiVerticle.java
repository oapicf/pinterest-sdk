package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.ConversionEventResponse;
import org.openapitools.server.api.model.ConversionTagCreate;
import org.openapitools.server.api.model.ConversionTagListResponse;
import org.openapitools.server.api.model.ConversionTagResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response;

import java.util.List;
import java.util.Map;

public class ConversionTagsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ConversionTagsApiVerticle.class);

    static final String CONVERSION_TAGS/CREATE_SERVICE_ID = "conversion_tags/create";
    static final String CONVERSION_TAGS/GET_SERVICE_ID = "conversion_tags/get";
    static final String CONVERSION_TAGS/LIST_SERVICE_ID = "conversion_tags/list";
    static final String OCPM_ELIGIBLE_CONVERSION_TAGS/GET_SERVICE_ID = "ocpm_eligible_conversion_tags/get";
    static final String PAGE_VISIT_CONVERSION_TAGS/GET_SERVICE_ID = "page_visit_conversion_tags/get";
    
    final ConversionTagsApi service;

    public ConversionTagsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ConversionTagsApiImpl");
            service = (ConversionTagsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ConversionTagsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for conversion_tags/create
        vertx.eventBus().<JsonObject> consumer(CONVERSION_TAGS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "conversion_tags/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject conversionTagCreateParam = message.body().getJsonObject("ConversionTagCreate");
                if (conversionTagCreateParam == null) {
                    manageError(message, new MainApiException(400, "ConversionTagCreate is required"), serviceId);
                    return;
                }
                ConversionTagCreate conversionTagCreate = Json.mapper.readValue(conversionTagCreateParam.encode(), ConversionTagCreate.class);
                service.conversionTagsCreate(adAccountId, conversionTagCreate, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "conversion_tags/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("conversion_tags/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for conversion_tags/get
        vertx.eventBus().<JsonObject> consumer(CONVERSION_TAGS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "conversion_tags/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String conversionTagIdParam = message.body().getString("conversion_tag_id");
                if(conversionTagIdParam == null) {
                    manageError(message, new MainApiException(400, "conversion_tag_id is required"), serviceId);
                    return;
                }
                String conversionTagId = conversionTagIdParam;
                service.conversionTagsGet(adAccountId, conversionTagId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "conversion_tags/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("conversion_tags/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for conversion_tags/list
        vertx.eventBus().<JsonObject> consumer(CONVERSION_TAGS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "conversion_tags/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String filterDeletedParam = message.body().getString("filter_deleted");
                Boolean filterDeleted = (filterDeletedParam == null) ? false : Json.mapper.readValue(filterDeletedParam, Boolean.class);
                service.conversionTagsList(adAccountId, filterDeleted, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "conversion_tags/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("conversion_tags/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ocpm_eligible_conversion_tags/get
        vertx.eventBus().<JsonObject> consumer(OCPM_ELIGIBLE_CONVERSION_TAGS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ocpm_eligible_conversion_tags/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                service.ocpmEligibleConversionTagsGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ocpm_eligible_conversion_tags/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ocpm_eligible_conversion_tags/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for page_visit_conversion_tags/get
        vertx.eventBus().<JsonObject> consumer(PAGE_VISIT_CONVERSION_TAGS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "page_visit_conversion_tags/get";
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
                service.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "page_visit_conversion_tags/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("page_visit_conversion_tags/get", e);
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
