package model

import play.api.libs.json._

/**
  * Used for including extra details to a base error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DetailedError(
  code: Int,
  message: String,
  details: JsObject
)

object DetailedError {
  implicit lazy val detailedErrorJsonFormat: Format[DetailedError] = Json.format[DetailedError]
}

