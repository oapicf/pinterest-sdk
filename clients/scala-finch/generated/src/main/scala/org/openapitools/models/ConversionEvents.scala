package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionEventsDataInner
import scala.collection.immutable.Seq

/**
 * A list of events (one or more) encapsulated by a data object.
 * @param data 
 */
case class ConversionEvents(data: Seq[ConversionEventsDataInner]
                )

object ConversionEvents {
    /**
     * Creates the codec for converting ConversionEvents from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEvents] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEvents] = deriveEncoder
}
