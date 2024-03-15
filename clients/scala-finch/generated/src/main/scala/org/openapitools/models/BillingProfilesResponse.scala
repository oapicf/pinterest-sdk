package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Billing ID.
 * @param cardUnderscoretype Type of the card.
 * @param status Status of the billing.
 * @param advertiserUnderscoreid Advertiser ID of the billing.
 * @param paymentUnderscoremethodUnderscorebrand Brand of the payment method.
 */
case class BillingProfilesResponse(id: Option[String],
                cardUnderscoretype: Option[String],
                status: Option[String],
                advertiserUnderscoreid: Option[String],
                paymentUnderscoremethodUnderscorebrand: Option[String]
                )

object BillingProfilesResponse {
    /**
     * Creates the codec for converting BillingProfilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[BillingProfilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingProfilesResponse] = deriveEncoder
}
