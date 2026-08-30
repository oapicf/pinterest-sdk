package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesProcessCSVError.
  * @param errorType The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
  * @param rowNumber The row number with a validation error. -1 indicates a file-level error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DynamicTitlesProcessCSVError(
  errorType: Option[String],
  rowNumber: Option[Int]
)

object DynamicTitlesProcessCSVError {
  implicit lazy val dynamicTitlesProcessCSVErrorJsonFormat: Format[DynamicTitlesProcessCSVError] = Json.format[DynamicTitlesProcessCSVError]
}

