package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param carouselSlots Carousel Pin slots data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinUpdate(
  aiDisclosures: Option[AiDisclosuresUpdate],
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  carouselSlots: Option[List[CarouselSlot]],
  description: Option[String],
  link: Option[String],
  title: Option[String]
)

object PinUpdate {
  implicit lazy val pinUpdateJsonFormat: Format[PinUpdate] = Json.format[PinUpdate]
}

