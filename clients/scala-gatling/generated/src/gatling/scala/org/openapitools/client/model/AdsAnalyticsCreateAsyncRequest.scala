
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequest (
    /* List of types of attribution for the conversion report */
    _attributionTypes: Option[List[ConversionReportAttributionType]],
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _engagementWindowDays: Option[ConversionAttributionWindowDays],
    /* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
    _granularity: Granularity,
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    _viewWindowDays: Option[ConversionAttributionWindowDays],
    /* List of campaign ids */
    _campaignIds: Option[List[String]],
    /* List of status values for filtering */
    _campaignStatuses: Option[List[CampaignSummaryStatus]],
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    _campaignObjectiveTypes: Option[List[ObjectiveType]],
    /* Campaign brand label for filtering. */
    _campaignBrandLabel: Option[String],
    /* List of ad group ids */
    _adGroupIds: Option[List[String]],
    /* List of values for filtering */
    _adGroupStatuses: Option[List[AdGroupSummaryStatus]],
    /* List of ad ids [This parameter is no supported for Product Item Level Reports] */
    _adIds: Option[List[String]],
    /* List of values for filtering [This parameter is not supported for Product Item Level Reports] */
    _adStatuses: Option[List[PinPromotionSummaryStatus]],
    /* List of product group ids */
    _productGroupIds: Option[List[String]],
    /* List of values for filtering */
    _productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
    /* List of product item ids */
    _productItemIds: Option[List[String]],
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
    _targetingTypes: Option[List[String]],
    /* List of metrics filters */
    _metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. */
    _columns: List[ReportingColumnAsync],
    /* Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users. */
    _combineTargetingTypes: Option[Boolean],
    /* List of advertiser-defined custom conversion event metrics to include in the report */
    _customConversionEventMetrics: Option[List[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]],
    /* Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. */
    _endHour: Option[Integer],
    /* Level of the report */
    _level: MetricsReportingLevel,
    /* Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. */
    _primarySort: Option[String],
    /* Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. */
    _reportFormat: Option[DataOutputFormat],
    /* Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. */
    _reportingTimezone: Option[ReportingTimeZone],
    /* Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. */
    _startHour: Option[Integer]
)
object AdsAnalyticsCreateAsyncRequest {
    def toStringBody(var_attributionTypes: Object, var_clickWindowDays: Object, var_conversionReportTime: Object, var_endDate: Object, var_engagementWindowDays: Object, var_granularity: Object, var_startDate: Object, var_viewWindowDays: Object, var_campaignIds: Object, var_campaignStatuses: Object, var_campaignObjectiveTypes: Object, var_campaignBrandLabel: Object, var_adGroupIds: Object, var_adGroupStatuses: Object, var_adIds: Object, var_adStatuses: Object, var_productGroupIds: Object, var_productGroupStatuses: Object, var_productItemIds: Object, var_targetingTypes: Object, var_metricsFilters: Object, var_columns: Object, var_combineTargetingTypes: Object, var_customConversionEventMetrics: Object, var_endHour: Object, var_level: Object, var_primarySort: Object, var_reportFormat: Object, var_reportingTimezone: Object, var_startHour: Object) =
        s"""
        | {
        | "attributionTypes":$var_attributionTypes,"clickWindowDays":$var_clickWindowDays,"conversionReportTime":$var_conversionReportTime,"endDate":$var_endDate,"engagementWindowDays":$var_engagementWindowDays,"granularity":$var_granularity,"startDate":$var_startDate,"viewWindowDays":$var_viewWindowDays,"campaignIds":$var_campaignIds,"campaignStatuses":$var_campaignStatuses,"campaignObjectiveTypes":$var_campaignObjectiveTypes,"campaignBrandLabel":$var_campaignBrandLabel,"adGroupIds":$var_adGroupIds,"adGroupStatuses":$var_adGroupStatuses,"adIds":$var_adIds,"adStatuses":$var_adStatuses,"productGroupIds":$var_productGroupIds,"productGroupStatuses":$var_productGroupStatuses,"productItemIds":$var_productItemIds,"targetingTypes":$var_targetingTypes,"metricsFilters":$var_metricsFilters,"columns":$var_columns,"combineTargetingTypes":$var_combineTargetingTypes,"customConversionEventMetrics":$var_customConversionEventMetrics,"endHour":$var_endHour,"level":$var_level,"primarySort":$var_primarySort,"reportFormat":$var_reportFormat,"reportingTimezone":$var_reportingTimezone,"startHour":$var_startHour
        | }
        """.stripMargin
}
