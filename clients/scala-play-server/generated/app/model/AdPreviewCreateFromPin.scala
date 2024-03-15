package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromPin.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdPreviewCreateFromPin(
  pinId: String
)

object AdPreviewCreateFromPin {
  implicit lazy val adPreviewCreateFromPinJsonFormat: Format[AdPreviewCreateFromPin] = Json.format[AdPreviewCreateFromPin]
}

