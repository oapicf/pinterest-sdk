package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param active True if the offer code is currently active.
 * @param advertiserUnderscoreid Advertiser ID the offer was applied to.
 * @param discountType The type of discount of this credit
 * @param discountInMicroCurrency The discount applied in the offer’s currency value.
 * @param discountCurrency Currency value for the discount.
 * @param title Human readable title of the offer code.
 * @param remainingDiscountInMicroCurrency The credits left to spend.
 */
case class AdsCreditDiscountsResponse(active: Option[Boolean],
                advertiserUnderscoreid: Option[String],
                discountType: Option[String],
                discountInMicroCurrency: Option[BigDecimal],
                discountCurrency: Option[String],
                title: Option[String],
                remainingDiscountInMicroCurrency: Option[BigDecimal]
                )

object AdsCreditDiscountsResponse {
    /**
     * Creates the codec for converting AdsCreditDiscountsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdsCreditDiscountsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsCreditDiscountsResponse] = deriveEncoder
}
