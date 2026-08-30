package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncRequest.
  * @param adGroupIds List of ad group ids
  * @param adGroupStatuses List of values for filtering
  * @param adIds List of ad ids. This parameter is not supported for Product Item level reports.
  * @param adStatuses List of values for filtering. This parameter is not supported for Product Item level reports.
  * @param attributionTypes List of attribution types for the conversion report.
  * @param campaignBrandLabel Campaign brand label for filtering.
  * @param campaignCustomLabel Campaign custom label for filtering.
  * @param campaignIds List of campaign ids
  * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
  * @param campaignStatuses List of status values for filtering
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
  * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
  * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown.
  * @param conversionReportTime Date dimension for conversion metrics.
  * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param endHour Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action.
  * @param granularity   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
  * @param level Level of the report
  * @param metricsFilters List of metrics filters
  * @param productGroupIds List of product group ids
  * @param productGroupStatuses List of values for filtering
  * @param productItemIds List of product item ids
  * @param reportingTimezone Specify the timezone to be applied for the reporting.
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param startHour Which hour of the start date to begin the report. Only allowed for hourly reports.
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsAnalyticsCreateAsyncRequest(
  adGroupIds: Option[List[String]],
  adGroupStatuses: Option[List[AdGroupSummaryStatus]],
  adIds: Option[List[String]],
  adStatuses: Option[List[PinPromotionSummaryStatus]],
  attributionTypes: Option[List[ConversionReportAttributionType]],
  campaignBrandLabel: Option[String],
  campaignCustomLabel: Option[String],
  campaignIds: Option[List[String]],
  campaignObjectiveTypes: Option[List[CampaignObjectiveType]],
  campaignStatuses: Option[List[CampaignSummaryStatus]],
  clickWindowDays: Option[ConversionAttributionWindowDays],
  columns: Option[List[ReportingColumnAsync]],
  combineTargetingTypes: Option[Boolean],
  conversionReportTime: Option[ConversionReportTimeType],
  customConversionEventMetrics: Option[List[CustomConversionEventMetrics]],
  endDate: String,
  endHour: Option[Int],
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  granularity: Granularity,
  level: Option[MetricsReportingLevel],
  metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
  primarySort: Option[PrimarySort],
  productGroupIds: Option[List[String]],
  productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
  productItemIds: Option[List[String]],
  reportFormat: Option[DataOutputFormat],
  reportingTimezone: Option[ReportingTimeZone],
  startDate: String,
  startHour: Option[Int],
  targetingTypes: Option[List[AdAdsAnalyticsAsyncTargetingTypes]],
  viewWindowDays: Option[ConversionAttributionWindowDays]
)

object AdsAnalyticsCreateAsyncRequest {
  implicit lazy val adsAnalyticsCreateAsyncRequestJsonFormat: Format[AdsAnalyticsCreateAsyncRequest] = Json.format[AdsAnalyticsCreateAsyncRequest]
}

