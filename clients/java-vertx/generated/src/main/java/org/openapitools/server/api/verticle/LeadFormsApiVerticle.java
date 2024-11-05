package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadFormArrayResponse;
import org.openapitools.server.api.model.LeadFormCreateRequest;
import org.openapitools.server.api.model.LeadFormResponse;
import org.openapitools.server.api.model.LeadFormTestRequest;
import org.openapitools.server.api.model.LeadFormTestResponse;
import org.openapitools.server.api.model.LeadFormUpdateRequest;
import org.openapitools.server.api.model.LeadFormsList200Response;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class LeadFormsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(LeadFormsApiVerticle.class);

    static final String LEAD_FORM/GET_SERVICE_ID = "lead_form/get";
    static final String LEAD_FORM_TEST/CREATE_SERVICE_ID = "lead_form_test/create";
    static final String LEAD_FORMS/CREATE_SERVICE_ID = "lead_forms/create";
    static final String LEAD_FORMS/LIST_SERVICE_ID = "lead_forms/list";
    static final String LEAD_FORMS/UPDATE_SERVICE_ID = "lead_forms/update";
    
    final LeadFormsApi service;

    public LeadFormsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.LeadFormsApiImpl");
            service = (LeadFormsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("LeadFormsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for lead_form/get
        vertx.eventBus().<JsonObject> consumer(LEAD_FORM/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_form/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String leadFormIdParam = message.body().getString("lead_form_id");
                if(leadFormIdParam == null) {
                    manageError(message, new MainApiException(400, "lead_form_id is required"), serviceId);
                    return;
                }
                String leadFormId = leadFormIdParam;
                service.leadFormGet(adAccountId, leadFormId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_form/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_form/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for lead_form_test/create
        vertx.eventBus().<JsonObject> consumer(LEAD_FORM_TEST/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_form_test/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String leadFormIdParam = message.body().getString("lead_form_id");
                if(leadFormIdParam == null) {
                    manageError(message, new MainApiException(400, "lead_form_id is required"), serviceId);
                    return;
                }
                String leadFormId = leadFormIdParam;
                JsonObject leadFormTestRequestParam = message.body().getJsonObject("LeadFormTestRequest");
                if (leadFormTestRequestParam == null) {
                    manageError(message, new MainApiException(400, "LeadFormTestRequest is required"), serviceId);
                    return;
                }
                LeadFormTestRequest leadFormTestRequest = Json.mapper.readValue(leadFormTestRequestParam.encode(), LeadFormTestRequest.class);
                service.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_form_test/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_form_test/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for lead_forms/create
        vertx.eventBus().<JsonObject> consumer(LEAD_FORMS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_forms/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray leadFormCreateRequestParam = message.body().getJsonArray("LeadFormCreateRequest");
                if(leadFormCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "LeadFormCreateRequest is required"), serviceId);
                    return;
                }
                List<LeadFormCreateRequest> leadFormCreateRequest = Json.mapper.readValue(leadFormCreateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, LeadFormCreateRequest.class));
                service.leadFormsCreate(adAccountId, leadFormCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_forms/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_forms/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for lead_forms/list
        vertx.eventBus().<JsonObject> consumer(LEAD_FORMS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_forms/list";
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
                service.leadFormsList(adAccountId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_forms/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_forms/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for lead_forms/update
        vertx.eventBus().<JsonObject> consumer(LEAD_FORMS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "lead_forms/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray leadFormUpdateRequestParam = message.body().getJsonArray("LeadFormUpdateRequest");
                if(leadFormUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "LeadFormUpdateRequest is required"), serviceId);
                    return;
                }
                List<LeadFormUpdateRequest> leadFormUpdateRequest = Json.mapper.readValue(leadFormUpdateRequestParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, LeadFormUpdateRequest.class));
                service.leadFormsUpdate(adAccountId, leadFormUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "lead_forms/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("lead_forms/update", e);
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
