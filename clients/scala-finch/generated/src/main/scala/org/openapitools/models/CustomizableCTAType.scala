package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 */
case class CustomizableCTAType()

object CustomizableCTAType {
    /**
     * Creates the codec for converting CustomizableCTAType from and to JSON.
     */
    implicit val decoder: Decoder[CustomizableCTAType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomizableCTAType] = deriveEncoder
}
