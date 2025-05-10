package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromPin.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdPreviewCreateFromPin(
  pinId: String
)

object AdPreviewCreateFromPin {
  implicit lazy val adPreviewCreateFromPinJsonFormat: Format[AdPreviewCreateFromPin] = Json.format[AdPreviewCreateFromPin]
}

