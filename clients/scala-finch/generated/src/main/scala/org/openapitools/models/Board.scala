package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BoardMedia
import org.openapitools.models.BoardOwner

/**
 * Board
 * @param id 
 * @param createdUnderscoreat Date and time of board creation.
 * @param boardUnderscorepinsUnderscoremodifiedUnderscoreat Date and time of last board pins modified.
 * @param name 
 * @param description 
 * @param collaboratorUnderscorecount Count of collaborators on the board.
 * @param pinUnderscorecount Count of pins on the board.
 * @param followerUnderscorecount Board follower count.
 * @param media 
 * @param owner 
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
 */
case class Board(id: Option[String],
                createdUnderscoreat: Option[ZonedDateTime],
                boardUnderscorepinsUnderscoremodifiedUnderscoreat: Option[ZonedDateTime],
                name: String,
                description: Option[String],
                collaboratorUnderscorecount: Option[Int],
                pinUnderscorecount: Option[Int],
                followerUnderscorecount: Option[Int],
                media: Option[BoardMedia],
                owner: Option[BoardOwner],
                privacy: Option[String]
                )

object Board {
    /**
     * Creates the codec for converting Board from and to JSON.
     */
    implicit val decoder: Decoder[Board] = deriveDecoder
    implicit val encoder: ObjectEncoder[Board] = deriveEncoder
}
