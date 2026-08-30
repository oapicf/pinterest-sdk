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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogSupplementalApiImpl implements CatalogSupplementalApi {
    public Future<ApiResponse<SupplementalItemsBatchResponse>> catalogsLocalInventoryItemsBatchOperate(String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LocalInventoryItemsGet>> catalogsLocalInventoryItemsPost(String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<CatalogsLocalStoresCreate200ResponseInner>>> catalogsLocalStoresCreate(String catalogId, List<LocalStoreCreate> localStoreCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<CatalogsLocalStoresDelete200ResponseInner>>> catalogsLocalStoresDelete(String catalogId, List<String> ids, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsLocalStoresList200Response>> catalogsLocalStoresList(String catalogId, List<String> ids, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<CatalogsLocalStoresCreate200ResponseInner>>> catalogsLocalStoresUpdate(String catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SupplementalItemsBatchResponse>> catalogsSupplementalItemsBatchGet(String catalogId, String batchId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
