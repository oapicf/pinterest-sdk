package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.api.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.server.api.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogProductGroupsApiAction @Inject constructor(
) : WebAction {

    @Get("/catalogs/product_groups/{product_group_id}/products")
    @Description("List products by product group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupPinsList(
        @Pattern(regexp="^\\d+$") @PathParam("product_group_id") productGroupId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "pin_metrics") pinMetrics: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): CatalogsProductGroupPinsList200Response {
        TODO()
    }

    @Post("/catalogs/product_groups")
    @Description("Create product group")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsCreate(
        @Valid @RequestBody catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsVerticalProductGroup {
        TODO()
    }

    @Post("/catalogs/product_groups/multiple")
    @Description("Create product groups")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsCreateMany(
        @Valid@Size(min=1,max=1000)  @RequestBody catalogsProductGroupsCreateManyRequestItems: kotlin.collections.List<CatalogsProductGroupsCreateManyRequestItems>, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.List<kotlin.String> {
        TODO()
    }

    @Delete("/catalogs/product_groups/{product_group_id}")
    @Description("Delete product group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsDelete(
        @Pattern(regexp="^\\d+$") @PathParam("product_group_id") productGroupId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsVerticalProductGroup {
        TODO()
    }

    @Delete("/catalogs/product_groups/multiple")
    @Description("Delete product groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsDeleteMany(
         @QueryParam(value = "id") id: kotlin.collections.List<kotlin.Int>, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Response<Unit> {
        TODO()
    }

    @Get("/catalogs/product_groups/{product_group_id}")
    @Description("Get product group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsGet(
        @Pattern(regexp="^\\d+$") @PathParam("product_group_id") productGroupId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsVerticalProductGroup {
        TODO()
    }

    @Get("/catalogs/product_groups")
    @Description("List product groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsList(
         @QueryParam(value = "id") id: kotlin.collections.List<kotlin.Int>?, 
         @QueryParam(value = "feed_id") feedId: kotlin.String?, 
         @QueryParam(value = "catalog_id") catalogId: kotlin.String?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): CatalogsProductGroupsList200Response {
        TODO()
    }

    @Get("/catalogs/product_groups/{product_group_id}/product_counts")
    @Description("Get product counts")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsProductCountsGet(
        @Pattern(regexp="^\\d+$") @PathParam("product_group_id") productGroupId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsProductGroupProductCountsVertical {
        TODO()
    }

    @Patch("/catalogs/product_groups/{product_group_id}")
    @Description("Update single product group")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsProductGroupsUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("product_group_id") productGroupId: kotlin.String, 
        @Valid @RequestBody catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsVerticalProductGroup {
        TODO()
    }

    @Post("/catalogs/products/get_by_product_group_filters")
    @Description("List products by filter")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productsByProductGroupFilterList(
        @Valid @RequestBody catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "pin_metrics") pinMetrics: kotlin.Boolean
    ): CatalogsProductGroupPinsList200Response {
        TODO()
    }
}
