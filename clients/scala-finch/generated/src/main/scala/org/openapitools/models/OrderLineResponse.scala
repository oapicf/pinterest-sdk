package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderLine
import org.openapitools.models.OrderLineError
import scala.collection.immutable.Seq

/**
 * 
 * @param errors Error list if update(s) fail.
 * @param orderUnderscoreline Order Line object array.
 */
case class OrderLineResponse(errors: Option[Seq[OrderLineError]],
                orderUnderscoreline: Option[Seq[OrderLine]]
                )

object OrderLineResponse {
    /**
     * Creates the codec for converting OrderLineResponse from and to JSON.
     */
    implicit val decoder: Decoder[OrderLineResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLineResponse] = deriveEncoder
}
