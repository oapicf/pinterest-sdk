package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Catalog;
import org.openapitools.server.api.model.CatalogsCreateReportResponse;
import org.openapitools.server.api.model.CatalogsCreateRequest;
import org.openapitools.server.api.model.CatalogsFeed;
import org.openapitools.server.api.model.CatalogsFeedIngestion;
import org.openapitools.server.api.model.CatalogsItemValidationIssue;
import org.openapitools.server.api.model.CatalogsItems;
import org.openapitools.server.api.model.CatalogsItemsBatch;
import org.openapitools.server.api.model.CatalogsItemsFilters;
import org.openapitools.server.api.model.CatalogsItemsRequest;
import org.openapitools.server.api.model.CatalogsList200Response;
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest;
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response;
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.server.api.model.CatalogsReport;
import org.openapitools.server.api.model.CatalogsReportParameters;
import org.openapitools.server.api.model.CatalogsVerticalProductGroup;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.FeedProcessingResultsList200Response;
import org.openapitools.server.api.model.FeedsCreateRequest;
import org.openapitools.server.api.model.FeedsList200Response;
import org.openapitools.server.api.model.FeedsUpdateRequest;
import org.openapitools.server.api.model.ItemsBatchPostRequest;
import org.openapitools.server.api.model.ItemsIssuesList200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MultipleProductGroupsInner;
import org.openapitools.server.api.model.ReportsStats200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CatalogsApi  {
    //catalogs/create
    void catalogsCreate(CatalogsCreateRequest catalogsCreateRequest, String adAccountId, Handler<AsyncResult<Catalog>> handler);

    //catalogs/list
    void catalogsList(String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsList200Response>> handler);

    //catalogs_product_group_pins/list
    void catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, Handler<AsyncResult<CatalogsProductGroupPinsList200Response>> handler);

    //catalogs_product_groups/create
    void catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, String adAccountId, Handler<AsyncResult<CatalogsVerticalProductGroup>> handler);

    //catalogs_product_groups/create_many
    void catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, String adAccountId, Handler<AsyncResult<List<String>>> handler);

    //catalogs_product_groups/delete
    void catalogsProductGroupsDelete(String productGroupId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //catalogs_product_groups/delete_many
    void catalogsProductGroupsDeleteMany(List<Integer> id, String adAccountId, Handler<AsyncResult<Void>> handler);

    //catalogs_product_groups/get
    void catalogsProductGroupsGet(String productGroupId, String adAccountId, Handler<AsyncResult<CatalogsVerticalProductGroup>> handler);

    //catalogs_product_groups/list
    void catalogsProductGroupsList(List<Integer> id, String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsProductGroupsList200Response>> handler);

    //catalogs_product_groups/product_counts_get
    void catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId, Handler<AsyncResult<CatalogsProductGroupProductCountsVertical>> handler);

    //catalogs_product_groups/update
    void catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId, Handler<AsyncResult<CatalogsVerticalProductGroup>> handler);

    //feed_processing_results/list
    void feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<FeedProcessingResultsList200Response>> handler);

    //feeds/create
    void feedsCreate(FeedsCreateRequest feedsCreateRequest, String adAccountId, Handler<AsyncResult<CatalogsFeed>> handler);

    //feeds/delete
    void feedsDelete(String feedId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //feeds/get
    void feedsGet(String feedId, String adAccountId, Handler<AsyncResult<CatalogsFeed>> handler);

    //feeds/ingest
    void feedsIngest(String feedId, String adAccountId, Handler<AsyncResult<CatalogsFeedIngestion>> handler);

    //feeds/list
    void feedsList(String bookmark, Integer pageSize, String catalogId, String adAccountId, Handler<AsyncResult<FeedsList200Response>> handler);

    //feeds/update
    void feedsUpdate(String feedId, FeedsUpdateRequest feedsUpdateRequest, String adAccountId, Handler<AsyncResult<CatalogsFeed>> handler);

    //items_batch/get
    void itemsBatchGet(String batchId, String adAccountId, Handler<AsyncResult<CatalogsItemsBatch>> handler);

    //items_batch/post
    void itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId, Handler<AsyncResult<CatalogsItemsBatch>> handler);

    //items/get
    void itemsGet(String country, String language, String adAccountId, List<String> itemIds, CatalogsItemsFilters filters, Handler<AsyncResult<CatalogsItems>> handler);

    //items_issues/list
    void itemsIssuesList(String processingResultId, String bookmark, Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId, Handler<AsyncResult<ItemsIssuesList200Response>> handler);

    //items/post
    void itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId, Handler<AsyncResult<CatalogsItems>> handler);

    //products_by_product_group_filter/list
    void productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, Handler<AsyncResult<CatalogsProductGroupPinsList200Response>> handler);

    //reports/create
    void reportsCreate(CatalogsReportParameters catalogsReportParameters, String adAccountId, Handler<AsyncResult<CatalogsCreateReportResponse>> handler);

    //reports/get
    void reportsGet(String token, String adAccountId, Handler<AsyncResult<CatalogsReport>> handler);

    //reports/stats
    void reportsStats(CatalogsReportParameters parameters, String adAccountId, Integer pageSize, String bookmark, Handler<AsyncResult<ReportsStats200Response>> handler);

}
