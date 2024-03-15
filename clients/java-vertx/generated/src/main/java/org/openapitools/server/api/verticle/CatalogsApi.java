package org.openapitools.server.api.verticle;

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

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CatalogsApi  {
    //catalogs/list
    void catalogsList(String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsList200Response>> handler);

    //catalogs_product_group_pins/list
    void catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsProductGroupPinsList200Response>> handler);

    //catalogs_product_groups/create
    void catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest, String adAccountId, Handler<AsyncResult<CatalogsProductGroupsCreate201Response>> handler);

    //catalogs_product_groups/delete
    void catalogsProductGroupsDelete(String productGroupId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //catalogs_product_groups/get
    void catalogsProductGroupsGet(String productGroupId, String adAccountId, Handler<AsyncResult<CatalogsProductGroupsCreate201Response>> handler);

    //catalogs_product_groups/list
    void catalogsProductGroupsList(String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsProductGroupsList200Response>> handler);

    //catalogs_product_groups/product_counts_get
    void catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId, Handler<AsyncResult<CatalogsProductGroupProductCounts>> handler);

    //catalogs_product_groups/update
    void catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId, Handler<AsyncResult<CatalogsProductGroupsCreate201Response>> handler);

    //feed_processing_results/list
    void feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<FeedProcessingResultsList200Response>> handler);

    //feeds/create
    void feedsCreate(FeedsCreateRequest feedsCreateRequest, String adAccountId, Handler<AsyncResult<CatalogsFeed>> handler);

    //feeds/delete
    void feedsDelete(String feedId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //feeds/get
    void feedsGet(String feedId, String adAccountId, Handler<AsyncResult<CatalogsFeed>> handler);

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

    //products_by_product_group_filter/list
    void productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Handler<AsyncResult<CatalogsProductGroupPinsList200Response>> handler);

}
