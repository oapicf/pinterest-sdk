package model

import play.api.libs.json._

/**
  * Used for including extra details to a base error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DetailedError(
  code: Int,
  details: JsObject,
  message: String
)

object DetailedError {
  implicit lazy val detailedErrorJsonFormat: Format[DetailedError] = Json.format[DetailedError]
}

