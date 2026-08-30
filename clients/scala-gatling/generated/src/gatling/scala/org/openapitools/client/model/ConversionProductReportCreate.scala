
package org.openapitools.client.model


case class ConversionProductReportCreate (
    /*   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. */
    _adGroupIds: Option[List[String]],
    /*   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. */
    _campaignIds: Option[List[String]],
    /* List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. */
    _campaignObjectiveTypes: Option[List[ConversionObjectiveType]],
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* Metric and entity columns */
    _columns: List[ConversionProductReportingColumn],
    /*   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. */
    _conversionProductAttributionType: Option[ConversionProductAttributionType],
    /* Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. */
    _conversionProductBreakdown: Option[ConversionProductReportBreakdownType],
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /*   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. */
    _endDate: String,
    /* Report granularity for time-based metric aggregation */
    _granularity: ConversionProductReportGranularity,
    /* Level of the report */
    _level: ConversionProductReportLevel,
    /*   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. */
    _productSkuIds: Option[List[String]],
    /* Name of the conversion product report */
    _reportName: String,
    /*   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. */
    _startDate: String,
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    _viewWindowDays: Option[ConversionAttributionWindowDays]
)
object ConversionProductReportCreate {
    def toStringBody(var_adGroupIds: Object, var_campaignIds: Object, var_campaignObjectiveTypes: Object, var_clickWindowDays: Object, var_columns: Object, var_conversionProductAttributionType: Object, var_conversionProductBreakdown: Object, var_conversionReportTime: Object, var_endDate: Object, var_granularity: Object, var_level: Object, var_productSkuIds: Object, var_reportName: Object, var_startDate: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "adGroupIds":$var_adGroupIds,"campaignIds":$var_campaignIds,"campaignObjectiveTypes":$var_campaignObjectiveTypes,"clickWindowDays":$var_clickWindowDays,"columns":$var_columns,"conversionProductAttributionType":$var_conversionProductAttributionType,"conversionProductBreakdown":$var_conversionProductBreakdown,"conversionReportTime":$var_conversionReportTime,"endDate":$var_endDate,"granularity":$var_granularity,"level":$var_level,"productSkuIds":$var_productSkuIds,"reportName":$var_reportName,"startDate":$var_startDate,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
