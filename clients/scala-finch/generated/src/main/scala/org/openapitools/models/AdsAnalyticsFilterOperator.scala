package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Filter operator for sync reporting
 */
case class AdsAnalyticsFilterOperator()

object AdsAnalyticsFilterOperator {
    /**
     * Creates the codec for converting AdsAnalyticsFilterOperator from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsFilterOperator] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsFilterOperator] = deriveEncoder
}
