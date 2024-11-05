package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReportDistributionStats.
  * @param catalogId ID of the catalog entity.
  * @param code The event code that a diagnostics aggregated number references
  * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM')
  * @param message Title message describing the diagnostic issue
  * @param occurrences Number of occurrences of the issue
  * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
  * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsReportDistributionStats(
  reportType: Option[CatalogsReportDistributionStats.ReportType.Value],
  catalogId: Option[String],
  code: Option[Int],
  codeLabel: Option[String],
  message: Option[String],
  occurrences: Option[Int],
  ineligibleForAds: Option[Boolean],
  ineligibleForOrganic: Option[Boolean]
)

object CatalogsReportDistributionStats {
  implicit lazy val catalogsReportDistributionStatsJsonFormat: Format[CatalogsReportDistributionStats] = Json.format[CatalogsReportDistributionStats]

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val DISTRIBUTIONISSUES = Value("DISTRIBUTION_ISSUES")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

