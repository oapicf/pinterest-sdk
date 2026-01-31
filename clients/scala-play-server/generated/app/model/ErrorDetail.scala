package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ErrorDetail.
  * @param count Number of records with this error
  * @param errorCode Numeric error code
  * @param message Error message description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ErrorDetail(
  count: Int,
  errorCode: Int,
  message: String
)

object ErrorDetail {
  implicit lazy val errorDetailJsonFormat: Format[ErrorDetail] = Json.format[ErrorDetail]
}

