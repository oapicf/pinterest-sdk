package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Pin model containing properties related to a Pinterest Pin.
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`.
  * @param hasBeenPromoted Whether the Pin has been promoted or not.
  * @param isOwner Whether the \"operation user_account\" is the Pin owner.
  * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  * @param pinMetrics Pin metrics with associated time intervals if any.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Pin(
  altText: Option[String],
  boardId: Option[String],
  boardOwner: Option[BoardOwner],
  boardSectionId: Option[String],
  createdAt: Option[OffsetDateTime],
  creativeType: Option[CreativeType],
  description: Option[String],
  dominantColor: Option[String],
  hasBeenPromoted: Option[Boolean],
  id: String,
  isOwner: Option[Boolean],
  isStandard: Option[Boolean],
  link: Option[String],
  media: Option[PinMedia],
  parentPinId: Option[String],
  pinMetrics: Option[JsObject],
  title: Option[String]
)

object Pin {
  implicit lazy val pinJsonFormat: Format[Pin] = Json.format[Pin]
}

