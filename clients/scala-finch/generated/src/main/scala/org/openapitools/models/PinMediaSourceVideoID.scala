package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Video ID-based media source
 * @param sourceUnderscoretype 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param mediaUnderscoreid 
 */
case class PinMediaSourceVideoID(sourceUnderscoretype: String,
                coverUnderscoreimageUnderscoreurl: String,
                mediaUnderscoreid: String
                )

object PinMediaSourceVideoID {
    /**
     * Creates the codec for converting PinMediaSourceVideoID from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceVideoID] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceVideoID] = deriveEncoder
}
