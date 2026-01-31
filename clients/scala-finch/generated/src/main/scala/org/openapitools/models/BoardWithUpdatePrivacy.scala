package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BoardMedia
import org.openapitools.models.BoardOwner
import org.openapitools.models.BoardUpdatePrivacy

/**
 * 
 * @param boardUnderscorepinsUnderscoremodifiedUnderscoreat Date and time of last board pins modified.
 * @param collaboratorUnderscorecount Count of collaborators on the board.
 * @param createdUnderscoreat Date and time of board creation.
 * @param description 
 * @param followerUnderscorecount Board follower count.
 * @param id 
 * @param isUnderscoreadsUnderscoreonly If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @param media Board media.
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @param owner 
 * @param pinUnderscorecount Count of Pins on the board.
 * @param privacy 
 */
case class BoardWithUpdatePrivacy(boardUnderscorepinsUnderscoremodifiedUnderscoreat: Option[ZonedDateTime],
                collaboratorUnderscorecount: Option[Int],
                createdUnderscoreat: Option[ZonedDateTime],
                description: Option[String],
                followerUnderscorecount: Option[Int],
                id: String,
                isUnderscoreadsUnderscoreonly: Option[Boolean],
                media: Option[BoardMedia],
                name: String,
                owner: Option[BoardOwner],
                pinUnderscorecount: Option[Int],
                privacy: Option[BoardUpdatePrivacy]
                )

object BoardWithUpdatePrivacy {
    /**
     * Creates the codec for converting BoardWithUpdatePrivacy from and to JSON.
     */
    implicit val decoder: Decoder[BoardWithUpdatePrivacy] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardWithUpdatePrivacy] = deriveEncoder
}
