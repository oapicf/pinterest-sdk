package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedsCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsFeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroup;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Paginated;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogsApiImpl implements CatalogsApi {
    public Future<ApiResponse<Object>> catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> catalogsProductGroupsDelete(String productGroupId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> catalogsProductGroupsList(String feedId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsProductGroup>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> feedProcessingResultsList(String feedId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> feedsDelete(String feedId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsGet(String feedId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> feedsList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<CatalogsItems>> itemsGet(String country, List<String> itemIds, String language) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
