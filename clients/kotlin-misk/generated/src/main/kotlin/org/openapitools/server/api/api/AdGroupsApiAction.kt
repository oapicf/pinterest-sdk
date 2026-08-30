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
import org.openapitools.server.api.model.AdGroup
import org.openapitools.server.api.model.AdGroupAudienceSizing
import org.openapitools.server.api.model.AdGroupAudienceSizingCreate
import org.openapitools.server.api.model.AdGroupCreateCreate
import org.openapitools.server.api.model.AdGroupUpdateBatchUpdate
import org.openapitools.server.api.model.AdGroupsAnalyticsMetrics
import org.openapitools.server.api.model.AdGroupsCreate200Response
import org.openapitools.server.api.model.AdGroupsList200Response
import org.openapitools.server.api.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.server.api.model.BidFloor
import org.openapitools.server.api.model.BidFloorCreate
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.DynamicTitlesDownloadCSV
import org.openapitools.server.api.model.DynamicTitlesGetStatus
import org.openapitools.server.api.model.DynamicTitlesProcessCSV
import org.openapitools.server.api.model.DynamicTitlesProcessCSVCreate
import org.openapitools.server.api.model.DynamicTitlesUploadURL
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
class AdGroupsApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/ad_groups/analytics")
    @Description("Get ad group analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "aggregate_report_rows") aggregateReportRows: kotlin.Boolean, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): kotlin.collections.List<AdGroupsAnalyticsMetrics> {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing")
    @Description("Get audience sizing")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsAudienceSizing(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate
    ): AdGroupAudienceSizing {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/bid_floor")
    @Description("Get bid floors")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsBidFloorGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody bidFloorCreate: BidFloorCreate
    ): BidFloor {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/ad_groups")
    @Description("Create ad groups")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody adGroupCreateCreate: kotlin.collections.List<AdGroupCreateCreate>
    ): AdGroupsCreate200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv")
    @Description("Get dynamic titles CSV download URL")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsDynamicTitlesDownloadCsv(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_group_id") adGroupId: kotlin.String
    ): DynamicTitlesDownloadCSV {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status")
    @Description("Get dynamic titles status")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsDynamicTitlesGetStatus(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_group_id") adGroupId: kotlin.String
    ): DynamicTitlesGetStatus {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads")
    @Description("Get dynamic titles upload URL")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsDynamicTitlesGetUploadUrl(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_group_id") adGroupId: kotlin.String
    ): DynamicTitlesUploadURL {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles")
    @Description("Process dynamic titles CSV")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsDynamicTitlesProcessCsv(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_group_id") adGroupId: kotlin.String, 
        @Valid @RequestBody dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate
    ): DynamicTitlesProcessCSV {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}")
    @Description("Get ad group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_group_id") adGroupId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): AdGroup {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups")
    @Description("List ad groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "campaign_ids") campaignIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "entity_statuses") entityStatuses: kotlin.collections.List<EntityStatus>, 
         @QueryParam(value = "translate_interests_to_names") translateInterestsToNames: kotlin.Boolean
    ): AdGroupsList200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics")
    @Description("Get targeting analytics for ad groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "targeting_types") targetingTypes: kotlin.collections.List<AdsAnalyticsAdGroupTargetingType>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "attribution_types") attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?, 
         @QueryParam(value = "sort_columns") sortColumns: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "sort_ascending") sortAscending: kotlin.Boolean?
    ): MetricsResponse {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/ad_groups")
    @Description("Update ad groups")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adGroupsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody adGroupUpdateBatchUpdate: kotlin.collections.List<AdGroupUpdateBatchUpdate>
    ): AdGroupsCreate200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/promotion_applied_entities")
    @Description("List of ad groups using promotions IDs.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAdGroupsByPromotionIdsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "promotion_ids") promotionIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): AdGroupsList200Response {
        TODO()
    }
}
