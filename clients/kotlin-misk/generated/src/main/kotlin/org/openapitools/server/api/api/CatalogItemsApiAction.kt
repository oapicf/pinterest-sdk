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
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsBatchPostRequest
import org.openapitools.server.api.model.CatalogsItemsRequest
import org.openapitools.server.api.model.ItemsPost200Response
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogItemsApiAction @Inject constructor(
) : WebAction {

    @Get("/catalogs/items/batch/{batch_id}")
    @Description("Get item batch status")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemsBatchGet(
        @Pattern(regexp="^\\d+$") @PathParam("batch_id") batchId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsItemsBatch {
        TODO()
    }

    @Post("/catalogs/items/batch")
    @Description("Operate on item batch")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemsBatchPost(
        @Valid @RequestBody catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsItemsBatch {
        TODO()
    }

    @Post("/catalogs/items")
    @Description("Get catalogs items (POST)")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemsPost(
        @Valid @RequestBody catalogsItemsRequest: CatalogsItemsRequest, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): ItemsPost200Response {
        TODO()
    }
}
