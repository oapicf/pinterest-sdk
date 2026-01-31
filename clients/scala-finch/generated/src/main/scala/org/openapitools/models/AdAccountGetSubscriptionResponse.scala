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
 * @param adUnderscoreaccountUnderscoreid The Ad Account ID that this lead form belongs to.
 * @param apiUnderscoreversion API version.
 * @param createdUnderscoretime Lead subscription creation time. Unix timestamp in milliseconds.
 * @param cryptographicUnderscorealgorithm Lead data encryption algorithm.
 * @param cryptographicUnderscorekey Base64 encoded key for client to decrypt lead data.
 * @param id Subscription ID.
 * @param userUnderscoreaccountUnderscoreid User account used to subscribe lead data.
 */
case class AdAccountGetSubscriptionResponse(leadUnderscoreformUnderscoreid: Option[String],
                webhookUnderscoreurl: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                apiUnderscoreversion: Option[String],
                createdUnderscoretime: Option[Int],
                cryptographicUnderscorealgorithm: Option[String],
                cryptographicUnderscorekey: Option[String],
                id: Option[String],
                userUnderscoreaccountUnderscoreid: Option[String]
                )

object AdAccountGetSubscriptionResponse {
    /**
     * Creates the codec for converting AdAccountGetSubscriptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountGetSubscriptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountGetSubscriptionResponse] = deriveEncoder
}
