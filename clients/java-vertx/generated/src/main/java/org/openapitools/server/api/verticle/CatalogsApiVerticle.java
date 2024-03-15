package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CatalogsFeed;
import org.openapitools.server.api.model.CatalogsItemValidationIssue;
import org.openapitools.server.api.model.CatalogsItems;
import org.openapitools.server.api.model.CatalogsItemsBatch;
import org.openapitools.server.api.model.CatalogsItemsFilters;
import org.openapitools.server.api.model.CatalogsList200Response;
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest;
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.server.api.model.CatalogsProductGroupProductCounts;
import org.openapitools.server.api.model.CatalogsProductGroupsCreate201Response;
import org.openapitools.server.api.model.CatalogsProductGroupsCreateRequest;
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response;
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.FeedProcessingResultsList200Response;
import org.openapitools.server.api.model.FeedsCreateRequest;
import org.openapitools.server.api.model.FeedsList200Response;
import org.openapitools.server.api.model.FeedsUpdateRequest;
import org.openapitools.server.api.model.ItemsBatchPostRequest;
import org.openapitools.server.api.model.ItemsIssuesList200Response;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CatalogsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CatalogsApiVerticle.class);

    static final String CATALOGS/LIST_SERVICE_ID = "catalogs/list";
    static final String CATALOGS_PRODUCT_GROUP_PINS/LIST_SERVICE_ID = "catalogs_product_group_pins/list";
    static final String CATALOGS_PRODUCT_GROUPS/CREATE_SERVICE_ID = "catalogs_product_groups/create";
    static final String CATALOGS_PRODUCT_GROUPS/DELETE_SERVICE_ID = "catalogs_product_groups/delete";
    static final String CATALOGS_PRODUCT_GROUPS/GET_SERVICE_ID = "catalogs_product_groups/get";
    static final String CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID = "catalogs_product_groups/list";
    static final String CATALOGS_PRODUCT_GROUPS/PRODUCT_COUNTS_GET_SERVICE_ID = "catalogs_product_groups/product_counts_get";
    static final String CATALOGS_PRODUCT_GROUPS/UPDATE_SERVICE_ID = "catalogs_product_groups/update";
    static final String FEED_PROCESSING_RESULTS/LIST_SERVICE_ID = "feed_processing_results/list";
    static final String FEEDS/CREATE_SERVICE_ID = "feeds/create";
    static final String FEEDS/DELETE_SERVICE_ID = "feeds/delete";
    static final String FEEDS/GET_SERVICE_ID = "feeds/get";
    static final String FEEDS/LIST_SERVICE_ID = "feeds/list";
    static final String FEEDS/UPDATE_SERVICE_ID = "feeds/update";
    static final String ITEMS_BATCH/GET_SERVICE_ID = "items_batch/get";
    static final String ITEMS_BATCH/POST_SERVICE_ID = "items_batch/post";
    static final String ITEMS/GET_SERVICE_ID = "items/get";
    static final String ITEMS_ISSUES/LIST_SERVICE_ID = "items_issues/list";
    static final String PRODUCTS_BY_PRODUCT_GROUP_FILTER/LIST_SERVICE_ID = "products_by_product_group_filter/list";
    
    final CatalogsApi service;

    public CatalogsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CatalogsApiImpl");
            service = (CatalogsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CatalogsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for catalogs/list
        vertx.eventBus().<JsonObject> consumer(CATALOGS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsList(bookmark, pageSize, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_group_pins/list
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUP_PINS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_group_pins/list";
                String productGroupIdParam = message.body().getString("product_group_id");
                if(productGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_id is required"), serviceId);
                    return;
                }
                String productGroupId = productGroupIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_group_pins/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_group_pins/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/create
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/create";
                JsonObject catalogsProductGroupsCreateRequestParam = message.body().getJsonObject("CatalogsProductGroupsCreateRequest");
                if (catalogsProductGroupsCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsProductGroupsCreateRequest is required"), serviceId);
                    return;
                }
                CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest = Json.mapper.readValue(catalogsProductGroupsCreateRequestParam.encode(), CatalogsProductGroupsCreateRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/delete
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/delete";
                String productGroupIdParam = message.body().getString("product_group_id");
                if(productGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_id is required"), serviceId);
                    return;
                }
                String productGroupId = productGroupIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsDelete(productGroupId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/get
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/get";
                String productGroupIdParam = message.body().getString("product_group_id");
                if(productGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_id is required"), serviceId);
                    return;
                }
                String productGroupId = productGroupIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsGet(productGroupId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/list
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/list";
                String feedIdParam = message.body().getString("feed_id");
                String feedId = (feedIdParam == null) ? null : feedIdParam;
                String catalogIdParam = message.body().getString("catalog_id");
                String catalogId = (catalogIdParam == null) ? null : catalogIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/product_counts_get
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/PRODUCT_COUNTS_GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/product_counts_get";
                String productGroupIdParam = message.body().getString("product_group_id");
                if(productGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_id is required"), serviceId);
                    return;
                }
                String productGroupId = productGroupIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/product_counts_get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/product_counts_get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for catalogs_product_groups/update
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/update";
                String productGroupIdParam = message.body().getString("product_group_id");
                if(productGroupIdParam == null) {
                    manageError(message, new MainApiException(400, "product_group_id is required"), serviceId);
                    return;
                }
                String productGroupId = productGroupIdParam;
                JsonObject catalogsProductGroupsUpdateRequestParam = message.body().getJsonObject("CatalogsProductGroupsUpdateRequest");
                if (catalogsProductGroupsUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsProductGroupsUpdateRequest is required"), serviceId);
                    return;
                }
                CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = Json.mapper.readValue(catalogsProductGroupsUpdateRequestParam.encode(), CatalogsProductGroupsUpdateRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "catalogs_product_groups/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("catalogs_product_groups/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feed_processing_results/list
        vertx.eventBus().<JsonObject> consumer(FEED_PROCESSING_RESULTS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feed_processing_results/list";
                String feedIdParam = message.body().getString("feed_id");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feed_id is required"), serviceId);
                    return;
                }
                String feedId = feedIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feed_processing_results/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feed_processing_results/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feeds/create
        vertx.eventBus().<JsonObject> consumer(FEEDS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feeds/create";
                JsonObject feedsCreateRequestParam = message.body().getJsonObject("FeedsCreateRequest");
                if (feedsCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "FeedsCreateRequest is required"), serviceId);
                    return;
                }
                FeedsCreateRequest feedsCreateRequest = Json.mapper.readValue(feedsCreateRequestParam.encode(), FeedsCreateRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedsCreate(feedsCreateRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feeds/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feeds/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feeds/delete
        vertx.eventBus().<JsonObject> consumer(FEEDS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feeds/delete";
                String feedIdParam = message.body().getString("feed_id");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feed_id is required"), serviceId);
                    return;
                }
                String feedId = feedIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedsDelete(feedId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feeds/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feeds/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feeds/get
        vertx.eventBus().<JsonObject> consumer(FEEDS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feeds/get";
                String feedIdParam = message.body().getString("feed_id");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feed_id is required"), serviceId);
                    return;
                }
                String feedId = feedIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedsGet(feedId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feeds/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feeds/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feeds/list
        vertx.eventBus().<JsonObject> consumer(FEEDS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feeds/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String catalogIdParam = message.body().getString("catalog_id");
                String catalogId = (catalogIdParam == null) ? null : catalogIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedsList(bookmark, pageSize, catalogId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feeds/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feeds/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for feeds/update
        vertx.eventBus().<JsonObject> consumer(FEEDS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "feeds/update";
                String feedIdParam = message.body().getString("feed_id");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feed_id is required"), serviceId);
                    return;
                }
                String feedId = feedIdParam;
                JsonObject feedsUpdateRequestParam = message.body().getJsonObject("FeedsUpdateRequest");
                if (feedsUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "FeedsUpdateRequest is required"), serviceId);
                    return;
                }
                FeedsUpdateRequest feedsUpdateRequest = Json.mapper.readValue(feedsUpdateRequestParam.encode(), FeedsUpdateRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.feedsUpdate(feedId, feedsUpdateRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "feeds/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("feeds/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for items_batch/get
        vertx.eventBus().<JsonObject> consumer(ITEMS_BATCH/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "items_batch/get";
                String batchIdParam = message.body().getString("batch_id");
                if(batchIdParam == null) {
                    manageError(message, new MainApiException(400, "batch_id is required"), serviceId);
                    return;
                }
                String batchId = batchIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.itemsBatchGet(batchId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "items_batch/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("items_batch/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for items_batch/post
        vertx.eventBus().<JsonObject> consumer(ITEMS_BATCH/POST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "items_batch/post";
                JsonObject itemsBatchPostRequestParam = message.body().getJsonObject("ItemsBatchPostRequest");
                if (itemsBatchPostRequestParam == null) {
                    manageError(message, new MainApiException(400, "ItemsBatchPostRequest is required"), serviceId);
                    return;
                }
                ItemsBatchPostRequest itemsBatchPostRequest = Json.mapper.readValue(itemsBatchPostRequestParam.encode(), ItemsBatchPostRequest.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.itemsBatchPost(itemsBatchPostRequest, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "items_batch/post");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("items_batch/post", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for items/get
        vertx.eventBus().<JsonObject> consumer(ITEMS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "items/get";
                String countryParam = message.body().getString("country");
                if(countryParam == null) {
                    manageError(message, new MainApiException(400, "country is required"), serviceId);
                    return;
                }
                String country = countryParam;
                String languageParam = message.body().getString("language");
                if(languageParam == null) {
                    manageError(message, new MainApiException(400, "language is required"), serviceId);
                    return;
                }
                String language = languageParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                JsonArray itemIdsParam = message.body().getJsonArray("item_ids");
                List<String> itemIds = (itemIdsParam == null) ? null : Json.mapper.readValue(itemIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject filtersParam = message.body().getJsonObject("filters");
                if (filtersParam == null) {
                    manageError(message, new MainApiException(400, "filters is required"), serviceId);
                    return;
                }
                CatalogsItemsFilters filters = Json.mapper.readValue(filtersParam.encode(), CatalogsItemsFilters.class);
                service.itemsGet(country, language, adAccountId, itemIds, filters, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "items/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("items/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for items_issues/list
        vertx.eventBus().<JsonObject> consumer(ITEMS_ISSUES/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "items_issues/list";
                String processingResultIdParam = message.body().getString("processing_result_id");
                if(processingResultIdParam == null) {
                    manageError(message, new MainApiException(400, "processing_result_id is required"), serviceId);
                    return;
                }
                String processingResultId = processingResultIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                JsonArray itemNumbersParam = message.body().getJsonArray("item_numbers");
                List<Integer> itemNumbers = (itemNumbersParam == null) ? null : Json.mapper.readValue(itemNumbersParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                JsonObject itemValidationIssueParam = message.body().getJsonObject("item_validation_issue");
                if (itemValidationIssueParam == null) {
                    manageError(message, new MainApiException(400, "item_validation_issue is required"), serviceId);
                    return;
                }
                CatalogsItemValidationIssue itemValidationIssue = Json.mapper.readValue(itemValidationIssueParam.encode(), CatalogsItemValidationIssue.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "items_issues/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("items_issues/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for products_by_product_group_filter/list
        vertx.eventBus().<JsonObject> consumer(PRODUCTS_BY_PRODUCT_GROUP_FILTER/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "products_by_product_group_filter/list";
                JsonObject catalogsListProductsByFilterRequestParam = message.body().getJsonObject("CatalogsListProductsByFilterRequest");
                if (catalogsListProductsByFilterRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsListProductsByFilterRequest is required"), serviceId);
                    return;
                }
                CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = Json.mapper.readValue(catalogsListProductsByFilterRequestParam.encode(), CatalogsListProductsByFilterRequest.class);
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "products_by_product_group_filter/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("products_by_product_group_filter/list", e);
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
