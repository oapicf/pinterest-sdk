package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.server.api.model.AudienceAccountType;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.BusinessSharedAudience;
import org.openapitools.server.api.model.BusinessSharedAudienceResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SharedAudience;
import org.openapitools.server.api.model.SharedAudienceResponse;

import java.util.List;
import java.util.Map;

public class AudienceSharingApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AudienceSharingApiVerticle.class);

    static final String AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS/LIST_SERVICE_ID = "ad_accounts_audiences_shared_accounts/list";
    static final String BUSINESS_ACCOUNT_AUDIENCES_SHARED_ACCOUNTS/LIST_SERVICE_ID = "business_account_audiences_shared_accounts/list";
    static final String SHARED_AUDIENCES_FOR_BUSINESS/LIST_SERVICE_ID = "shared_audiences_for_business/list";
    static final String UPDATE_AD_ACCOUNT_TO_AD_ACCOUNT_SHARED_AUDIENCE_SERVICE_ID = "update_ad_account_to_ad_account_shared_audience";
    static final String UPDATE_AD_ACCOUNT_TO_BUSINESS_SHARED_AUDIENCE_SERVICE_ID = "update_ad_account_to_business_shared_audience";
    static final String UPDATE_BUSINESS_TO_AD_ACCOUNT_SHARED_AUDIENCE_SERVICE_ID = "update_business_to_ad_account_shared_audience";
    static final String UPDATE_BUSINESS_TO_BUSINESS_SHARED_AUDIENCE_SERVICE_ID = "update_business_to_business_shared_audience";
    
    final AudienceSharingApi service;

    public AudienceSharingApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AudienceSharingApiImpl");
            service = (AudienceSharingApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AudienceSharingApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for ad_accounts_audiences_shared_accounts/list
        vertx.eventBus().<JsonObject> consumer(AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ad_accounts_audiences_shared_accounts/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String audienceIdParam = message.body().getString("audience_id");
                if(audienceIdParam == null) {
                    manageError(message, new MainApiException(400, "audience_id is required"), serviceId);
                    return;
                }
                String audienceId = audienceIdParam;
                JsonObject accountTypeParam = message.body().getJsonObject("account_type");
                if (accountTypeParam == null) {
                    manageError(message, new MainApiException(400, "account_type is required"), serviceId);
                    return;
                }
                AudienceAccountType accountType = Json.mapper.readValue(accountTypeParam.encode(), AudienceAccountType.class);
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ad_accounts_audiences_shared_accounts/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ad_accounts_audiences_shared_accounts/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for business_account_audiences_shared_accounts/list
        vertx.eventBus().<JsonObject> consumer(BUSINESS_ACCOUNT_AUDIENCES_SHARED_ACCOUNTS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "business_account_audiences_shared_accounts/list";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String audienceIdParam = message.body().getString("audience_id");
                if(audienceIdParam == null) {
                    manageError(message, new MainApiException(400, "audience_id is required"), serviceId);
                    return;
                }
                String audienceId = audienceIdParam;
                JsonObject accountTypeParam = message.body().getJsonObject("account_type");
                if (accountTypeParam == null) {
                    manageError(message, new MainApiException(400, "account_type is required"), serviceId);
                    return;
                }
                AudienceAccountType accountType = Json.mapper.readValue(accountTypeParam.encode(), AudienceAccountType.class);
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "business_account_audiences_shared_accounts/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("business_account_audiences_shared_accounts/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for shared_audiences_for_business/list
        vertx.eventBus().<JsonObject> consumer(SHARED_AUDIENCES_FOR_BUSINESS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "shared_audiences_for_business/list";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "shared_audiences_for_business/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("shared_audiences_for_business/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_ad_account_to_ad_account_shared_audience
        vertx.eventBus().<JsonObject> consumer(UPDATE_AD_ACCOUNT_TO_AD_ACCOUNT_SHARED_AUDIENCE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_ad_account_to_ad_account_shared_audience";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject sharedAudienceParam = message.body().getJsonObject("SharedAudience");
                if (sharedAudienceParam == null) {
                    manageError(message, new MainApiException(400, "SharedAudience is required"), serviceId);
                    return;
                }
                SharedAudience sharedAudience = Json.mapper.readValue(sharedAudienceParam.encode(), SharedAudience.class);
                service.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_ad_account_to_ad_account_shared_audience");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_ad_account_to_ad_account_shared_audience", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_ad_account_to_business_shared_audience
        vertx.eventBus().<JsonObject> consumer(UPDATE_AD_ACCOUNT_TO_BUSINESS_SHARED_AUDIENCE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_ad_account_to_business_shared_audience";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject businessSharedAudienceParam = message.body().getJsonObject("BusinessSharedAudience");
                if (businessSharedAudienceParam == null) {
                    manageError(message, new MainApiException(400, "BusinessSharedAudience is required"), serviceId);
                    return;
                }
                BusinessSharedAudience businessSharedAudience = Json.mapper.readValue(businessSharedAudienceParam.encode(), BusinessSharedAudience.class);
                service.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_ad_account_to_business_shared_audience");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_ad_account_to_business_shared_audience", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_business_to_ad_account_shared_audience
        vertx.eventBus().<JsonObject> consumer(UPDATE_BUSINESS_TO_AD_ACCOUNT_SHARED_AUDIENCE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_business_to_ad_account_shared_audience";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject sharedAudienceParam = message.body().getJsonObject("SharedAudience");
                if (sharedAudienceParam == null) {
                    manageError(message, new MainApiException(400, "SharedAudience is required"), serviceId);
                    return;
                }
                SharedAudience sharedAudience = Json.mapper.readValue(sharedAudienceParam.encode(), SharedAudience.class);
                service.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_business_to_ad_account_shared_audience");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_business_to_ad_account_shared_audience", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_business_to_business_shared_audience
        vertx.eventBus().<JsonObject> consumer(UPDATE_BUSINESS_TO_BUSINESS_SHARED_AUDIENCE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_business_to_business_shared_audience";
                String businessIdParam = message.body().getString("business_id");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "business_id is required"), serviceId);
                    return;
                }
                String businessId = businessIdParam;
                JsonObject businessSharedAudienceParam = message.body().getJsonObject("BusinessSharedAudience");
                if (businessSharedAudienceParam == null) {
                    manageError(message, new MainApiException(400, "BusinessSharedAudience is required"), serviceId);
                    return;
                }
                BusinessSharedAudience businessSharedAudience = Json.mapper.readValue(businessSharedAudienceParam.encode(), BusinessSharedAudience.class);
                service.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_business_to_business_shared_audience");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_business_to_business_shared_audience", e);
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
