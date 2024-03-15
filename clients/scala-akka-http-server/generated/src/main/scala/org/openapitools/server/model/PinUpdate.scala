package org.openapitools.server.model


/**
 * = PinUpdate =
 *
 * Pin fields for updates
 *
 * @param altText Pin's alternative text. for example: ''null''
 * @param boardId The id of the board to move the Pin onto. for example: ''null''
 * @param boardSectionId <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. for example: ''null''
 * @param description Pin description - 800 characters maximum. for example: ''null''
 * @param link URL viewer is taken to when they click pin. for example: ''https://www.pinterest.com/''
 * @param title The native pin title that creators explicitly prefer to display. for example: ''null''
 * @param carouselSlots Carousel Pin slots data. for example: ''null''
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. for example: ''null''
*/
final case class PinUpdate (
  altText: Option[String] = None,
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None,
  carouselSlots: Option[Seq[PinUpdateCarouselSlotsInner]] = None,
  note: Option[String] = None
)

