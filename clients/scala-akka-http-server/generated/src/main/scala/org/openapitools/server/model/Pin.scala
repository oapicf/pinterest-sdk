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
 * @param altText  for example: ''null''
 * @param boardId The board to which this Pin belongs. for example: ''null''
 * @param boardSectionId The board section to which this Pin belongs. for example: ''null''
 * @param boardOwner  for example: ''null''
 * @param media  for example: ''null''
 * @param mediaSource  for example: ''null''
*/
final case class Pin (
  id: Option[String],
  createdAt: Option[OffsetDateTime],
  link: Option[String],
  title: Option[String],
  description: Option[String],
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  boardOwner: Option[BoardOwner],
  media: Option[PinMedia],
  mediaSource: Option[PinMediaSource]
)

