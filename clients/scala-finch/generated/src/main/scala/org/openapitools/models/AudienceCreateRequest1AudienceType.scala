package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class AudienceCreateRequest1AudienceType()

object AudienceCreateRequest1AudienceType {
    /**
     * Creates the codec for converting AudienceCreateRequest1AudienceType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceCreateRequest1AudienceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceCreateRequest1AudienceType] = deriveEncoder
}
