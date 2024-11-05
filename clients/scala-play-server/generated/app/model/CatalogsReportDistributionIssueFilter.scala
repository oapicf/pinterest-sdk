package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReportDistributionIssueFilter.
  * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsReportDistributionIssueFilter(
  reportType: CatalogsReportDistributionIssueFilter.ReportType.Value,
  catalogId: Option[String]
)

object CatalogsReportDistributionIssueFilter {
  implicit lazy val catalogsReportDistributionIssueFilterJsonFormat: Format[CatalogsReportDistributionIssueFilter] = Json.format[CatalogsReportDistributionIssueFilter]

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val DISTRIBUTIONISSUES = Value("DISTRIBUTION_ISSUES")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

