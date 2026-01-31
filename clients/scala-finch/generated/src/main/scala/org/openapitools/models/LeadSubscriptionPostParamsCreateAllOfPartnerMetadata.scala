package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @param subscriberUnderscorekey Text field value that uniquely identifies a subscriber.
 */
case class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata(subscriberUnderscorekey: Option[String]
                )

object LeadSubscriptionPostParamsCreateAllOfPartnerMetadata {
    /**
     * Creates the codec for converting LeadSubscriptionPostParamsCreateAllOfPartnerMetadata from and to JSON.
     */
    implicit val decoder: Decoder[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = deriveEncoder
}
