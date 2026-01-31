
package org.openapitools.client.model


case class ConversionProductReportRequest (
    /* List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. */
    _adGroupIds: Option[List[String]],
    /* List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. */
    _campaignIds: Option[List[String]],
    /* List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. */
    _campaignObjectiveTypes: Option[List[ObjectiveType]],
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* Metric and entity columns */
    _columns: List[ConversionProductReportingColumn],
    _conversionProductAttributionType: Option[String],
    _conversionProductBreakdown: Option[String],
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /* Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. */
    _endDate: String,
    /* TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. */
    _granularity: String,
    /* Level of the report */
    _level: String,
    /* List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. */
    _productSkuIds: Option[List[String]],
    /* Name of the conversion product report. */
    _reportName: String,
    /* Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. */
    _startDate: String,
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day. */
    _viewWindowDays: Option[ConversionAttributionWindowDays]
)
object ConversionProductReportRequest {
    def toStringBody(var_adGroupIds: Object, var_campaignIds: Object, var_campaignObjectiveTypes: Object, var_clickWindowDays: Object, var_columns: Object, var_conversionProductAttributionType: Object, var_conversionProductBreakdown: Object, var_conversionReportTime: Object, var_endDate: Object, var_granularity: Object, var_level: Object, var_productSkuIds: Object, var_reportName: Object, var_startDate: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "adGroupIds":$var_adGroupIds,"campaignIds":$var_campaignIds,"campaignObjectiveTypes":$var_campaignObjectiveTypes,"clickWindowDays":$var_clickWindowDays,"columns":$var_columns,"conversionProductAttributionType":$var_conversionProductAttributionType,"conversionProductBreakdown":$var_conversionProductBreakdown,"conversionReportTime":$var_conversionReportTime,"endDate":$var_endDate,"granularity":$var_granularity,"level":$var_level,"productSkuIds":$var_productSkuIds,"reportName":$var_reportName,"startDate":$var_startDate,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
