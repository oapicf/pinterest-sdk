package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The field types supported by the update mask
 */
case class UpdateMaskFieldType()

object UpdateMaskFieldType {
    /**
     * Creates the codec for converting UpdateMaskFieldType from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMaskFieldType] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMaskFieldType] = deriveEncoder
}
