package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderLineResponse

/**
 * 
 * @param data 
 */
case class OrderLineSingleResponse(data: Option[OrderLineResponse]
                )

object OrderLineSingleResponse {
    /**
     * Creates the codec for converting OrderLineSingleResponse from and to JSON.
     */
    implicit val decoder: Decoder[OrderLineSingleResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLineSingleResponse] = deriveEncoder
}
