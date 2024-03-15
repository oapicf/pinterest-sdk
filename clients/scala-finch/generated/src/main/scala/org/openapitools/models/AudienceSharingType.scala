package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
 */
case class AudienceSharingType()

object AudienceSharingType {
    /**
     * Creates the codec for converting AudienceSharingType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceSharingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceSharingType] = deriveEncoder
}
