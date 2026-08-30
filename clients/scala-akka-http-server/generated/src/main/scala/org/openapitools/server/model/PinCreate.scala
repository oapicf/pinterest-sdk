package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param aiDisclosures AI disclosure declarations the creator has made about this Pin. for example: ''null''
 * @param altText  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param description  for example: ''null''
 * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`. for example: ''null''
 * @param link  for example: ''null''
 * @param mediaSource  for example: ''null''
 * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). for example: ''null''
 * @param sponsorId The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. for example: ''null''
 * @param title  for example: ''null''
*/
final case class PinCreate (
  aiDisclosures: Option[AiDisclosures] = None,
  altText: Option[String] = None,
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None,
  description: Option[String] = None,
  dominantColor: Option[String] = None,
  link: Option[String] = None,
  mediaSource: Option[PinMediaSource] = None,
  parentPinId: Option[String] = None,
  sponsorId: Option[String] = None,
  title: Option[String] = None
)

