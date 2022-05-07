package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImageBase64
import org.openapitools.models.PinMediaSourceImageURL
import org.openapitools.models.PinMediaSourceVideoID

/**
 * Pin media source.
 * @param sourceUnderscoretype 
 * @param contentUnderscoretype 
 * @param data 
 * @param url 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param mediaUnderscoreid 
 */
case class PinMediaSource(sourceUnderscoretype: String,
                contentUnderscoretype: String,
                data: String,
                url: String,
                coverUnderscoreimageUnderscoreurl: String,
                mediaUnderscoreid: String
                )

object PinMediaSource {
    /**
     * Creates the codec for converting PinMediaSource from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSource] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSource] = deriveEncoder
}
