package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderLine
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class OrderLinesList200Response(bookmark: Option[String],
                items: Seq[OrderLine]
                )

object OrderLinesList200Response {
    /**
     * Creates the codec for converting OrderLinesList200Response from and to JSON.
     */
    implicit val decoder: Decoder[OrderLinesList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLinesList200Response] = deriveEncoder
}
