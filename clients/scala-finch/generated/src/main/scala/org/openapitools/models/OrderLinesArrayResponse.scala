package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderLines
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class OrderLinesArrayResponse(items: Option[Seq[OrderLines]]
                )

object OrderLinesArrayResponse {
    /**
     * Creates the codec for converting OrderLinesArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[OrderLinesArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLinesArrayResponse] = deriveEncoder
}
