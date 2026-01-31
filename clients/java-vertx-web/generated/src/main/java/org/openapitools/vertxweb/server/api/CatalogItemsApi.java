package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequest;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.ItemsBatchPostRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogItemsApi  {
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId, String adAccountId);
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId);
    Future<ApiResponse<CatalogsItems>> itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId);
}
