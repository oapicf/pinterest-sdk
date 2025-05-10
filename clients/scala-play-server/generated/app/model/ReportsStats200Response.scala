package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for reports_stats_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ReportsStats200Response(
  items: List[CatalogsReportStats],
  bookmark: Option[String]
)

object ReportsStats200Response {
  implicit lazy val reportsStats200ResponseJsonFormat: Format[ReportsStats200Response] = Json.format[ReportsStats200Response]
}

