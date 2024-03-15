package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Pin
  * @param dominantColor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
  * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinCreate(
  id: Option[String],
  createdAt: Option[OffsetDateTime],
  link: Option[String],
  title: Option[String],
  description: Option[String],
  dominantColor: Option[String],
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  boardOwner: Option[BoardOwner],
  media: Option[SummaryPinMedia],
  mediaSource: Option[PinMediaSource],
  parentPinId: Option[String],
  note: Option[String]
)

object PinCreate {
  implicit lazy val pinCreateJsonFormat: Format[PinCreate] = Json.format[PinCreate]
}

