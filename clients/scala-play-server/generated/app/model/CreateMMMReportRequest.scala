package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportRequest.
  * @param reportName Name of the Marketing Mix Modeling (MMM) report
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  * @param level Level of the report
  * @param targetingTypes List of targeting types
  * @param columns Metric and entity columns
  * @param countries A List of countries for filtering
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateMMMReportRequest(
  reportName: String,
  startDate: String,
  endDate: String,
  granularity: CreateMMMReportRequest.Granularity.Value,
  level: CreateMMMReportRequest.Level.Value,
  targetingTypes: List[MMMReportingTargetingType],
  columns: List[MMMReportingColumn],
  countries: Option[List[TargetingAdvertiserCountry]]
)

object CreateMMMReportRequest {
  implicit lazy val createMMMReportRequestJsonFormat: Format[CreateMMMReportRequest] = Json.format[CreateMMMReportRequest]

  // noinspection TypeAnnotation
  object Granularity extends Enumeration {
    val DAY = Value("DAY")
    val WEEK = Value("WEEK")

    type Granularity = Value
    implicit lazy val GranularityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Level extends Enumeration {
    val CAMPAIGNTARGETING = Value("CAMPAIGN_TARGETING")
    val ADGROUPTARGETING = Value("AD_GROUP_TARGETING")

    type Level = Value
    implicit lazy val LevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

