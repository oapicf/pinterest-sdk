package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Base64-encoded image media source
 * @param sourceUnderscoretype 
 * @param contentUnderscoretype 
 * @param data 
 */
case class PinMediaSourceImageBase64(sourceUnderscoretype: String,
                contentUnderscoretype: String,
                data: String
                )

object PinMediaSourceImageBase64 {
    /**
     * Creates the codec for converting PinMediaSourceImageBase64 from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImageBase64] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImageBase64] = deriveEncoder
}
