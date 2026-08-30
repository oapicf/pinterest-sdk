package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.ProductTagsBulkAddRequest;
import org.openapitools.vertxweb.server.model.ProductTagsBulkDeleteRequest;
import org.openapitools.vertxweb.server.model.ProductTagsError;
import org.openapitools.vertxweb.server.model.ProductTagsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductTagsApiImpl implements ProductTagsApi {
    public Future<ApiResponse<ProductTagsResponse>> productTagsBulkAdd(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> productTagsBulkDelete(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProductTagsResponse>> productTagsList(String pinId) {
        return Future.failedFuture(new HttpException(501));
    }

}
