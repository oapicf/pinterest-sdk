package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatchPostRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequest;
import org.openapitools.vertxweb.server.model.ItemsPost200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogItemsApi  {
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId, String adAccountId);
    Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest, String adAccountId);
    Future<ApiResponse<ItemsPost200Response>> itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId);
}
