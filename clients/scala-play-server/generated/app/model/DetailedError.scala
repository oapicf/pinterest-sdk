package model

import play.api.libs.json._

/**
  * Used for including extra details to a base error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DetailedError(
  code: Int,
  message: String,
  details: JsObject
)

object DetailedError {
  implicit lazy val detailedErrorJsonFormat: Format[DetailedError] = Json.format[DetailedError]
}

