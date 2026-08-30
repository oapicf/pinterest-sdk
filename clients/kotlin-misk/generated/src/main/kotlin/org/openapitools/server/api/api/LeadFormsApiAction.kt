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
import org.openapitools.server.api.model.LeadForm
import org.openapitools.server.api.model.LeadFormBatchUpdate
import org.openapitools.server.api.model.LeadFormCreate
import org.openapitools.server.api.model.LeadFormTest
import org.openapitools.server.api.model.LeadFormTestCreate
import org.openapitools.server.api.model.LeadFormsCreate200Response
import org.openapitools.server.api.model.LeadFormsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class LeadFormsApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}")
    @Description("Get lead form by id")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormGet(
        @Pattern(regexp="^\\d+$") @PathParam("lead_form_id") leadFormId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): LeadForm {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Description("Create lead form test data")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormTestCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("lead_form_id") leadFormId: kotlin.String, 
        @Valid @RequestBody leadFormTestCreate: LeadFormTestCreate
    ): LeadFormTest {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/lead_forms")
    @Description("Create lead forms")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody leadFormCreate: kotlin.collections.List<LeadFormCreate>
    ): LeadFormsCreate200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/lead_forms")
    @Description("List lead forms")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): LeadFormsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/lead_forms")
    @Description("Update lead forms")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody leadFormBatchUpdate: kotlin.collections.List<LeadFormBatchUpdate>
    ): LeadFormsCreate200Response {
        TODO()
    }
}
