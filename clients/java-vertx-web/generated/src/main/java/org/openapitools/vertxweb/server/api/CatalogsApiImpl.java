package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Catalog;
import org.openapitools.vertxweb.server.model.CatalogsCreateReportResponse;
import org.openapitools.vertxweb.server.model.CatalogsCreateRequest;
import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestion;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationIssue;
import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsFilters;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequest;
import org.openapitools.vertxweb.server.model.CatalogsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsReport;
import org.openapitools.vertxweb.server.model.CatalogsReportParameters;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroup;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.FeedProcessingResultsList200Response;
import org.openapitools.vertxweb.server.model.FeedsCreateRequest;
import org.openapitools.vertxweb.server.model.FeedsList200Response;
import org.openapitools.vertxweb.server.model.FeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.ItemsBatchPostRequest;
import org.openapitools.vertxweb.server.model.ItemsIssuesList200Response;
import org.openapitools.vertxweb.server.model.MultipleProductGroupsInner;
import org.openapitools.vertxweb.server.model.ReportsStats200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogsApiImpl implements CatalogsApi {
    public Future<ApiResponse<Catalog>> catalogsCreate(CatalogsCreateRequest catalogsCreateRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsList200Response>> catalogsList(String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<String>>> catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> catalogsProductGroupsDelete(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> catalogsProductGroupsDeleteMany(List<Integer> id, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsList200Response>> catalogsProductGroupsList(List<Integer> id, String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupProductCountsVertical>> catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId) {
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

    public Future<ApiResponse<CatalogsFeedIngestion>> feedsIngest(String feedId, String adAccountId) {
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

    public Future<ApiResponse<CatalogsItems>> itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsCreateReportResponse>> reportsCreate(CatalogsReportParameters catalogsReportParameters, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsReport>> reportsGet(String token, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ReportsStats200Response>> reportsStats(CatalogsReportParameters parameters, String adAccountId, Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

}
