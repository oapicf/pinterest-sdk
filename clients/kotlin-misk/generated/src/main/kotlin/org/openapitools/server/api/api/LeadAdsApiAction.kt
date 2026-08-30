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
import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.server.api.model.LeadSubscription
import org.openapitools.server.api.model.LeadSubscriptionPostParamsCreate
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class LeadAdsApiAction @Inject constructor(
) : WebAction {

    @Delete("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")
    @Description("Delete lead ads subscription")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsSubscriptionsDelById(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("subscription_id") subscriptionId: kotlin.String
    ): LeadSubscription {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")
    @Description("Get lead ads subscription by ID")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsSubscriptionsGetById(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("subscription_id") subscriptionId: kotlin.String
    ): LeadSubscription {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/leads/subscriptions")
    @Description("Get lead ads subscriptions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsSubscriptionsGetList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): AdAccountsSubscriptionsGetList200Response {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/leads/subscriptions")
    @Description("Create lead ads subscription")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsSubscriptionsPost(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate
    ): LeadSubscription {
        TODO()
    }
}
