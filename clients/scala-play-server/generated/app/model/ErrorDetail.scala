package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ErrorDetail.
  * @param count Number of records with this error
  * @param errorCode Numeric error code
  * @param message Error message description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ErrorDetail(
  count: Int,
  errorCode: Int,
  message: String
)

object ErrorDetail {
  implicit lazy val errorDetailJsonFormat: Format[ErrorDetail] = Json.format[ErrorDetail]
}

