package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param aiDisclosures AI disclosure declarations the creator has made about this Pin. for example: ''null''
 * @param altText  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardOwner  for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param createdAt  for example: ''null''
 * @param creativeType  for example: ''null''
 * @param description  for example: ''null''
 * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`. for example: ''null''
 * @param hasBeenPromoted Whether the Pin has been promoted or not. for example: ''null''
 * @param id  for example: ''null''
 * @param isOwner Whether the \"operation user_account\" is the Pin owner. for example: ''null''
 * @param isProduct Whether the Pin is a product Pin. for example: ''null''
 * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. for example: ''null''
 * @param link  for example: ''null''
 * @param media  for example: ''null''
 * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). for example: ''null''
 * @param pinMetrics Pin metrics with associated time intervals if any. for example: ''{"90d":{"pin_click":7,"impression":2,"clickthrough":3},"lifetime_metrics":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}}''
 * @param title  for example: ''null''
*/
final case class AggregatedPinComment (
  aiDisclosures: Option[AiDisclosures] = None,
  altText: Option[String] = None,
  boardId: Option[String] = None,
  boardOwner: Option[BoardOwner] = None,
  boardSectionId: Option[String] = None,
  createdAt: Option[OffsetDateTime] = None,
  creativeType: Option[CreativeType] = None,
  description: Option[String] = None,
  dominantColor: Option[String] = None,
  hasBeenPromoted: Option[Boolean] = None,
  id: String,
  isOwner: Option[Boolean] = None,
  isProduct: Option[Boolean] = None,
  isStandard: Option[Boolean] = None,
  link: Option[String] = None,
  media: Option[PinMedia] = None,
  parentPinId: Option[String] = None,
  pinMetrics: Option[Any] = None,
  title: Option[String] = None
)

