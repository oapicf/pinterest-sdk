package org.openapitools.server.api.verticle;

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

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CatalogsApi  {
    //catalogs_product_groups/create
    void catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest, Handler<AsyncResult<Object>> handler);

    //catalogs_product_groups/delete
    void catalogsProductGroupsDelete(String productGroupId, Handler<AsyncResult<Void>> handler);

    //catalogs_product_groups/list
    void catalogsProductGroupsList(String feedId, String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //catalogs_product_groups/update
    void catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest, Handler<AsyncResult<CatalogsProductGroup>> handler);

    //feed_processing_results/list
    void feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //feeds/create
    void feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest, Handler<AsyncResult<CatalogsFeed>> handler);

    //feeds/delete
    void feedsDelete(String feedId, Handler<AsyncResult<Void>> handler);

    //feeds/get
    void feedsGet(String feedId, Handler<AsyncResult<CatalogsFeed>> handler);

    //feeds/list
    void feedsList(String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //feeds/update
    void feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest, Handler<AsyncResult<CatalogsFeed>> handler);

    //items_batch/get
    void itemsBatchGet(String batchId, Handler<AsyncResult<CatalogsItemsBatch>> handler);

    //items_batch/post
    void itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest, Handler<AsyncResult<CatalogsItemsBatch>> handler);

    //items/get
    void itemsGet(String country, List<String> itemIds, String language, Handler<AsyncResult<CatalogsItems>> handler);

}
