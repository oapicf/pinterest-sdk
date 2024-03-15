package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * conversion tag type
 */
case class ConversionTagType()

object ConversionTagType {
    /**
     * Creates the codec for converting ConversionTagType from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagType] = deriveEncoder
}
