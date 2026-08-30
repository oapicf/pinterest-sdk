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
import org.openapitools.server.api.model.CustomerSegment
import org.openapitools.server.api.model.CustomerSegmentCreate
import org.openapitools.server.api.model.CustomerSegmentList200Response
import org.openapitools.server.api.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CustomerSegmentApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/customer_segments")
    @Description("Create customer segments")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerSegmentCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody customerSegmentCreate: CustomerSegmentCreate
    ): CustomerSegment {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/customer_segments")
    @Description("List customer segments")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerSegmentList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "include_sizing") includeSizing: kotlin.Boolean, 
         @QueryParam(value = "search_query") searchQuery: kotlin.String?
    ): CustomerSegmentList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/customer_segments")
    @Description("Update customer segments")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerSegmentUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody
    ): Response<Unit> {
        TODO()
    }
}
