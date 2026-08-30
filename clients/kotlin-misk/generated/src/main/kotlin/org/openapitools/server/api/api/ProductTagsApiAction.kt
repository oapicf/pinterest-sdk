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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductTagsBulkAddRequest
import org.openapitools.server.api.model.ProductTagsBulkDeleteRequest
import org.openapitools.server.api.model.ProductTagsError
import org.openapitools.server.api.model.ProductTagsResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ProductTagsApiAction @Inject constructor(
) : WebAction {

    @Post("/pins/{pin_id}/product_tags")
    @Description("Add product tags to pin")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productTagsBulkAdd(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String, 
        @Valid @RequestBody productTagsBulkAddRequest: ProductTagsBulkAddRequest
    ): ProductTagsResponse {
        TODO()
    }

    @Post("/pins/{pin_id}/product_tags/bulk-delete")
    @Description("Delete product tags from pin")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productTagsBulkDelete(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String, 
        @Valid @RequestBody productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest
    ): Response<Unit> {
        TODO()
    }

    @Get("/pins/{pin_id}/product_tags")
    @Description("Get product tags for pin")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productTagsList(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String
    ): ProductTagsResponse {
        TODO()
    }
}
