package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param advertiserUnderscoreid Advertiser ID of the billing.
 * @param billingUnderscoretype Billing type of the advertiser
 * @param cardUnderscoretype Type of the card.
 * @param id Billing ID.
 * @param paymentUnderscoremethodUnderscorebrand Brand of the payment method.
 * @param status Status of the billing.
 */
case class BillingProfilesResponse(advertiserUnderscoreid: Option[String],
                billingUnderscoretype: Option[String],
                cardUnderscoretype: Option[String],
                id: Option[String],
                paymentUnderscoremethodUnderscorebrand: Option[String],
                status: Option[String]
                )

object BillingProfilesResponse {
    /**
     * Creates the codec for converting BillingProfilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[BillingProfilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingProfilesResponse] = deriveEncoder
}
