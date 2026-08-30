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
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.server.api.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ConversionsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/advertiser_defined_events")
    @Description("Create advertiser defined events")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advertiserDefinedEventsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
    ): AdvertiserDefinedEventsCreate200Response {
        TODO()
    }

    @Delete("/ad_accounts/{ad_account_id}/advertiser_defined_events")
    @Description("Delete advertiser defined events")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advertiserDefinedEventsDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "event_names") eventNames: kotlin.collections.List<kotlin.String>
    ): AdvertiserDefinedEventsCreate200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/advertiser_defined_events")
    @Description("Get advertiser defined events")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advertiserDefinedEventsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): AdvertiserDefinedEventsGet200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/advertiser_defined_events")
    @Description("Update advertiser defined events")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advertiserDefinedEventsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
    ): AdvertiserDefinedEventsCreate200Response {
        TODO()
    }
}
