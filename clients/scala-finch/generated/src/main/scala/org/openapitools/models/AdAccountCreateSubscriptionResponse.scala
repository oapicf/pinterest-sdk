package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Subscription ID.
 * @param cryptographicUnderscorekey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicUnderscorealgorithm Lead data encryption algorithm.
 * @param createdUnderscoretime Subscription creation time. Unix timestamp in milliseconds.
 */
case class AdAccountCreateSubscriptionResponse(id: Option[String],
                cryptographicUnderscorekey: Option[String],
                cryptographicUnderscorealgorithm: Option[String],
                createdUnderscoretime: Option[Int]
                )

object AdAccountCreateSubscriptionResponse {
    /**
     * Creates the codec for converting AdAccountCreateSubscriptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountCreateSubscriptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountCreateSubscriptionResponse] = deriveEncoder
}
