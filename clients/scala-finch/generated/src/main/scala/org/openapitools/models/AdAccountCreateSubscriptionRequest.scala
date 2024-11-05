package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccountCreateSubscriptionRequestPartnerMetadata

/**
 * 
 * @param webhookUnderscoreurl Standard HTTPS webhook URL.
 * @param leadUnderscoreformUnderscoreid Lead form ID.
 * @param partnerUnderscoreaccessUnderscoretoken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerUnderscorerefreshUnderscoretoken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerUnderscoremetadata 
 */
case class AdAccountCreateSubscriptionRequest(webhookUnderscoreurl: String,
                leadUnderscoreformUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscoremetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata]
                )

object AdAccountCreateSubscriptionRequest {
    /**
     * Creates the codec for converting AdAccountCreateSubscriptionRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountCreateSubscriptionRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountCreateSubscriptionRequest] = deriveEncoder
}
