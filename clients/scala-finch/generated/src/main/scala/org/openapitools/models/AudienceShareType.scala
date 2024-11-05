package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class AudienceShareType()

object AudienceShareType {
    /**
     * Creates the codec for converting AudienceShareType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceShareType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceShareType] = deriveEncoder
}
