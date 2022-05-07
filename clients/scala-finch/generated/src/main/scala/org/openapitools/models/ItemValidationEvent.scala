package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object describing an item validation event
 * @param attribute The attribute that the item validation event references
 * @param code The event code that the item validation event references
 * @param message Title message describing the item validation event
 */
case class ItemValidationEvent(attribute: Option[String],
                code: Option[Int],
                message: Option[String]
                )

object ItemValidationEvent {
    /**
     * Creates the codec for converting ItemValidationEvent from and to JSON.
     */
    implicit val decoder: Decoder[ItemValidationEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemValidationEvent] = deriveEncoder
}
