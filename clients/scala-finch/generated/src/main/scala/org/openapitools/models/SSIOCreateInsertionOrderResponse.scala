package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param pinUnderscoreorderUnderscoreid Salesforce order id
 */
case class SSIOCreateInsertionOrderResponse(pinUnderscoreorderUnderscoreid: Option[String]
                )

object SSIOCreateInsertionOrderResponse {
    /**
     * Creates the codec for converting SSIOCreateInsertionOrderResponse from and to JSON.
     */
    implicit val decoder: Decoder[SSIOCreateInsertionOrderResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOCreateInsertionOrderResponse] = deriveEncoder
}
