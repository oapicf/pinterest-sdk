package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.models.TopVideoPinsAnalyticsResponsePinsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param dateUnderscoreavailability 
 * @param pins 
 * @param sortUnderscoreby 
 */
case class TopVideoPinsAnalyticsResponse(dateUnderscoreavailability: Option[TopPinsAnalyticsResponseDateAvailability],
                pins: Option[Seq[TopVideoPinsAnalyticsResponsePinsInner]],
                sortUnderscoreby: Option[String]
                )

object TopVideoPinsAnalyticsResponse {
    /**
     * Creates the codec for converting TopVideoPinsAnalyticsResponse from and to JSON.
     */
    implicit val decoder: Decoder[TopVideoPinsAnalyticsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TopVideoPinsAnalyticsResponse] = deriveEncoder
}
