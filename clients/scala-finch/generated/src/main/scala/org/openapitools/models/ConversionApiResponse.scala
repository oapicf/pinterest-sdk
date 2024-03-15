package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionApiResponseEventsInner
import scala.collection.immutable.Seq

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 * @param numUnderscoreeventsUnderscorereceived Total number of events received in the request.
 * @param numUnderscoreeventsUnderscoreprocessed Number of events that were successfully processed from the events.
 * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
 */
case class ConversionApiResponse(numUnderscoreeventsUnderscorereceived: Int,
                numUnderscoreeventsUnderscoreprocessed: Int,
                events: Seq[ConversionApiResponseEventsInner]
                )

object ConversionApiResponse {
    /**
     * Creates the codec for converting ConversionApiResponse from and to JSON.
     */
    implicit val decoder: Decoder[ConversionApiResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionApiResponse] = deriveEncoder
}
