package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for reports_stats_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ReportsStats200Response(
  items: List[CatalogsReportStats],
  bookmark: Option[String]
)

object ReportsStats200Response {
  implicit lazy val reportsStats200ResponseJsonFormat: Format[ReportsStats200Response] = Json.format[ReportsStats200Response]
}

