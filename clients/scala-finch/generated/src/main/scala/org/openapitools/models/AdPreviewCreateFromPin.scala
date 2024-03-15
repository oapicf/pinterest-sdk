package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param pinUnderscoreid Pin ID.
 */
case class AdPreviewCreateFromPin(pinUnderscoreid: String
                )

object AdPreviewCreateFromPin {
    /**
     * Creates the codec for converting AdPreviewCreateFromPin from and to JSON.
     */
    implicit val decoder: Decoder[AdPreviewCreateFromPin] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPreviewCreateFromPin] = deriveEncoder
}
