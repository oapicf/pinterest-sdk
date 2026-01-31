package model

import play.api.libs.json._

/**
  * Request for a brand, category, SKU report
  * @param adGroupIds List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
  * @param campaignIds List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
  * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param columns Metric and entity columns
  * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
  * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  * @param level Level of the report
  * @param productSkuIds List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  * @param reportName Name of the conversion product report.
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionProductReportRequest(
  adGroupIds: Option[List[String]],
  campaignIds: Option[List[String]],
  campaignObjectiveTypes: Option[List[ObjectiveType]],
  clickWindowDays: Option[ConversionAttributionWindowDays],
  columns: List[ConversionProductReportingColumn],
  conversionProductAttributionType: Option[ConversionProductReportRequest.ConversionProductAttributionType.Value],
  conversionProductBreakdown: Option[ConversionProductReportRequest.ConversionProductBreakdown.Value],
  conversionReportTime: Option[ConversionReportTimeType],
  endDate: String,
  granularity: ConversionProductReportRequest.Granularity.Value,
  level: ConversionProductReportRequest.Level.Value,
  productSkuIds: Option[List[String]],
  reportName: String,
  startDate: String,
  viewWindowDays: Option[ConversionAttributionWindowDays]
)

object ConversionProductReportRequest {
  implicit lazy val conversionProductReportRequestJsonFormat: Format[ConversionProductReportRequest] = Json.format[ConversionProductReportRequest]

  // noinspection TypeAnnotation
  object ConversionProductAttributionType extends Enumeration {
    val DEFAULT = Value("DEFAULT")
    val BRANDATTRIBUTION = Value("BRAND_ATTRIBUTION")

    type ConversionProductAttributionType = Value
    implicit lazy val ConversionProductAttributionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ConversionProductBreakdown extends Enumeration {
    val PRODUCTBRAND = Value("PRODUCT_BRAND")
    val PRODUCTCATEGORY = Value("PRODUCT_CATEGORY")
    val PRODUCTBRANDANDCATEGORY = Value("PRODUCT_BRAND_AND_CATEGORY")
    val PRODUCTSKU = Value("PRODUCT_SKU")
    val PRODUCTSKUGROUP = Value("PRODUCT_SKU_GROUP")

    type ConversionProductBreakdown = Value
    implicit lazy val ConversionProductBreakdownJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Granularity extends Enumeration {
    val WEEK = Value("WEEK")
    val MONTH = Value("MONTH")
    val TOTAL = Value("TOTAL")

    type Granularity = Value
    implicit lazy val GranularityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Level extends Enumeration {
    val ADVERTISER = Value("ADVERTISER")
    val CAMPAIGN = Value("CAMPAIGN")
    val ADGROUP = Value("AD_GROUP")

    type Level = Value
    implicit lazy val LevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

