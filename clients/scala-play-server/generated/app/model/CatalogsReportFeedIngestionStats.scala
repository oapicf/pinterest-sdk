package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReportFeedIngestionStats.
  * @param catalogId ID of the catalog entity.
  * @param code The event code that a diagnostics aggregated number references
  * @param codeLabel A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
  * @param message Title message describing the diagnostic issue
  * @param occurrences Number of occurrences of the issue
  * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsReportFeedIngestionStats(
  reportType: Option[CatalogsReportFeedIngestionStats.ReportType.Value],
  catalogId: Option[String],
  code: Option[Int],
  codeLabel: Option[String],
  message: Option[String],
  occurrences: Option[Int],
  severity: Option[CatalogsReportFeedIngestionStats.Severity.Value]
)

object CatalogsReportFeedIngestionStats {
  implicit lazy val catalogsReportFeedIngestionStatsJsonFormat: Format[CatalogsReportFeedIngestionStats] = Json.format[CatalogsReportFeedIngestionStats]

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val FEEDINGESTIONISSUES = Value("FEED_INGESTION_ISSUES")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Severity extends Enumeration {
    val WARN = Value("WARN")
    val ERROR = Value("ERROR")

    type Severity = Value
    implicit lazy val SeverityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

