package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.ProductTagsBulkAddRequest;
import org.openapitools.vertxweb.server.model.ProductTagsBulkDeleteRequest;
import org.openapitools.vertxweb.server.model.ProductTagsError;
import org.openapitools.vertxweb.server.model.ProductTagsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ProductTagsApi  {
    Future<ApiResponse<ProductTagsResponse>> productTagsBulkAdd(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest);
    Future<ApiResponse<Void>> productTagsBulkDelete(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest);
    Future<ApiResponse<ProductTagsResponse>> productTagsList(String pinId);
}
