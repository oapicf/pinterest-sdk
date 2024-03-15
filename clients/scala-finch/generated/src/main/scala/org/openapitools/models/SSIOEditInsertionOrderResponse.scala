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
case class SSIOEditInsertionOrderResponse(pinUnderscoreorderUnderscoreid: Option[String]
                )

object SSIOEditInsertionOrderResponse {
    /**
     * Creates the codec for converting SSIOEditInsertionOrderResponse from and to JSON.
     */
    implicit val decoder: Decoder[SSIOEditInsertionOrderResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOEditInsertionOrderResponse] = deriveEncoder
}
