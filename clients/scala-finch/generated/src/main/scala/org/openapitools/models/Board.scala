package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BoardOwner

/**
 * Board
 * @param id 
 * @param name 
 * @param description 
 * @param owner 
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
 */
case class Board(id: Option[String],
                name: String,
                description: Option[String],
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
