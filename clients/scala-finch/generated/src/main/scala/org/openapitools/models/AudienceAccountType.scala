package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class AudienceAccountType()

object AudienceAccountType {
    /**
     * Creates the codec for converting AudienceAccountType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceAccountType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceAccountType] = deriveEncoder
}
