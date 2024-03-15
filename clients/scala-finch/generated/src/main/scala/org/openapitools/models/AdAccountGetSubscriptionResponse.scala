package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param leadUnderscoreformUnderscoreid Lead form ID.
 * @param webhookUnderscoreurl Standard HTTPS webhook URL.
 * @param id Subscription ID.
 * @param userUnderscoreaccountUnderscoreid User account used to subscribe lead data.
 * @param adUnderscoreaccountUnderscoreid The Ad Account ID that this lead form belongs to.
 * @param apiUnderscoreversion API version.
 * @param cryptographicUnderscorekey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicUnderscorealgorithm Lead data encryption algorithm.
 * @param createdUnderscoretime Lead form creation time. Unix timestamp in milliseconds.
 */
case class AdAccountGetSubscriptionResponse(leadUnderscoreformUnderscoreid: Option[String],
                webhookUnderscoreurl: Option[String],
                id: Option[String],
                userUnderscoreaccountUnderscoreid: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                apiUnderscoreversion: Option[String],
                cryptographicUnderscorekey: Option[String],
                cryptographicUnderscorealgorithm: Option[String],
                createdUnderscoretime: Option[Int]
                )

object AdAccountGetSubscriptionResponse {
    /**
     * Creates the codec for converting AdAccountGetSubscriptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountGetSubscriptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountGetSubscriptionResponse] = deriveEncoder
}
