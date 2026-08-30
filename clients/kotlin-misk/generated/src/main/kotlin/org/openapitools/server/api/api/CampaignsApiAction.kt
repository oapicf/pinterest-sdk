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
import org.openapitools.server.api.model.AdPinAnalytics
import org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.server.api.model.Campaign
import org.openapitools.server.api.model.CampaignBatchUpdateItem
import org.openapitools.server.api.model.CampaignBatchWriteResponseModel
import org.openapitools.server.api.model.CampaignCreateItem
import org.openapitools.server.api.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.server.api.model.CampaignDeliveryEstimatesResponse
import org.openapitools.server.api.model.CampaignsAnalyticsMetrics
import org.openapitools.server.api.model.CampaignsList200Response
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CampaignsApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/pins/analytics")
    @Description("Get pins analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adPinsAnalytics(
         @QueryParam(value = "campaign_id") campaignId: kotlin.String, 
         @QueryParam(value = "pin_ids") pinIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String
    ): kotlin.collections.List<AdPinAnalytics> {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/campaigns/targeting_analytics")
    @Description("Get targeting analytics for campaigns")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "targeting_types") targetingTypes: kotlin.collections.List<AdsAnalyticsCampaignTargetingType>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "attribution_types") attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): MetricsResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/campaigns/analytics")
    @Description("Get campaign analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignsAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "aggregate_report_rows") aggregateReportRows: kotlin.Boolean, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): kotlin.collections.List<CampaignsAnalyticsMetrics> {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/campaigns")
    @Description("Create campaigns")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody campaignCreateItem: kotlin.collections.List<CampaignCreateItem>
    ): CampaignBatchWriteResponseModel {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/campaigns/{campaign_id}")
    @Description("Get campaign")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("campaign_id") campaignId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): Campaign {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/campaigns")
    @Description("List campaigns")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "entity_statuses") entityStatuses: kotlin.collections.List<EntityStatus>
    ): CampaignsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/campaigns")
    @Description("Update campaigns")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody campaignBatchUpdateItem: kotlin.collections.List<CampaignBatchUpdateItem>
    ): CampaignBatchWriteResponseModel {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/campaigns/delivery_estimates")
    @Description("Get campaign delivery estimates")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getCampaignDeliveryEstimates(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=1)  @RequestBody campaignDeliveryEstimatesCampaign: kotlin.collections.List<CampaignDeliveryEstimatesCampaign>
    ): CampaignDeliveryEstimatesResponse {
        TODO()
    }
}
