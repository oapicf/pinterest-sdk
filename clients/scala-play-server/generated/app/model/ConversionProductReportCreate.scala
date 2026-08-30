package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param adGroupIds   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
  * @param campaignIds   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param columns Metric and entity columns
  * @param conversionProductAttributionType   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  * @param conversionProductBreakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @param endDate   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
  * @param granularity Report granularity for time-based metric aggregation
  * @param level Level of the report
  * @param productSkuIds   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  * @param reportName Name of the conversion product report
  * @param startDate   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionProductReportCreate(
  adGroupIds: Option[List[String]],
  campaignIds: Option[List[String]],
  campaignObjectiveTypes: Option[List[ConversionObjectiveType]],
  clickWindowDays: Option[ConversionAttributionWindowDays],
  columns: List[ConversionProductReportingColumn],
  conversionProductAttributionType: Option[ConversionProductAttributionType],
  conversionProductBreakdown: Option[ConversionProductReportBreakdownType],
  conversionReportTime: Option[ConversionReportTimeType],
  endDate: String,
  granularity: ConversionProductReportGranularity,
  level: ConversionProductReportLevel,
  productSkuIds: Option[List[String]],
  reportName: String,
  startDate: String,
  viewWindowDays: Option[ConversionAttributionWindowDays]
)

object ConversionProductReportCreate {
  implicit lazy val conversionProductReportCreateJsonFormat: Format[ConversionProductReportCreate] = Json.format[ConversionProductReportCreate]
}

