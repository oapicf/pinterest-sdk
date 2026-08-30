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
import org.openapitools.server.api.model.ConversionEventResponse
import org.openapitools.server.api.model.ConversionTag
import org.openapitools.server.api.model.ConversionTagCreate
import org.openapitools.server.api.model.ConversionTagsList200Response
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ConversionTagsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/conversion_tags")
    @Description("Create conversion tag")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionTagsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody conversionTagCreate: ConversionTagCreate
    ): ConversionTag {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    @Description("Get conversion tag")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("conversion_tag_id") conversionTagId: kotlin.String
    ): ConversionTag {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_tags")
    @Description("List conversion tags")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun conversionTagsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "filter_deleted") filterDeleted: kotlin.Boolean
    ): ConversionTagsList200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible")
    @Description("Get Ocpm eligible conversion tags")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ocpmEligibleConversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): kotlin.collections.Map<kotlin.String, kotlin.collections.List<ConversionEventResponse>> {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/conversion_tags/page_visit")
    @Description("Get page visit conversion tags")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pageVisitConversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): PageVisitConversionTagsGet200Response {
        TODO()
    }
}
