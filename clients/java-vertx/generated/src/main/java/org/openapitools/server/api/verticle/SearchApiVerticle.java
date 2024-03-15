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
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.SearchPartnerPins200Response;
import org.openapitools.server.api.model.SearchUserBoardsGet200Response;

import java.util.List;
import java.util.Map;

public class SearchApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(SearchApiVerticle.class);

    static final String SEARCH_PARTNER_PINS_SERVICE_ID = "search_partner_pins";
    static final String SEARCH_USER_BOARDS/GET_SERVICE_ID = "search_user_boards/get";
    static final String SEARCH_USER_PINS/LIST_SERVICE_ID = "search_user_pins/list";
    
    final SearchApi service;

    public SearchApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.SearchApiImpl");
            service = (SearchApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SearchApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for search_partner_pins
        vertx.eventBus().<JsonObject> consumer(SEARCH_PARTNER_PINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "search_partner_pins";
                String termParam = message.body().getString("term");
                if(termParam == null) {
                    manageError(message, new MainApiException(400, "term is required"), serviceId);
                    return;
                }
                String term = termParam;
                String countryCodeParam = message.body().getString("country_code");
                if(countryCodeParam == null) {
                    manageError(message, new MainApiException(400, "country_code is required"), serviceId);
                    return;
                }
                String countryCode = countryCodeParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String localeParam = message.body().getString("locale");
                String locale = (localeParam == null) ? null : localeParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 10 : Json.mapper.readValue(limitParam, Integer.class);
                service.searchPartnerPins(term, countryCode, bookmark, locale, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "search_partner_pins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("search_partner_pins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for search_user_boards/get
        vertx.eventBus().<JsonObject> consumer(SEARCH_USER_BOARDS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "search_user_boards/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String queryParam = message.body().getString("query");
                String query = (queryParam == null) ? null : queryParam;
                service.searchUserBoardsGet(adAccountId, bookmark, pageSize, query, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "search_user_boards/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("search_user_boards/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for search_user_pins/list
        vertx.eventBus().<JsonObject> consumer(SEARCH_USER_PINS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "search_user_pins/list";
                String queryParam = message.body().getString("query");
                if(queryParam == null) {
                    manageError(message, new MainApiException(400, "query is required"), serviceId);
                    return;
                }
                String query = queryParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.searchUserPinsList(query, adAccountId, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "search_user_pins/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("search_user_pins/list", e);
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
