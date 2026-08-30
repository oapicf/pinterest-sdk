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
import org.openapitools.server.api.model.BulkDownload
import org.openapitools.server.api.model.BulkDownloadCreate
import org.openapitools.server.api.model.BulkJobData
import org.openapitools.server.api.model.BulkUpsertRequest
import org.openapitools.server.api.model.BulkUpsertResponse
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BulkApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/bulk/download")
    @Description("Get advertiser entities in bulk")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun bulkDownloadCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody bulkDownloadCreate: BulkDownloadCreate
    ): BulkDownload {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}")
    @Description("Download advertiser entities in bulk")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun bulkRequestGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @PathParam("bulk_request_id") bulkRequestId: kotlin.String, 
         @QueryParam(value = "include_details") includeDetails: kotlin.Boolean
    ): BulkJobData {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/bulk/upsert")
    @Description("Create/update ad entities in bulk")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun bulkUpsertCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody bulkUpsertRequest: BulkUpsertRequest
    ): BulkUpsertResponse {
        TODO()
    }
}
