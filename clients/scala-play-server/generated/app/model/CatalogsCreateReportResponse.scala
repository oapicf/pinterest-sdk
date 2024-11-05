package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreateReportResponse.
  * @param token Token to be used to get the report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreateReportResponse(
  token: Option[String]
)

object CatalogsCreateReportResponse {
  implicit lazy val catalogsCreateReportResponseJsonFormat: Format[CatalogsCreateReportResponse] = Json.format[CatalogsCreateReportResponse]
}

