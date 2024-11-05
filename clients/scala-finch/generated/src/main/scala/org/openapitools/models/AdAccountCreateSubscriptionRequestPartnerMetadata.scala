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
case class AdAccountCreateSubscriptionRequestPartnerMetadata(subscriberUnderscorekey: Option[String]
                )

object AdAccountCreateSubscriptionRequestPartnerMetadata {
    /**
     * Creates the codec for converting AdAccountCreateSubscriptionRequestPartnerMetadata from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountCreateSubscriptionRequestPartnerMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountCreateSubscriptionRequestPartnerMetadata] = deriveEncoder
}
