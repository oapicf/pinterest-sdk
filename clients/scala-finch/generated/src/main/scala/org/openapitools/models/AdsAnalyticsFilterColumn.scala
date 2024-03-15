package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting columns for sync reporting data filter
 */
case class AdsAnalyticsFilterColumn()

object AdsAnalyticsFilterColumn {
    /**
     * Creates the codec for converting AdsAnalyticsFilterColumn from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsFilterColumn] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsFilterColumn] = deriveEncoder
}
