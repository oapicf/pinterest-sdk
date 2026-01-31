package org.openapitools.server.model


/**
 * Request for a brand, category, SKU report
 *
 * @param adGroupIds List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. for example: ''["12345678"]''
 * @param campaignIds List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. for example: ''["12345678"]''
 * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. for example: ''null''
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param columns Metric and entity columns for example: ''null''
 * @param conversionProductAttributionType  for example: ''null''
 * @param conversionProductBreakdown  for example: ''null''
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. for example: ''null''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. for example: ''2024-04-23''
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param productSkuIds List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. for example: ''["WBC45678","WBC45679"]''
 * @param reportName Name of the conversion product report. for example: ''null''
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. for example: ''2024-03-17''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day. for example: ''null''
*/
final case class ConversionProductReportRequest (
  adGroupIds: Option[Seq[String]] = None,
  campaignIds: Option[Seq[String]] = None,
  campaignObjectiveTypes: Option[Seq[ObjectiveType]] = None,
  clickWindowDays: Option[ConversionAttributionWindowDays] = None,
  columns: Seq[ConversionProductReportingColumn],
  conversionProductAttributionType: Option[String] = None,
  conversionProductBreakdown: Option[String] = None,
  conversionReportTime: Option[ConversionReportTimeType] = None,
  endDate: String,
  granularity: String,
  level: String,
  productSkuIds: Option[Seq[String]] = None,
  reportName: String,
  startDate: String,
  viewWindowDays: Option[ConversionAttributionWindowDays] = None
)

