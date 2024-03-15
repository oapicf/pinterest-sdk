
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequest (
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
    _granularity: Granularity,
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _engagementWindowDays: Option[ConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    _viewWindowDays: Option[ConversionAttributionWindowDays],
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /* List of types of attribution for the conversion report */
    _attributionTypes: Option[List[ConversionReportAttributionType]],
    /* List of campaign ids */
    _campaignIds: Option[List[String]],
    /* List of status values for filtering */
    _campaignStatuses: Option[List[CampaignSummaryStatus]],
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    _campaignObjectiveTypes: Option[List[ObjectiveType]],
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
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
    _targetingTypes: Option[List[AdsAnalyticsTargetingType]],
    /* List of metrics filters */
    _metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. */
    _columns: List[ReportingColumnAsync],
    /* Level of the report */
    _level: MetricsReportingLevel,
    /* Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. */
    _reportFormat: Option[DataOutputFormat]
)
object AdsAnalyticsCreateAsyncRequest {
    def toStringBody(var_startDate: Object, var_endDate: Object, var_granularity: Object, var_clickWindowDays: Object, var_engagementWindowDays: Object, var_viewWindowDays: Object, var_conversionReportTime: Object, var_attributionTypes: Object, var_campaignIds: Object, var_campaignStatuses: Object, var_campaignObjectiveTypes: Object, var_adGroupIds: Object, var_adGroupStatuses: Object, var_adIds: Object, var_adStatuses: Object, var_productGroupIds: Object, var_productGroupStatuses: Object, var_productItemIds: Object, var_targetingTypes: Object, var_metricsFilters: Object, var_columns: Object, var_level: Object, var_reportFormat: Object) =
        s"""
        | {
        | "startDate":$var_startDate,"endDate":$var_endDate,"granularity":$var_granularity,"clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"viewWindowDays":$var_viewWindowDays,"conversionReportTime":$var_conversionReportTime,"attributionTypes":$var_attributionTypes,"campaignIds":$var_campaignIds,"campaignStatuses":$var_campaignStatuses,"campaignObjectiveTypes":$var_campaignObjectiveTypes,"adGroupIds":$var_adGroupIds,"adGroupStatuses":$var_adGroupStatuses,"adIds":$var_adIds,"adStatuses":$var_adStatuses,"productGroupIds":$var_productGroupIds,"productGroupStatuses":$var_productGroupStatuses,"productItemIds":$var_productItemIds,"targetingTypes":$var_targetingTypes,"metricsFilters":$var_metricsFilters,"columns":$var_columns,"level":$var_level,"reportFormat":$var_reportFormat
        | }
        """.stripMargin
}
