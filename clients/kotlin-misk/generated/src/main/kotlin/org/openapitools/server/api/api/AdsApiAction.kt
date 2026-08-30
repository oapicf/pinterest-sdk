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
import org.openapitools.server.api.model.Ad
import org.openapitools.server.api.model.AdBatchUpdate
import org.openapitools.server.api.model.AdBatchWriteResponseModel
import org.openapitools.server.api.model.AdCreate
import org.openapitools.server.api.model.AdPreviewRequest
import org.openapitools.server.api.model.AdPreviewURLResponse
import org.openapitools.server.api.model.AdsAnalytics
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.api.model.AdsList200Response
import org.openapitools.server.api.model.CampaignAdPreview
import org.openapitools.server.api.model.CampaignAdPreviewCreate
import org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.server.api.model.ConversionAttributionWindowDays
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.ConversionReportTimeType
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
class AdsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/ad_previews")
    @Description("Create ad preview with pin or image")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adPreviewsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adPreviewRequest: AdPreviewRequest
    ): AdPreviewURLResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ads/targeting_analytics")
    @Description("Get targeting analytics for ads")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "ad_ids") adIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "targeting_types") targetingTypes: kotlin.collections.List<AdsAnalyticsAdTargetingType>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
         @QueryParam(value = "click_window_days") clickWindowDays: ConversionAttributionWindowDays?, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: ConversionAttributionWindowDays?, 
         @QueryParam(value = "view_window_days") viewWindowDays: ConversionAttributionWindowDays?, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: ConversionReportTimeType?, 
         @QueryParam(value = "attribution_types") attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?, 
         @QueryParam(value = "sort_columns") sortColumns: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "sort_ascending") sortAscending: kotlin.Boolean?
    ): MetricsResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ads/analytics")
    @Description("Get ad analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "pin_ids") pinIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "ad_ids") adIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): kotlin.collections.List<AdsAnalytics> {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/ads")
    @Description("Create ads")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody adCreate: kotlin.collections.List<AdCreate>
    ): AdBatchWriteResponseModel {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ads/{ad_id}")
    @Description("Get ad")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_id") adId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): Ad {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ads")
    @Description("List ads")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "ad_ids") adIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "entity_statuses") entityStatuses: kotlin.collections.List<EntityStatus>
    ): AdsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/ads")
    @Description("Update ads")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody adBatchUpdate: kotlin.collections.List<AdBatchUpdate>
    ): AdBatchWriteResponseModel {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/campaign_ad_preview")
    @Description("Create ad preview records for one or more ad groups")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignAdPreviewCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody campaignAdPreviewCreate: kotlin.collections.List<CampaignAdPreviewCreate>
    ): kotlin.collections.List<CampaignAdPreviewCreate200ResponseInner> {
        TODO()
    }

    @Delete("/ad_accounts/{ad_account_id}/campaign_ad_preview")
    @Description("Delete ad preview records for one or more ad groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignAdPreviewDelete(
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): kotlin.collections.List<CampaignAdPreviewDelete200ResponseInner> {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/campaign_ad_preview")
    @Description("Fetch ad preview records for one or more ad groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun campaignAdPreviewRead(
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): kotlin.collections.List<CampaignAdPreview> {
        TODO()
    }
}
