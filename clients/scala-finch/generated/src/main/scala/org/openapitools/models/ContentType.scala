package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class ContentType()

object ContentType {
    /**
     * Creates the codec for converting ContentType from and to JSON.
     */
    implicit val decoder: Decoder[ContentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContentType] = deriveEncoder
}
