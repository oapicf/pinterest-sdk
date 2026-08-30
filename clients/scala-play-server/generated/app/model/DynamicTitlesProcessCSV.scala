package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesProcessCSV.
  * @param errors List of validation errors. Empty on success.
  * @param status Processing status. Present on success.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DynamicTitlesProcessCSV(
  errors: Option[List[DynamicTitlesProcessCSVError]],
  status: Option[String]
)

object DynamicTitlesProcessCSV {
  implicit lazy val dynamicTitlesProcessCSVJsonFormat: Format[DynamicTitlesProcessCSV] = Json.format[DynamicTitlesProcessCSV]
}

