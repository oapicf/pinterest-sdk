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
import org.openapitools.server.api.model.CustomerListUpload
import org.openapitools.server.api.model.CustomerListUploadCreateRequest
import org.openapitools.server.api.model.CustomerListUploadCreateResponse
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CustomerListUploadsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
    @Description("Create customer list upload")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListUploadsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("customer_list_id") customerListId: kotlin.String, 
        @Valid @RequestBody customerListUploadCreateRequest: CustomerListUploadCreateRequest
    ): CustomerListUploadCreateResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}")
    @Description("Get customer list upload")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListUploadsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("customer_list_id") customerListId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("customer_list_upload_id") customerListUploadId: kotlin.String
    ): CustomerListUpload {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run")
    @Description("Run customer list upload")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListUploadsRun(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("customer_list_id") customerListId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("customer_list_upload_id") customerListUploadId: kotlin.String
    ): CustomerListUpload {
        TODO()
    }
}
