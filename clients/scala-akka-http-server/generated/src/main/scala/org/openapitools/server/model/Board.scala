package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = Board =
 *
 * Board
 *
 * @param id  for example: ''549755885175''
 * @param createdAt Date and time of board creation. for example: ''2020-01-01T20:10:40Z''
 * @param boardPinsModifiedAt Date and time of last board pins modified. for example: ''2020-01-01T20:10:40Z''
 * @param name  for example: ''Summer Recipes''
 * @param description  for example: ''My favorite summer recipes''
 * @param collaboratorCount Count of collaborators on the board. for example: ''17''
 * @param pinCount Count of pins on the board. for example: ''5''
 * @param followerCount Board follower count. for example: ''13''
 * @param media  for example: ''null''
 * @param owner  for example: ''null''
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> for example: ''null''
*/
final case class Board (
  id: Option[String] = None,
  createdAt: Option[OffsetDateTime] = None,
  boardPinsModifiedAt: Option[OffsetDateTime] = None,
  name: String,
  description: Option[String] = None,
  collaboratorCount: Option[Int] = None,
  pinCount: Option[Int] = None,
  followerCount: Option[Int] = None,
  media: Option[BoardMedia] = None,
  owner: Option[BoardOwner] = None,
  privacy: Option[String] = None
)

