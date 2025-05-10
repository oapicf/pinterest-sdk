package model

import play.api.libs.json._

/**
  * Used for including extra details to a base error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DetailedError(
  code: Int,
  message: String,
  details: JsObject
)

object DetailedError {
  implicit lazy val detailedErrorJsonFormat: Format[DetailedError] = Json.format[DetailedError]
}

