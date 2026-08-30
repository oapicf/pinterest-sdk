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
import org.openapitools.server.api.model.ConversionDeletionRequest
import org.openapitools.server.api.model.ConversionDeletionRequestCreate
import org.openapitools.server.api.model.ConversionDeletionRequestList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ConversionDeletionRequestsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/conversion_deletion_requests")
    @Description("Create a conversion deletion request")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionDeletionRequestCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody conversionDeletionRequestCreate: ConversionDeletionRequestCreate
    ): ConversionDeletionRequest {
        TODO()
    }

    @Delete("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}")
    @Description("Delete a conversion deletion request")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionDeletionRequestDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("request_id") requestId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): ConversionDeletionRequest {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}")
    @Description("Get a single conversion deletion request")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionDeletionRequestGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("request_id") requestId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): ConversionDeletionRequest {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_deletion_requests")
    @Description("List conversion deletion requests")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionDeletionRequestList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): ConversionDeletionRequestList200Response {
        TODO()
    }
}
