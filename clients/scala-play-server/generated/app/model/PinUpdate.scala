package model

import play.api.libs.json._

/**
  * Pin fields for updates
  * @param altText Pin's alternative text.
  * @param boardId The id of the board to move the Pin onto.
  * @param boardSectionId <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
  * @param description Pin description - 800 characters maximum.
  * @param link URL viewer is taken to when they click pin.
  * @param title The native pin title that creators explicitly prefer to display.
  * @param carouselSlots Carousel Pin slots data.
  * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinUpdate(
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  description: Option[String],
  link: Option[String],
  title: Option[String],
  carouselSlots: Option[List[PinUpdateCarouselSlotsInner]],
  note: Option[String]
)

object PinUpdate {
  implicit lazy val pinUpdateJsonFormat: Format[PinUpdate] = Json.format[PinUpdate]
}

