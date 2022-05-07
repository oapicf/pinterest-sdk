package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CatalogsFeed;
import org.openapitools.server.api.model.CatalogsFeedsCreateRequest;
import org.openapitools.server.api.model.CatalogsFeedsUpdateRequest;
import org.openapitools.server.api.model.CatalogsItems;
import org.openapitools.server.api.model.CatalogsItemsBatch;
import org.openapitools.server.api.model.CatalogsItemsBatchRequest;
import org.openapitools.server.api.model.CatalogsProductGroup;
import org.openapitools.server.api.model.CatalogsProductGroupCreateRequest;
import org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Paginated;

import java.util.List;
import java.util.Map;

public class CatalogsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CatalogsApiVerticle.class);

    static final String CATALOGS_PRODUCT_GROUPS/CREATE_SERVICE_ID = "catalogs_product_groups/create";
    static final String CATALOGS_PRODUCT_GROUPS/DELETE_SERVICE_ID = "catalogs_product_groups/delete";
    static final String CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID = "catalogs_product_groups/list";
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
        
        //Consumer for catalogs_product_groups/create
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/create";
                JsonObject catalogsProductGroupCreateRequestParam = message.body().getJsonObject("CatalogsProductGroupCreateRequest");
                if (catalogsProductGroupCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsProductGroupCreateRequest is required"), serviceId);
                    return;
                }
                CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = Json.mapper.readValue(catalogsProductGroupCreateRequestParam.encode(), CatalogsProductGroupCreateRequest.class);
                service.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest, result -> {
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
                service.catalogsProductGroupsDelete(productGroupId, result -> {
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
        
        //Consumer for catalogs_product_groups/list
        vertx.eventBus().<JsonObject> consumer(CATALOGS_PRODUCT_GROUPS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "catalogs_product_groups/list";
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
                service.catalogsProductGroupsList(feedId, bookmark, pageSize, result -> {
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
                JsonObject catalogsProductGroupUpdateRequestParam = message.body().getJsonObject("CatalogsProductGroupUpdateRequest");
                if (catalogsProductGroupUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsProductGroupUpdateRequest is required"), serviceId);
                    return;
                }
                CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = Json.mapper.readValue(catalogsProductGroupUpdateRequestParam.encode(), CatalogsProductGroupUpdateRequest.class);
                service.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest, result -> {
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
                service.feedProcessingResultsList(feedId, bookmark, pageSize, result -> {
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
                JsonObject catalogsFeedsCreateRequestParam = message.body().getJsonObject("CatalogsFeedsCreateRequest");
                if (catalogsFeedsCreateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsFeedsCreateRequest is required"), serviceId);
                    return;
                }
                CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = Json.mapper.readValue(catalogsFeedsCreateRequestParam.encode(), CatalogsFeedsCreateRequest.class);
                service.feedsCreate(catalogsFeedsCreateRequest, result -> {
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
                service.feedsDelete(feedId, result -> {
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
                service.feedsGet(feedId, result -> {
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
                service.feedsList(bookmark, pageSize, result -> {
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
                JsonObject catalogsFeedsUpdateRequestParam = message.body().getJsonObject("CatalogsFeedsUpdateRequest");
                if (catalogsFeedsUpdateRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsFeedsUpdateRequest is required"), serviceId);
                    return;
                }
                CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = Json.mapper.readValue(catalogsFeedsUpdateRequestParam.encode(), CatalogsFeedsUpdateRequest.class);
                service.feedsUpdate(feedId, catalogsFeedsUpdateRequest, result -> {
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
                service.itemsBatchGet(batchId, result -> {
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
                JsonObject catalogsItemsBatchRequestParam = message.body().getJsonObject("CatalogsItemsBatchRequest");
                if (catalogsItemsBatchRequestParam == null) {
                    manageError(message, new MainApiException(400, "CatalogsItemsBatchRequest is required"), serviceId);
                    return;
                }
                CatalogsItemsBatchRequest catalogsItemsBatchRequest = Json.mapper.readValue(catalogsItemsBatchRequestParam.encode(), CatalogsItemsBatchRequest.class);
                service.itemsBatchPost(catalogsItemsBatchRequest, result -> {
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
                JsonArray itemIdsParam = message.body().getJsonArray("item_ids");
                if(itemIdsParam == null) {
                    manageError(message, new MainApiException(400, "item_ids is required"), serviceId);
                    return;
                }
                List<String> itemIds = Json.mapper.readValue(itemIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String languageParam = message.body().getString("language");
                if(languageParam == null) {
                    manageError(message, new MainApiException(400, "language is required"), serviceId);
                    return;
                }
                String language = languageParam;
                service.itemsGet(country, itemIds, language, result -> {
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
