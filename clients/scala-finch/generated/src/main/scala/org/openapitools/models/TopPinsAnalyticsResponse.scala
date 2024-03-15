package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.models.TopPinsAnalyticsResponsePinsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param dateUnderscoreavailability 
 * @param pins 
 * @param sortUnderscoreby 
 */
case class TopPinsAnalyticsResponse(dateUnderscoreavailability: Option[TopPinsAnalyticsResponseDateAvailability],
                pins: Option[Seq[TopPinsAnalyticsResponsePinsInner]],
                sortUnderscoreby: Option[String]
                )

object TopPinsAnalyticsResponse {
    /**
     * Creates the codec for converting TopPinsAnalyticsResponse from and to JSON.
     */
    implicit val decoder: Decoder[TopPinsAnalyticsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TopPinsAnalyticsResponse] = deriveEncoder
}
