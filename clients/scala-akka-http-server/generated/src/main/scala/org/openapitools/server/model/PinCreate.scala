package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = PinCreate =
 *
 * Pin
 *
 * @param id  for example: ''813744226420795884''
 * @param createdAt  for example: ''2020-01-01T20:10:40Z''
 * @param link  for example: ''https://www.pinterest.com/''
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param dominantColor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". for example: ''#6E7874''
 * @param altText  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param boardOwner  for example: ''null''
 * @param media  for example: ''null''
 * @param mediaSource  for example: ''null''
 * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. for example: ''null''
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. for example: ''null''
*/
final case class PinCreate (
  id: Option[String] = None,
  createdAt: Option[OffsetDateTime] = None,
  link: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  dominantColor: Option[String] = None,
  altText: Option[String] = None,
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None,
  boardOwner: Option[BoardOwner] = None,
  media: Option[SummaryPinMedia] = None,
  mediaSource: Option[PinMediaSource] = None,
  parentPinId: Option[String] = None,
  note: Option[String] = None
)

