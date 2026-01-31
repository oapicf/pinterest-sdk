package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroup;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.MultipleProductGroupsInner;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogProductGroupsApi  {
    Future<ApiResponse<CatalogsProductGroupPinsList200Response>> catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics);
    Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, String adAccountId);
    Future<ApiResponse<List<String>>> catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, String adAccountId);
    Future<ApiResponse<Void>> catalogsProductGroupsDelete(String productGroupId, String adAccountId);
    Future<ApiResponse<Void>> catalogsProductGroupsDeleteMany(List<Integer> id, String adAccountId);
    Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsGet(String productGroupId, String adAccountId);
    Future<ApiResponse<CatalogsProductGroupsList200Response>> catalogsProductGroupsList(List<Integer> id, String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId);
    Future<ApiResponse<CatalogsProductGroupProductCountsVertical>> catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId);
    Future<ApiResponse<CatalogsVerticalProductGroup>> catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId);
    Future<ApiResponse<CatalogsProductGroupPinsList200Response>> productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics);
}
