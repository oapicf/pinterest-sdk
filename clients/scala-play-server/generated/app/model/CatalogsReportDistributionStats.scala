package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReportDistributionStats.
  * @param catalogId ID of the catalog entity.
  * @param code The event code that a diagnostics aggregated number references
  * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM')
  * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
  * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
  * @param message Title message describing the diagnostic issue
  * @param occurrences Number of occurrences of the issue
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsReportDistributionStats(
  catalogId: Option[String],
  code: Option[Int],
  codeLabel: Option[String],
  ineligibleForAds: Option[Boolean],
  ineligibleForOrganic: Option[Boolean],
  message: Option[String],
  occurrences: Option[Int],
  reportType: Option[CatalogsReportDistributionStats.ReportType.Value]
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

