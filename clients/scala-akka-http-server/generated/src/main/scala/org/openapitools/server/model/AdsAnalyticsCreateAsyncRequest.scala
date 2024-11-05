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
 * @param campaignIds List of campaign ids for example: ''["12345678"]''
 * @param campaignStatuses List of status values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA. for example: ''["AWARENESS","VIDEO_VIEW"]''
 * @param adGroupIds List of ad group ids for example: ''["12345678"]''
 * @param adGroupStatuses List of values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param adIds List of ad ids [This parameter is no supported for Product Item Level Reports] for example: ''["12345678"]''
 * @param adStatuses List of values for filtering [This parameter is not supported for Product Item Level Reports] for example: ''["APPROVED","PAUSED"]''
 * @param productGroupIds List of product group ids for example: ''["12345678"]''
 * @param productGroupStatuses List of values for filtering for example: ''["RUNNING","PAUSED"]''
 * @param productItemIds List of product item ids for example: ''["12345678"]''
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. for example: ''null''
 * @param metricsFilters List of metrics filters for example: ''null''
 * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param reportFormat Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. for example: ''null''
 * @param primarySort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. for example: ''BY_ID''
 * @param startHour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. for example: ''null''
 * @param endHour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequest (
  startDate: String,
  endDate: String,
  granularity: Granularity,
  clickWindowDays: Option[ConversionAttributionWindowDays] = None,
  engagementWindowDays: Option[ConversionAttributionWindowDays] = None,
  viewWindowDays: Option[ConversionAttributionWindowDays] = None,
  conversionReportTime: Option[ConversionReportTimeType] = None,
  attributionTypes: Option[Seq[ConversionReportAttributionType]] = None,
  campaignIds: Option[Seq[String]] = None,
  campaignStatuses: Option[Seq[CampaignSummaryStatus]] = None,
  campaignObjectiveTypes: Option[Seq[ObjectiveType]] = None,
  adGroupIds: Option[Seq[String]] = None,
  adGroupStatuses: Option[Seq[AdGroupSummaryStatus]] = None,
  adIds: Option[Seq[String]] = None,
  adStatuses: Option[Seq[PinPromotionSummaryStatus]] = None,
  productGroupIds: Option[Seq[String]] = None,
  productGroupStatuses: Option[Seq[ProductGroupSummaryStatus]] = None,
  productItemIds: Option[Seq[String]] = None,
  targetingTypes: Option[Seq[AdsAnalyticsTargetingType]] = None,
  metricsFilters: Option[Seq[AdsAnalyticsMetricsFilter]] = None,
  columns: Seq[ReportingColumnAsync],
  level: MetricsReportingLevel,
  reportFormat: Option[DataOutputFormat] = None,
  primarySort: Option[String] = None,
  startHour: Option[Int] = None,
  endHour: Option[Int] = None
)

