package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsLocalStoresCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.CatalogsLocalStoresDelete200ResponseInner;
import org.openapitools.vertxweb.server.model.CatalogsLocalStoresList200Response;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsBatch;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsBatchCreate;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsGet;
import org.openapitools.vertxweb.server.model.LocalInventoryItemsGetCreate;
import org.openapitools.vertxweb.server.model.LocalStore;
import org.openapitools.vertxweb.server.model.LocalStoreBatchUpdate;
import org.openapitools.vertxweb.server.model.LocalStoreCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SupplementalItemsBatchResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogSupplementalApi  {
    Future<ApiResponse<SupplementalItemsBatchResponse>> catalogsLocalInventoryItemsBatchOperate(String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, String adAccountId);
    Future<ApiResponse<LocalInventoryItemsGet>> catalogsLocalInventoryItemsPost(String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, String adAccountId);
    Future<ApiResponse<List<CatalogsLocalStoresCreate200ResponseInner>>> catalogsLocalStoresCreate(String catalogId, List<LocalStoreCreate> localStoreCreate, String adAccountId);
    Future<ApiResponse<List<CatalogsLocalStoresDelete200ResponseInner>>> catalogsLocalStoresDelete(String catalogId, List<String> ids, String adAccountId);
    Future<ApiResponse<CatalogsLocalStoresList200Response>> catalogsLocalStoresList(String catalogId, List<String> ids, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<List<CatalogsLocalStoresCreate200ResponseInner>>> catalogsLocalStoresUpdate(String catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, String adAccountId);
    Future<ApiResponse<SupplementalItemsBatchResponse>> catalogsSupplementalItemsBatchGet(String catalogId, String batchId, String adAccountId);
}
