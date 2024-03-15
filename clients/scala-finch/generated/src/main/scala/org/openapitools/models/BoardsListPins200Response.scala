package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * 
 * @param items Pins
 * @param bookmark 
 */
case class BoardsListPins200Response(items: Seq[Pin],
                bookmark: Option[String]
                )

object BoardsListPins200Response {
    /**
     * Creates the codec for converting BoardsListPins200Response from and to JSON.
     */
    implicit val decoder: Decoder[BoardsListPins200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardsListPins200Response] = deriveEncoder
}
