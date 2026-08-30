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
import org.openapitools.server.api.model.AdAccountCountriesGet200Response
import org.openapitools.server.api.model.BookClosed
import org.openapitools.server.api.model.DeliveryMetricsGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PublicTargetingType
import org.openapitools.server.api.model.ReportType
import org.openapitools.server.api.model.SingleInterestTargetingOption

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ResourcesApiAction @Inject constructor(
) : WebAction {

    @Get("/resources/ad_account_countries")
    @Description("Get ad accounts countries")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountCountriesGet(
    ): AdAccountCountriesGet200Response {
        TODO()
    }

    @Get("/resources/delivery_metrics")
    @Description("Get available metrics' definitions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deliveryMetricsGet(
         @QueryParam(value = "report_type") reportType: ReportType?
    ): DeliveryMetricsGet200Response {
        TODO()
    }

    @Get("/resources/targeting/interests/{interest_id}")
    @Description("Get interest details")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun interestTargetingOptionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("interest_id") interestId: kotlin.String
    ): SingleInterestTargetingOption {
        TODO()
    }

    @Get("/resources/lead_form_questions")
    @Description("Get lead form questions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadFormQuestionsGet(
    ): Response<Unit> {
        TODO()
    }

    @Get("/resources/metrics_ready_state")
    @Description("Get metrics ready state")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun metricsReadyStateGet(
         @QueryParam(value = "date") date: kotlin.String
    ): BookClosed {
        TODO()
    }

    @Get("/resources/targeting/{targeting_type}")
    @Description("Get targeting options")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun targetingOptionsGet(
        @PathParam("targeting_type") targetingType: PublicTargetingType, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "client_id") clientId: kotlin.String?, 
         @QueryParam(value = "oauth_signature") oauthSignature: kotlin.String?, 
         @QueryParam(value = "timestamp") timestamp: kotlin.String?
    ): kotlin.collections.List<kotlin.Any> {
        TODO()
    }
}
