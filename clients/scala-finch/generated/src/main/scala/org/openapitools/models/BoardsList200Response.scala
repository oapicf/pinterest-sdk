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
 * @param items Boards
 * @param bookmark 
 */
case class BoardsList200Response(items: Seq[Board],
                bookmark: Option[String]
                )

object BoardsList200Response {
    /**
     * Creates the codec for converting BoardsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[BoardsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardsList200Response] = deriveEncoder
}
