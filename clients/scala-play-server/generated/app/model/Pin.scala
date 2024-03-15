package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Pin
  * @param dominantColor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param isOwner Whether the \"operation user_account\" is the Pin owner.
  * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
  * @param isStandard Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
  * @param hasBeenPromoted Whether the Pin has been promoted or not.
  * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  * @param pinMetrics Pin metrics with associated time intervals if any.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Pin(
  id: Option[String],
  createdAt: Option[OffsetDateTime],
  link: Option[String],
  title: Option[String],
  description: Option[String],
  dominantColor: Option[String],
  altText: Option[String],
  creativeType: Option[CreativeType],
  boardId: Option[String],
  boardSectionId: Option[String],
  boardOwner: Option[BoardOwner],
  isOwner: Option[Boolean],
  media: Option[SummaryPinMedia],
  mediaSource: Option[PinMediaSource],
  parentPinId: Option[String],
  isStandard: Option[Boolean],
  hasBeenPromoted: Option[Boolean],
  note: Option[String],
  pinMetrics: Option[JsObject]
)

object Pin {
  implicit lazy val pinJsonFormat: Format[Pin] = Json.format[Pin]
}

