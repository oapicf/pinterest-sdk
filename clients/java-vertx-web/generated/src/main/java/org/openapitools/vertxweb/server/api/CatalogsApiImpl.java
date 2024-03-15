package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationIssue;
import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsFilters;
import org.openapitools.vertxweb.server.model.CatalogsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupProductCounts;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsCreate201Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.FeedProcessingResultsList200Response;
import org.openapitools.vertxweb.server.model.FeedsCreateRequest;
import org.openapitools.vertxweb.server.model.FeedsList200Response;
import org.openapitools.vertxweb.server.model.FeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.ItemsBatchPostRequest;
import org.openapitools.vertxweb.server.model.ItemsIssuesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogsApiImpl implements CatalogsApi {
    public Future<ApiResponse<CatalogsList200Response>> catalogsList(String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsCreate201Response>> catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> catalogsProductGroupsDelete(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsCreate201Response>> catalogsProductGroupsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsList200Response>> catalogsProductGroupsList(String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupProductCounts>> catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsCreate201Response>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FeedProcessingResultsList200Response>> feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsCreate(FeedsCreateRequest feedsCreateRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> feedsDelete(String feedId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsGet(String feedId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FeedsList200Response>> feedsList(String bookmark, Integer pageSize, String catalogId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsUpdate(String feedId, FeedsUpdateRequest feedsUpdateRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsItems>> itemsGet(String country, String language, String adAccountId, List<String> itemIds, CatalogsItemsFilters filters) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemsIssuesList200Response>> itemsIssuesList(String processingResultId, String bookmark, Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
