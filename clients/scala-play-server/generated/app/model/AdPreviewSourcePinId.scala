package model

import play.api.libs.json._

/**
  * Ad preview source from an existing Pin.
  * @param creativeType Creative type of the ad preview.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdPreviewSourcePinId(
  creativeType: Option[AdPinPreviewCreativeType],
  pinId: String
)

object AdPreviewSourcePinId {
  implicit lazy val adPreviewSourcePinIdJsonFormat: Format[AdPreviewSourcePinId] = Json.format[AdPreviewSourcePinId]
}

