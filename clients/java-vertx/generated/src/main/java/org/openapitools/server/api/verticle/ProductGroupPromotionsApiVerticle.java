package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionResponse;
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response;

import java.util.List;
import java.util.Map;

public class ProductGroupPromotionsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ProductGroupPromotionsApiVerticle.class);

    static final String PRODUCT_GROUP_PROMOTIONS/CREATE_SERVICE_ID = "product_group_promotions/create";
    static final String PRODUCT_GROUP_PROMOTIONS/GET_SERVICE_ID = "product_group_promotions/get";
    static final String PRODUCT_GROUP_PROMOTIONS/LIST_SERVICE_ID = "product_group_promotions/list";
    static final String PRODUCT_GROUP_PROMOTIONS/UPDATE_SERVICE_ID = "product_group_promotions/update";
    static final String PRODUCT_GROUPS/ANALYTICS_SERVICE_ID = "product_groups/analytics";
    
    final ProductGroupPromotionsApi service;

    public ProductGroupPromotionsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ProductGroupPromotionsApiImpl");
            service = (ProductGroupPromotionsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductGroupPromotionsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for product_group_promotions/create
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUP_PROMOTIONS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_group_promotions/create";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject productGroupPromotionCreateRequestParam = message.body().getJsonObject("ProductGroupPromotionCreateRequest");
                if (productGroupPromotionCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "ProductGroupPromotionCreateRequest is required"), serviceId);
                    return;
                }
                ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest = Json.mapper.readValue(productGroupPromotionCreateRequestParam.encode(), ProductGroupPromotionCreateRequest.class);
                service.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_group_promotions/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_group_promotions/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for product_group_promotions/get
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUP_PROMOTIONS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_group_promotions/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String productGroupPromotionIdParam = message.body().getString("product_group_promotion_id");
                if(productGroupPromotionIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_promotion_id is required"), serviceId);
                    return;
                }
                String productGroupPromotionId = productGroupPromotionIdParam;
                service.productGroupPromotionsGet(adAccountId, productGroupPromotionId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_group_promotions/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_group_promotions/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for product_group_promotions/list
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUP_PROMOTIONS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_group_promotions/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonArray productGroupPromotionIdsParam = message.body().getJsonArray("product_group_promotion_ids");
                List<String> productGroupPromotionIds = (productGroupPromotionIdsParam == null) ? null : Json.mapper.readValue(productGroupPromotionIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray entityStatusesParam = message.body().getJsonArray("entity_statuses");
                List<String> entityStatuses = (entityStatusesParam == null) ? ACTIVE,PAUSED : Json.mapper.readValue(entityStatusesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String adGroupIdParam = message.body().getString("ad_group_id");
                String adGroupId = (adGroupIdParam == null) ? null : adGroupIdParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? null : orderParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                service.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_group_promotions/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_group_promotions/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for product_group_promotions/update
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUP_PROMOTIONS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_group_promotions/update";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                JsonObject productGroupPromotionUpdateRequestParam = message.body().getJsonObject("ProductGroupPromotionUpdateRequest");
                if (productGroupPromotionUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "ProductGroupPromotionUpdateRequest is required"), serviceId);
                    return;
                }
                ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = Json.mapper.readValue(productGroupPromotionUpdateRequestParam.encode(), ProductGroupPromotionUpdateRequest.class);
                service.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_group_promotions/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_group_promotions/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for product_groups/analytics
        vertx.eventBus().<JsonObject> consumer(PRODUCT_GROUPS/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "product_groups/analytics";
                String adAccountIdParam = message.body().getString("ad_account_id");
                if(adAccountIdParam == null) {
                    manageError(message, new MainApiException(400, "ad_account_id is required"), serviceId);
                    return;
                }
                String adAccountId = adAccountIdParam;
                String startDateParam = message.body().getString("start_date");
                if(startDateParam == null) {
                    manageError(message, new MainApiException(400, "start_date is required"), serviceId);
                    return;
                }
                LocalDate startDate = Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                if(endDateParam == null) {
                    manageError(message, new MainApiException(400, "end_date is required"), serviceId);
                    return;
                }
                LocalDate endDate = Json.mapper.readValue(endDateParam, LocalDate.class);
                JsonArray productGroupIdsParam = message.body().getJsonArray("product_group_ids");
                if(productGroupIdsParam == null) {
                    manageError(message, new MainApiException(400, "product_group_ids is required"), serviceId);
                    return;
                }
                List<String> productGroupIds = Json.mapper.readValue(productGroupIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray columnsParam = message.body().getJsonArray("columns");
                if(columnsParam == null) {
                    manageError(message, new MainApiException(400, "columns is required"), serviceId);
                    return;
                }
                List<String> columns = Json.mapper.readValue(columnsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject granularityParam = message.body().getJsonObject("granularity");
                if (granularityParam == null) {
                    manageError(message, new MainApiException(400, "granularity is required"), serviceId);
                    return;
                }
                Granularity granularity = Json.mapper.readValue(granularityParam.encode(), Granularity.class);
                String clickWindowDaysParam = message.body().getString("click_window_days");
                Integer clickWindowDays = (clickWindowDaysParam == null) ? 30 : Json.mapper.readValue(clickWindowDaysParam, Integer.class);
                String engagementWindowDaysParam = message.body().getString("engagement_window_days");
                Integer engagementWindowDays = (engagementWindowDaysParam == null) ? 30 : Json.mapper.readValue(engagementWindowDaysParam, Integer.class);
                String viewWindowDaysParam = message.body().getString("view_window_days");
                Integer viewWindowDays = (viewWindowDaysParam == null) ? 1 : Json.mapper.readValue(viewWindowDaysParam, Integer.class);
                String conversionReportTimeParam = message.body().getString("conversion_report_time");
                String conversionReportTime = (conversionReportTimeParam == null) ? "TIME_OF_AD_ACTION" : conversionReportTimeParam;
                service.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "product_groups/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("product_groups/analytics", e);
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
