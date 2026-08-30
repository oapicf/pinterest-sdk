package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroup;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogProductGroupsApiImpl implements CatalogProductGroupsApi {
    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> catalogsProductGroupPinsList(String productGroupId, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<String>>> catalogsProductGroupsCreateMany(List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsDelete(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> catalogsProductGroupsDeleteMany(List<Integer> id, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupsList200Response>> catalogsProductGroupsList(List<Integer> id, String feedId, String catalogId, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupProductCountsVertical>> catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsProductGroupPinsList200Response>> productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics) {
        return Future.failedFuture(new HttpException(501));
    }

}
