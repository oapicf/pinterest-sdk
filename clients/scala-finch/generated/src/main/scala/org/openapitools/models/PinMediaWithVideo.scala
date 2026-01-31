package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ImageSize

/**
 * Pin with video.
 * @param coverUnderscoreimageUnderscoreurl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param images 
 * @param mediaUnderscoretype 
 * @param videoUnderscoreurl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 */
case class PinMediaWithVideo(coverUnderscoreimageUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                images: Option[ImageSize],
                mediaUnderscoretype: String,
                videoUnderscoreurl: Option[String],
                width: Option[Int]
                )

object PinMediaWithVideo {
    /**
     * Creates the codec for converting PinMediaWithVideo from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithVideo] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithVideo] = deriveEncoder
}
