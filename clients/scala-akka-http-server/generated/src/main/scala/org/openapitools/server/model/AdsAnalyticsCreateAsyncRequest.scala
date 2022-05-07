package org.openapitools.server.model


/**
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly for example: ''null''
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. for example: ''null''
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. for example: ''null''
 * @param attributionTypes List of types of attribution for the conversion report for example: ''null''
 * @param columns Metric and entity columns for example: ''null''
 * @param level Level of the report for example: ''CAMPAIGN''
 * @param reportFormat Specification for formatting report data for example: ''null''
 * @param campaignIds List of campaign ids for example: ''["12345678"]''
 * @param campaignStatuses List of status values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param campaignObjectiveTypes List of values for filtering for example: ''["AWARENESS","VIDEO_VIEW"]''
 * @param adGroupIds List of ad group ids for example: ''["12345678"]''
 * @param adGroupStatuses List of values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param adIds List of ad ids for example: ''["12345678"]''
 * @param adStatuses List of values for filtering for example: ''["APPROVED","PAUSED"]''
 * @param productGroupIds List of product group ids for example: ''["12345678"]''
 * @param productGroupStatuses List of values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param productItemIds List of product item ids for example: ''["12345678"]''
 * @param targetingTypes List of targeting types for example: ''null''
 * @param metricsFilters List of metrics filters for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequest (
  startDate: String,
  endDate: String,
  granularity: Granularity,
  clickWindowDays: Option[ConversionAttributionWindowDays],
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  viewWindowDays: Option[ConversionAttributionWindowDays],
  conversionReportTime: Option[ConversionReportTimeType],
  attributionTypes: Option[Seq[ConversionReportAttributionType]],
  columns: Seq[ReportingColumnAsync],
  level: MetricsReportingLevel,
  reportFormat: Option[DataOutputFormat],
  campaignIds: Option[Seq[String]],
  campaignStatuses: Option[Seq[CampaignSummaryStatus]],
  campaignObjectiveTypes: Option[Seq[ObjectiveType]],
  adGroupIds: Option[Seq[String]],
  adGroupStatuses: Option[Seq[AdGroupSummaryStatus]],
  adIds: Option[Seq[String]],
  adStatuses: Option[Seq[PinPromotionSummaryStatus]],
  productGroupIds: Option[Seq[String]],
  productGroupStatuses: Option[Seq[ProductGroupSummaryStatus]],
  productItemIds: Option[Seq[String]],
  targetingTypes: Option[Seq[AdsAnalyticsTargetingType]],
  metricsFilters: Option[Seq[AdsAnalyticsMetricsFilter]]
)

