package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param altText  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param carouselSlots Carousel Pin slots data. for example: ''null''
 * @param description  for example: ''null''
 * @param link  for example: ''null''
 * @param title  for example: ''null''
*/
final case class PinUpdate (
  altText: Option[String] = None,
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None,
  carouselSlots: Option[Seq[CarouselSlot]] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None
)

