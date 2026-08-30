package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param boardPinsModifiedAt Date and time of last board pins modified. for example: ''null''
 * @param collaboratorCount Count of collaborators on the board. for example: ''17''
 * @param createdAt Date and time of board creation. for example: ''null''
 * @param description  for example: ''My favorite summer recipes''
 * @param followerCount Board follower count. for example: ''13''
 * @param id  for example: ''549755885175''
 * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins. for example: ''true''
 * @param media Board media. for example: ''null''
 * @param name     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". for example: ''Summer recipes''
 * @param owner  for example: ''null''
 * @param pinCount Count of Pins on the board. for example: ''5''
 * @param privacy  for example: ''null''
*/
final case class BoardWithUpdatePrivacy (
  boardPinsModifiedAt: Option[OffsetDateTime] = None,
  collaboratorCount: Option[Int] = None,
  createdAt: Option[OffsetDateTime] = None,
  description: Option[String] = None,
  followerCount: Option[Int] = None,
  id: String,
  isAdsOnly: Option[Boolean] = None,
  media: Option[BoardMedia] = None,
  name: String,
  owner: Option[BoardOwner] = None,
  pinCount: Option[Int] = None,
  privacy: Option[BoardUpdatePrivacy] = None
)

