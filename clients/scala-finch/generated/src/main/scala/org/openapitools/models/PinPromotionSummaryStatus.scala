package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Summary status for pin promotions
 */
case class PinPromotionSummaryStatus()

object PinPromotionSummaryStatus {
    /**
     * Creates the codec for converting PinPromotionSummaryStatus from and to JSON.
     */
    implicit val decoder: Decoder[PinPromotionSummaryStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinPromotionSummaryStatus] = deriveEncoder
}
