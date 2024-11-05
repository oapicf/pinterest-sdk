package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromPin.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdPreviewCreateFromPin(
  pinId: String
)

object AdPreviewCreateFromPin {
  implicit lazy val adPreviewCreateFromPinJsonFormat: Format[AdPreviewCreateFromPin] = Json.format[AdPreviewCreateFromPin]
}

