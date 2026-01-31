package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsItems;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatch;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequest;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.ItemsBatchPostRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogItemsApiImpl implements CatalogItemsApi {
    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchGet(String batchId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsItemsBatch>> itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsItems>> itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
