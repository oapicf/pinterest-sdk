package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelReportParameters_report.
  * @param feedId ID of the feed entity.
  * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelReportParametersReport(
  reportType: Option[CatalogsHotelReportParametersReport.ReportType.Value],
  feedId: String,
  processingResultId: Option[String],
  catalogId: Option[String]
)

object CatalogsHotelReportParametersReport {
  implicit lazy val catalogsHotelReportParametersReportJsonFormat: Format[CatalogsHotelReportParametersReport] = Json.format[CatalogsHotelReportParametersReport]

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val FEEDINGESTIONISSUES = Value("FEED_INGESTION_ISSUES")
    val DISTRIBUTIONISSUES = Value("DISTRIBUTION_ISSUES")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

