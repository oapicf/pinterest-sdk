package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Audience type
 */
case class AudienceType()

object AudienceType {
    /**
     * Creates the codec for converting AudienceType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceType] = deriveEncoder
}
