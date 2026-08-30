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
import org.openapitools.server.api.model.CustomerList
import org.openapitools.server.api.model.CustomerListCreate
import org.openapitools.server.api.model.CustomerListUpdateWithRequiredBody
import org.openapitools.server.api.model.CustomerListsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CustomerListsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/customer_lists")
    @Description("Create customer lists")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody customerListCreate: CustomerListCreate
    ): CustomerList {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")
    @Description("Get customer list")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("customer_list_id") customerListId: kotlin.String
    ): CustomerList {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/customer_lists")
    @Description("Get customer lists")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "exclude_nca") excludeNca: kotlin.Boolean
    ): CustomerListsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")
    @Description("Update customer list")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun customerListsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("customer_list_id") customerListId: kotlin.String, 
        @Valid @RequestBody customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody
    ): CustomerList {
        TODO()
    }
}
