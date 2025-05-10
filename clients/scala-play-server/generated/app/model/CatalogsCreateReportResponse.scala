package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreateReportResponse.
  * @param token Token to be used to get the report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsCreateReportResponse(
  token: Option[String]
)

object CatalogsCreateReportResponse {
  implicit lazy val catalogsCreateReportResponseJsonFormat: Format[CatalogsCreateReportResponse] = Json.format[CatalogsCreateReportResponse]
}

