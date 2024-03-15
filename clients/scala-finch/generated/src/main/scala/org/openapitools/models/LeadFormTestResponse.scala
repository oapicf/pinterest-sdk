package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Response for lead data test API.
 * @param subscriptionUnderscoreid Subscription ID.
 */
case class LeadFormTestResponse(subscriptionUnderscoreid: Option[String]
                )

object LeadFormTestResponse {
    /**
     * Creates the codec for converting LeadFormTestResponse from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormTestResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormTestResponse] = deriveEncoder
}
