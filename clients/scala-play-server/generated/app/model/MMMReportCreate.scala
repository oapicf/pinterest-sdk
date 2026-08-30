package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param advertiserIds Advertiser IDs for multi-advertiser report
  * @param columns Metric and entity columns
  * @param countries A List of countries for filtering
  * @param customColumnIds List of custom column IDs
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param granularity   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
  * @param level Level of the report
  * @param reportName Name of the Marketing Mix Modeling (MMM) report
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param targetingTypes List of targeting types
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MMMReportCreate(
  advertiserIds: Option[List[String]],
  columns: List[MMMReportingColumn],
  countries: Option[List[TargetingAdvertiserCountry]],
  customColumnIds: Option[List[String]],
  endDate: String,
  granularity: MMMReportGranularity,
  level: MMMReportLevel,
  reportName: String,
  startDate: String,
  targetingTypes: List[MMMReportingTargetingType]
)

object MMMReportCreate {
  implicit lazy val mMMReportCreateJsonFormat: Format[MMMReportCreate] = Json.format[MMMReportCreate]
}

