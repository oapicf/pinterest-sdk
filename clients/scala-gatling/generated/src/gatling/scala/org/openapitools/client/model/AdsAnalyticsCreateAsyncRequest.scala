
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequest (
    /* List of ad group ids */
    _adGroupIds: Option[List[String]],
    /* List of values for filtering */
    _adGroupStatuses: Option[List[AdGroupSummaryStatus]],
    /* List of ad ids. This parameter is not supported for Product Item level reports. */
    _adIds: Option[List[String]],
    /* List of values for filtering. This parameter is not supported for Product Item level reports. */
    _adStatuses: Option[List[PinPromotionSummaryStatus]],
    /* List of attribution types for the conversion report. */
    _attributionTypes: Option[List[ConversionReportAttributionType]],
    /* Campaign brand label for filtering. */
    _campaignBrandLabel: Option[String],
    /* Campaign custom label for filtering. */
    _campaignCustomLabel: Option[String],
    /* List of campaign ids */
    _campaignIds: Option[List[String]],
    /* List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. */
    _campaignObjectiveTypes: Option[List[CampaignObjectiveType]],
    /* List of status values for filtering */
    _campaignStatuses: Option[List[CampaignSummaryStatus]],
    /* Number of days to use as the conversion attribution window for a pin click action. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. */
    _columns: Option[List[ReportingColumnAsync]],
    /* Determines if the targeting types included in the request should be consolidated into a single breakdown. */
    _combineTargetingTypes: Option[Boolean],
    /* Date dimension for conversion metrics. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /* List of advertiser-defined custom conversion event metrics to include in the report */
    _customConversionEventMetrics: Option[List[CustomConversionEventMetrics]],
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. */
    _endHour: Option[Integer],
    /* Number of days to use as the conversion attribution window for an engagement action. */
    _engagementWindowDays: Option[ConversionAttributionWindowDays],
    /*   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. */
    _granularity: Granularity,
    /* Level of the report */
    _level: Option[MetricsReportingLevel],
    /* List of metrics filters */
    _metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
    _primarySort: Option[PrimarySort],
    /* List of product group ids */
    _productGroupIds: Option[List[String]],
    /* List of values for filtering */
    _productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
    /* List of product item ids */
    _productItemIds: Option[List[String]],
    _reportFormat: Option[DataOutputFormat],
    /* Specify the timezone to be applied for the reporting. */
    _reportingTimezone: Option[ReportingTimeZone],
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Which hour of the start date to begin the report. Only allowed for hourly reports. */
    _startHour: Option[Integer],
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
    _targetingTypes: Option[List[AdAdsAnalyticsAsyncTargetingTypes]],
    /* Number of days to use as the conversion attribution window for a view action. */
    _viewWindowDays: Option[ConversionAttributionWindowDays]
)
object AdsAnalyticsCreateAsyncRequest {
    def toStringBody(var_adGroupIds: Object, var_adGroupStatuses: Object, var_adIds: Object, var_adStatuses: Object, var_attributionTypes: Object, var_campaignBrandLabel: Object, var_campaignCustomLabel: Object, var_campaignIds: Object, var_campaignObjectiveTypes: Object, var_campaignStatuses: Object, var_clickWindowDays: Object, var_columns: Object, var_combineTargetingTypes: Object, var_conversionReportTime: Object, var_customConversionEventMetrics: Object, var_endDate: Object, var_endHour: Object, var_engagementWindowDays: Object, var_granularity: Object, var_level: Object, var_metricsFilters: Object, var_primarySort: Object, var_productGroupIds: Object, var_productGroupStatuses: Object, var_productItemIds: Object, var_reportFormat: Object, var_reportingTimezone: Object, var_startDate: Object, var_startHour: Object, var_targetingTypes: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "adGroupIds":$var_adGroupIds,"adGroupStatuses":$var_adGroupStatuses,"adIds":$var_adIds,"adStatuses":$var_adStatuses,"attributionTypes":$var_attributionTypes,"campaignBrandLabel":$var_campaignBrandLabel,"campaignCustomLabel":$var_campaignCustomLabel,"campaignIds":$var_campaignIds,"campaignObjectiveTypes":$var_campaignObjectiveTypes,"campaignStatuses":$var_campaignStatuses,"clickWindowDays":$var_clickWindowDays,"columns":$var_columns,"combineTargetingTypes":$var_combineTargetingTypes,"conversionReportTime":$var_conversionReportTime,"customConversionEventMetrics":$var_customConversionEventMetrics,"endDate":$var_endDate,"endHour":$var_endHour,"engagementWindowDays":$var_engagementWindowDays,"granularity":$var_granularity,"level":$var_level,"metricsFilters":$var_metricsFilters,"primarySort":$var_primarySort,"productGroupIds":$var_productGroupIds,"productGroupStatuses":$var_productGroupStatuses,"productItemIds":$var_productItemIds,"reportFormat":$var_reportFormat,"reportingTimezone":$var_reportingTimezone,"startDate":$var_startDate,"startHour":$var_startHour,"targetingTypes":$var_targetingTypes,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
