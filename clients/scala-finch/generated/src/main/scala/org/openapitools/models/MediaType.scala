package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class MediaType()

object MediaType {
    /**
     * Creates the codec for converting MediaType from and to JSON.
     */
    implicit val decoder: Decoder[MediaType] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaType] = deriveEncoder
}
