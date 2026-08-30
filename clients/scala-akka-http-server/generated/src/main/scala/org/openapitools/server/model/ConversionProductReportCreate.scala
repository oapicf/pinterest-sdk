package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param adGroupIds   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. for example: ''["12345678"]''
 * @param campaignIds   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. for example: ''["12345678"]''
 * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. for example: ''null''
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param columns Metric and entity columns for example: ''null''
 * @param conversionProductAttributionType   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. for example: ''null''
 * @param conversionProductBreakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. for example: ''null''
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. for example: ''null''
 * @param endDate   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. for example: ''2024-04-23''
 * @param granularity Report granularity for time-based metric aggregation for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param productSkuIds   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. for example: ''["WBC45678","WBC45679"]''
 * @param reportName Name of the conversion product report for example: ''null''
 * @param startDate   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. for example: ''2024-04-17''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. for example: ''null''
*/
final case class ConversionProductReportCreate (
  adGroupIds: Option[Seq[String]] = None,
  campaignIds: Option[Seq[String]] = None,
  campaignObjectiveTypes: Option[Seq[ConversionObjectiveType]] = None,
  clickWindowDays: Option[ConversionAttributionWindowDays] = None,
  columns: Seq[ConversionProductReportingColumn],
  conversionProductAttributionType: Option[ConversionProductAttributionType] = None,
  conversionProductBreakdown: Option[ConversionProductReportBreakdownType] = None,
  conversionReportTime: Option[ConversionReportTimeType] = None,
  endDate: String,
  granularity: ConversionProductReportGranularity,
  level: ConversionProductReportLevel,
  productSkuIds: Option[Seq[String]] = None,
  reportName: String,
  startDate: String,
  viewWindowDays: Option[ConversionAttributionWindowDays] = None
)

