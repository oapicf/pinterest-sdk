package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param status Whether the event was processed successfully.
 * @param errorUnderscoremessage Error message containing more information about why the event failed to be processed.
 * @param warningUnderscoremessage Warning messages about any fields in the event which are not standard. These are not critical to event processing.
 */
case class ConversionApiResponseEventsInner(status: String,
                errorUnderscoremessage: Option[String],
                warningUnderscoremessage: Option[String]
                )

object ConversionApiResponseEventsInner {
    /**
     * Creates the codec for converting ConversionApiResponseEventsInner from and to JSON.
     */
    implicit val decoder: Decoder[ConversionApiResponseEventsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionApiResponseEventsInner] = deriveEncoder
}
