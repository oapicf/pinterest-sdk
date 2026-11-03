package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesProcessCSVError.
  * @param errorType The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
  * @param rowNumber The row number with a validation error. -1 indicates a file-level error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DynamicTitlesProcessCSVError(
  errorType: Option[String],
  rowNumber: Option[Int]
)

object DynamicTitlesProcessCSVError {
  implicit lazy val dynamicTitlesProcessCSVErrorJsonFormat: Format[DynamicTitlesProcessCSVError] = Json.format[DynamicTitlesProcessCSVError]
}

