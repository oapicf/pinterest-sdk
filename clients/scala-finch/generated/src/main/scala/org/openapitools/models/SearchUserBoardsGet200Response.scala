package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Board
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items items
 */
case class SearchUserBoardsGet200Response(bookmark: Option[String],
                items: Seq[Board]
                )

object SearchUserBoardsGet200Response {
    /**
     * Creates the codec for converting SearchUserBoardsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[SearchUserBoardsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchUserBoardsGet200Response] = deriveEncoder
}
