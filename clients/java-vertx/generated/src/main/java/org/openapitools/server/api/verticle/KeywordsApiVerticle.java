package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.KeywordUpdateBody;
import org.openapitools.server.api.model.KeywordsGet200Response;
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse;
import org.openapitools.server.api.model.KeywordsRequest;
import org.openapitools.server.api.model.KeywordsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MatchType;
import org.openapitools.server.api.model.TrendType;
import org.openapitools.server.api.model.TrendingKeywordsResponse;
import org.openapitools.server.api.model.TrendsSupportedRegion;

import java.util.List;
import java.util.Map;

public class KeywordsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(KeywordsApiVerticle.class);

    static final String COUNTRY_KEYWORDS_METRICS/GET_SERVICE_ID = "country_keywords_metrics/get";
    static final String KEYWORDS/CREATE_SERVICE_ID = "keywords/create";
    static final String KEYWORDS/GET_SERVICE_ID = "keywords/get";
    static final String KEYWORDS/UPDATE_SERVICE_ID = "keywords/update";
    static final String TRENDING_KEYWORDS/LIST_SERVICE_ID = "trending_keywords/list";
    
    final KeywordsApi service;

    public KeywordsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.KeywordsApiImpl");
            service = (KeywordsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("KeywordsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for country_keywords_metrics/get
        vertx.eventBus().<JsonObject> consumer(COUNTRY_KEYWORDS_METRICS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "country_keywords_metrics/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String countryCodeParam = message.body().getString("country_code");
                if(countryCodeParam == null) {
                    manageError(message, new MainApiException(400, "country_code is required"), serviceId);
                    return;
                }
                String countryCode = countryCodeParam;
                JsonArray keywordsParam = message.body().getJsonArray("keywords");
                if(keywordsParam == null) {
                    manageError(message, new MainApiException(400, "keywords is required"), serviceId);
                    return;
                }
                List<String> keywords = Json.mapper.readValue(keywordsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.countryKeywordsMetricsGet(adAccountId, countryCode, keywords, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "country_keywords_metrics/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("country_keywords_metrics/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for keywords/create
        vertx.eventBus().<JsonObject> consumer(KEYWORDS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "keywords/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject keywordsRequestParam = message.body().getJsonObject("KeywordsRequest");
                if (keywordsRequestParam == null) {
                    manageError(message, new MainApiException(400, "KeywordsRequest is required"), serviceId);
                    return;
                }
                KeywordsRequest keywordsRequest = Json.mapper.readValue(keywordsRequestParam.encode(), KeywordsRequest.class);
                service.keywordsCreate(adAccountId, keywordsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "keywords/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("keywords/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for keywords/get
        vertx.eventBus().<JsonObject> consumer(KEYWORDS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "keywords/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String campaignIdParam = message.body().getString("campaign_id");
                String campaignId = (campaignIdParam == null) ? null : campaignIdParam;
                String adGroupIdParam = message.body().getString("ad_group_id");
                String adGroupId = (adGroupIdParam == null) ? null : adGroupIdParam;
                JsonArray matchTypesParam = message.body().getJsonArray("match_types");
                List<MatchType> matchTypes = (matchTypesParam == null) ? null : Json.mapper.readValue(matchTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, MatchType.class));
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.keywordsGet(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "keywords/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("keywords/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for keywords/update
        vertx.eventBus().<JsonObject> consumer(KEYWORDS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "keywords/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject keywordUpdateBodyParam = message.body().getJsonObject("KeywordUpdateBody");
                if (keywordUpdateBodyParam == null) {
                    manageError(message, new MainApiException(400, "KeywordUpdateBody is required"), serviceId);
                    return;
                }
                KeywordUpdateBody keywordUpdateBody = Json.mapper.readValue(keywordUpdateBodyParam.encode(), KeywordUpdateBody.class);
                service.keywordsUpdate(adAccountId, keywordUpdateBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "keywords/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("keywords/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for trending_keywords/list
        vertx.eventBus().<JsonObject> consumer(TRENDING_KEYWORDS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "trending_keywords/list";
                JsonObject regionParam = message.body().getJsonObject("region");
                if (regionParam == null) {
                    manageError(message, new MainApiException(400, "region is required"), serviceId);
                    return;
                }
                TrendsSupportedRegion region = Json.mapper.readValue(regionParam.encode(), TrendsSupportedRegion.class);
                JsonObject trendTypeParam = message.body().getJsonObject("trend_type");
                if (trendTypeParam == null) {
                    manageError(message, new MainApiException(400, "trend_type is required"), serviceId);
                    return;
                }
                TrendType trendType = Json.mapper.readValue(trendTypeParam.encode(), TrendType.class);
                JsonArray interestsParam = message.body().getJsonArray("interests");
                List<String> interests = (interestsParam == null) ? null : Json.mapper.readValue(interestsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray gendersParam = message.body().getJsonArray("genders");
                List<String> genders = (gendersParam == null) ? null : Json.mapper.readValue(gendersParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray agesParam = message.body().getJsonArray("ages");
                List<String> ages = (agesParam == null) ? null : Json.mapper.readValue(agesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String normalizeAgainstGroupParam = message.body().getString("normalize_against_group");
                Boolean normalizeAgainstGroup = (normalizeAgainstGroupParam == null) ? false : Json.mapper.readValue(normalizeAgainstGroupParam, Boolean.class);
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 50 : Json.mapper.readValue(limitParam, Integer.class);
                service.trendingKeywordsList(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "trending_keywords/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("trending_keywords/list", e);
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
