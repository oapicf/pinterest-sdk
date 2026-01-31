package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadSubscriptionPostParamsCreateAllOfPartnerMetadata

/**
 * 
 * @param leadUnderscoreformUnderscoreid Lead form ID.
 * @param webhookUnderscoreurl Standard HTTPS webhook URL.
 * @param partnerUnderscoreaccessUnderscoretoken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerUnderscoremetadata 
 * @param partnerUnderscorerefreshUnderscoretoken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 */
case class LeadSubscriptionPostParamsCreate(leadUnderscoreformUnderscoreid: Option[String],
                webhookUnderscoreurl: String,
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscoremetadata: Option[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata],
                partnerUnderscorerefreshUnderscoretoken: Option[String]
                )

object LeadSubscriptionPostParamsCreate {
    /**
     * Creates the codec for converting LeadSubscriptionPostParamsCreate from and to JSON.
     */
    implicit val decoder: Decoder[LeadSubscriptionPostParamsCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadSubscriptionPostParamsCreate] = deriveEncoder
}
