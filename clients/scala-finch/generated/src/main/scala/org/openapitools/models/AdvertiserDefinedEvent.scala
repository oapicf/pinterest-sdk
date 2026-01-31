package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name raw string name of the event, usually logged as raw_event_name in our dataset
 * @param mappedUnderscoreconversionUnderscoretype standard type mapped to ADE for optimization
 */
case class AdvertiserDefinedEvent(name: Option[String],
                mappedUnderscoreconversionUnderscoretype: Option[String]
                )

object AdvertiserDefinedEvent {
    /**
     * Creates the codec for converting AdvertiserDefinedEvent from and to JSON.
     */
    implicit val decoder: Decoder[AdvertiserDefinedEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvertiserDefinedEvent] = deriveEncoder
}
