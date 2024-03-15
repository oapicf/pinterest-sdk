package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Audience operation type (update or remove).
 */
case class AudienceUpdateOperationType()

object AudienceUpdateOperationType {
    /**
     * Creates the codec for converting AudienceUpdateOperationType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceUpdateOperationType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceUpdateOperationType] = deriveEncoder
}
