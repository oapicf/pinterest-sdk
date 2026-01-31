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
 * @param bookmark 
 * @param items 
 */
case class PinsList200Response(bookmark: Option[String],
                items: Seq[Pin]
                )

object PinsList200Response {
    /**
     * Creates the codec for converting PinsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[PinsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinsList200Response] = deriveEncoder
}
