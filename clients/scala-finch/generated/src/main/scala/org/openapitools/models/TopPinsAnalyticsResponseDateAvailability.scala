package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param latestUnderscoreavailableUnderscoretimestamp 
 * @param isUnderscorerealtime 
 */
case class TopPinsAnalyticsResponseDateAvailability(latestUnderscoreavailableUnderscoretimestamp: Option[BigDecimal],
                isUnderscorerealtime: Option[Boolean]
                )

object TopPinsAnalyticsResponseDateAvailability {
    /**
     * Creates the codec for converting TopPinsAnalyticsResponseDateAvailability from and to JSON.
     */
    implicit val decoder: Decoder[TopPinsAnalyticsResponseDateAvailability] = deriveDecoder
    implicit val encoder: ObjectEncoder[TopPinsAnalyticsResponseDateAvailability] = deriveEncoder
}
