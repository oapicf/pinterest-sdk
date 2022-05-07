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

import java.util.List;
import java.util.Map;

public interface CatalogsApi  {
    Future<ApiResponse<Object>> catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest);
    Future<ApiResponse<Void>> catalogsProductGroupsDelete(String productGroupId);
    Future<ApiResponse<Paginated>> catalogsProductGroupsList(String feedId, String bookmark, Integer pageSize);
    Future<ApiResponse<CatalogsProductGroup>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest);
    Future<ApiResponse<Paginated>> feedProcessingResultsList(String feedId, String bookmark, Integer pageSize);
    Future<ApiResponse<CatalogsFeed>> feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest);
    Future<ApiResponse<Void>> feedsDelete(String feedId);
    Future<ApiResponse<CatalogsFeed>> feedsGet(String feedId);
    Future<ApiResponse<Paginated>> feedsList(String bookmark, Integer pageSize);
    Future<ApiResponse<CatalogsFeed>> feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest);
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId);
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest);
    Future<ApiResponse<CatalogsItems>> itemsGet(String country, List<String> itemIds, String language);
}
