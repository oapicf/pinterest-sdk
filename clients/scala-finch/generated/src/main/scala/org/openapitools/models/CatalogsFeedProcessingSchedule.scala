package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
 * @param time A time in format HH:MM with leading 0 (zero)
 * @param timezone The timezone considered for the processing schedule time.
 */
case class CatalogsFeedProcessingSchedule(time: String,
                timezone: String
                )

object CatalogsFeedProcessingSchedule {
    /**
     * Creates the codec for converting CatalogsFeedProcessingSchedule from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProcessingSchedule] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProcessingSchedule] = deriveEncoder
}
