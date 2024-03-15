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
 * @param items 
 * @param bookmark 
 */
case class BoardsUserFollowsList200Response(items: Seq[Board],
                bookmark: Option[String]
                )

object BoardsUserFollowsList200Response {
    /**
     * Creates the codec for converting BoardsUserFollowsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[BoardsUserFollowsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardsUserFollowsList200Response] = deriveEncoder
}
