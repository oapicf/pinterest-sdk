package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import org.openapitools.models.AnyType
import scala.collection.immutable.HashMap

/**
 * 
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @param PINUnderscoreID The ID of the pin that the metric belongs to.
 */
case class AdPinAnalytics(DATE: Option[LocalDateTime],
                PINUnderscoreID: String
                )

object AdPinAnalytics {
    /**
     * Creates the codec for converting AdPinAnalytics from and to JSON.
     */
    implicit val decoder: Decoder[AdPinAnalytics] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPinAnalytics] = deriveEncoder
}
