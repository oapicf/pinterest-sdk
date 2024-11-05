package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = Pin =
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
 * @param creativeType  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param boardOwner  for example: ''null''
 * @param isOwner Whether the \"operation user_account\" is the Pin owner. for example: ''null''
 * @param media  for example: ''null''
 * @param mediaSource  for example: ''null''
 * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. for example: ''null''
 * @param isStandard Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information. for example: ''null''
 * @param hasBeenPromoted Whether the Pin has been promoted or not. for example: ''null''
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. for example: ''null''
 * @param pinMetrics Pin metrics with associated time intervals if any. for example: ''{"90d":{"pin_click":7,"impression":2,"clickthrough":3},"lifetime_metrics":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}}''
*/
final case class Pin (
  id: Option[String] = None,
  createdAt: Option[OffsetDateTime] = None,
  link: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  dominantColor: Option[String] = None,
  altText: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None,
  boardOwner: Option[BoardOwner] = None,
  isOwner: Option[Boolean] = None,
  media: Option[PinMedia] = None,
  mediaSource: Option[PinMediaSource] = None,
  parentPinId: Option[String] = None,
  isStandard: Option[Boolean] = None,
  hasBeenPromoted: Option[Boolean] = None,
  note: Option[String] = None,
  pinMetrics: Option[Any] = None
)

