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
import org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresList200Response
import org.openapitools.server.api.model.LocalInventoryItemsBatch
import org.openapitools.server.api.model.LocalInventoryItemsBatchCreate
import org.openapitools.server.api.model.LocalInventoryItemsGet
import org.openapitools.server.api.model.LocalInventoryItemsGetCreate
import org.openapitools.server.api.model.LocalStore
import org.openapitools.server.api.model.LocalStoreBatchUpdate
import org.openapitools.server.api.model.LocalStoreCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SupplementalItemsBatchResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogSupplementalApiAction @Inject constructor(
) : WebAction {

    @Post("/catalogs/{catalog_id}/local_inventory_items/batch")
    @Description("Operate on local inventory item batch")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalInventoryItemsBatchOperate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
        @Valid @RequestBody localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): SupplementalItemsBatchResponse {
        TODO()
    }

    @Post("/catalogs/{catalog_id}/local_inventory_items/query")
    @Description("Get local inventory items (POST)")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalInventoryItemsPost(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
        @Valid @RequestBody localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): LocalInventoryItemsGet {
        TODO()
    }

    @Post("/catalogs/{catalog_id}/local_stores")
    @Description("Create local stores")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalStoresCreate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
        @Valid @RequestBody localStoreCreate: kotlin.collections.List<LocalStoreCreate>, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> {
        TODO()
    }

    @Delete("/catalogs/{catalog_id}/local_stores")
    @Description("Delete local stores")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalStoresDelete(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
         @QueryParam(value = "ids") ids: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.List<CatalogsLocalStoresDelete200ResponseInner> {
        TODO()
    }

    @Get("/catalogs/{catalog_id}/local_stores")
    @Description("List local stores")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalStoresList(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
         @QueryParam(value = "ids") ids: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): CatalogsLocalStoresList200Response {
        TODO()
    }

    @Patch("/catalogs/{catalog_id}/local_stores")
    @Description("Update local stores")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsLocalStoresUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
        @Valid @RequestBody localStoreBatchUpdate: kotlin.collections.List<LocalStoreBatchUpdate>, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> {
        TODO()
    }

    @Get("/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}")
    @Description("Get supplemental items batch status")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsSupplementalItemsBatchGet(
        @Pattern(regexp="^\\d+$") @Size(max=19) @PathParam("catalog_id") catalogId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("batch_id") batchId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): SupplementalItemsBatchResponse {
        TODO()
    }
}
