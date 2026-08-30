package org.openapitools.server.model


/**
 * @param adGroupIds List of ad group ids for example: ''null''
 * @param adGroupStatuses List of values for filtering for example: ''null''
 * @param adIds List of ad ids. This parameter is not supported for Product Item level reports. for example: ''null''
 * @param adStatuses List of values for filtering. This parameter is not supported for Product Item level reports. for example: ''null''
 * @param attributionTypes List of attribution types for the conversion report. for example: ''null''
 * @param campaignBrandLabel Campaign brand label for filtering. for example: ''null''
 * @param campaignCustomLabel Campaign custom label for filtering. for example: ''null''
 * @param campaignIds List of campaign ids for example: ''null''
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. for example: ''null''
 * @param campaignStatuses List of status values for filtering for example: ''null''
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. for example: ''null''
 * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. for example: ''null''
 * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown. for example: ''null''
 * @param conversionReportTime Date dimension for conversion metrics. for example: ''null''
 * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report for example: ''null''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD for example: ''null''
 * @param endHour Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. for example: ''null''
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. for example: ''null''
 * @param granularity   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param metricsFilters List of metrics filters for example: ''null''
 * @param primarySort  for example: ''null''
 * @param productGroupIds List of product group ids for example: ''null''
 * @param productGroupStatuses List of values for filtering for example: ''null''
 * @param productItemIds List of product item ids for example: ''null''
 * @param reportFormat  for example: ''null''
 * @param reportingTimezone Specify the timezone to be applied for the reporting. for example: ''null''
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD for example: ''null''
 * @param startHour Which hour of the start date to begin the report. Only allowed for hourly reports. for example: ''null''
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. for example: ''null''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequest (
  adGroupIds: Option[Seq[String]] = None,
  adGroupStatuses: Option[Seq[AdGroupSummaryStatus]] = None,
  adIds: Option[Seq[String]] = None,
  adStatuses: Option[Seq[PinPromotionSummaryStatus]] = None,
  attributionTypes: Option[Seq[ConversionReportAttributionType]] = None,
  campaignBrandLabel: Option[String] = None,
  campaignCustomLabel: Option[String] = None,
  campaignIds: Option[Seq[String]] = None,
  campaignObjectiveTypes: Option[Seq[CampaignObjectiveType]] = None,
  campaignStatuses: Option[Seq[CampaignSummaryStatus]] = None,
  clickWindowDays: Option[ConversionAttributionWindowDays] = None,
  columns: Option[Seq[ReportingColumnAsync]] = None,
  combineTargetingTypes: Option[Boolean] = None,
  conversionReportTime: Option[ConversionReportTimeType] = None,
  customConversionEventMetrics: Option[Seq[CustomConversionEventMetrics]] = None,
  endDate: String,
  endHour: Option[Int] = None,
  engagementWindowDays: Option[ConversionAttributionWindowDays] = None,
  granularity: Granularity,
  level: Option[MetricsReportingLevel] = None,
  metricsFilters: Option[Seq[AdsAnalyticsMetricsFilter]] = None,
  primarySort: Option[PrimarySort] = None,
  productGroupIds: Option[Seq[String]] = None,
  productGroupStatuses: Option[Seq[ProductGroupSummaryStatus]] = None,
  productItemIds: Option[Seq[String]] = None,
  reportFormat: Option[DataOutputFormat] = None,
  reportingTimezone: Option[ReportingTimeZone] = None,
  startDate: String,
  startHour: Option[Int] = None,
  targetingTypes: Option[Seq[AdAdsAnalyticsAsyncTargetingTypes]] = None,
  viewWindowDays: Option[ConversionAttributionWindowDays] = None
)

