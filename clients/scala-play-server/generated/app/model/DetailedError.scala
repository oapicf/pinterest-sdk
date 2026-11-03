package model

import play.api.libs.json._

/**
  * Used for including extra details to a base error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DetailedError(
  code: Int,
  details: JsObject,
  message: String
)

object DetailedError {
  implicit lazy val detailedErrorJsonFormat: Format[DetailedError] = Json.format[DetailedError]
}

