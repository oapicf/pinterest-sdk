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
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.server.api.model.Pin
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse
import org.openapitools.server.api.model.PinCreate
import org.openapitools.server.api.model.PinFilter
import org.openapitools.server.api.model.PinType
import org.openapitools.server.api.model.PinUpdate
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.PinsSaveRequestCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.QuerypinanalyticsmetrictypesItems

/**
* @TODO("Fill out implementation")
*/
@Singleton
class PinsApiAction @Inject constructor(
) : WebAction {

    @Get("/pins/analytics")
    @Description("Get multiple Pin analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun multiPinsAnalytics(
         @QueryParam(value = "pin_ids") pinIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "metric_types") metricTypes: kotlin.collections.List<MultiPinsAnalyticsMetricTypesItem>, 
         @QueryParam(value = "app_types") appTypes: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse>> {
        TODO()
    }

    @Get("/pins/{pin_id}/analytics")
    @Description("Get Pin analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsAnalytics(
        @PathParam("pin_id") pinId: kotlin.String, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "metric_types") metricTypes: kotlin.collections.List<QuerypinanalyticsmetrictypesItems>, 
         @QueryParam(value = "app_types") appTypes: kotlin.String, 
         @QueryParam(value = "split_field") splitField: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse> {
        TODO()
    }

    @Post("/pins")
    @Description("Create Pin")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsCreate(
        @Valid @RequestBody pinCreate: PinCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Pin {
        TODO()
    }

    @Delete("/pins/{pin_id}")
    @Description("Delete Pin")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsDelete(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Pin {
        TODO()
    }

    @Get("/pins/{pin_id}")
    @Description("Get Pin")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsGet(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "pin_metrics") pinMetrics: kotlin.Boolean
    ): Pin {
        TODO()
    }

    @Get("/pins")
    @Description("List Pins")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsList(
         @QueryParam(value = "pin_filter") pinFilter: PinFilter?, 
         @QueryParam(value = "pin_metrics") pinMetrics: kotlin.Boolean, 
         @QueryParam(value = "include_protected_pins") includeProtectedPins: kotlin.Boolean, 
         @QueryParam(value = "pin_type") pinType: PinType?, 
         @QueryParam(value = "creative_types") creativeTypes: kotlin.collections.List<CreativeType>?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "domain") domain: kotlin.String?, 
         @QueryParam(value = "domains") domains: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "include_product_tag_obj") includeProductTagObj: kotlin.Boolean?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): PinsList200Response {
        TODO()
    }

    @Post("/pins/{pin_id}/save")
    @Description("Save Pin")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsSave(
        @PathParam("pin_id") pinId: kotlin.String, 
        @Valid @RequestBody pinsSaveRequestCreate: PinsSaveRequestCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Pin {
        TODO()
    }

    @Patch("/pins/{pin_id}")
    @Description("Update Pin")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pinsUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("pin_id") pinId: kotlin.String, 
        @Valid @RequestBody pinUpdate: PinUpdate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Pin {
        TODO()
    }
}
