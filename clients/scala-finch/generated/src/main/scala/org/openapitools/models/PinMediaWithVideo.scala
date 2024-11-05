package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.PinMedia
import org.openapitools.models.PinMediaWithImageAllOfImages

/**
 * Pin with video.
 * @param mediaUnderscoretype 
 * @param images 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param videoUnderscoreurl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */
case class PinMediaWithVideo(mediaUnderscoretype: Option[String],
                images: Option[PinMediaWithImageAllOfImages],
                coverUnderscoreimageUnderscoreurl: Option[String],
                videoUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                width: Option[Int]
                )

object PinMediaWithVideo {
    /**
     * Creates the codec for converting PinMediaWithVideo from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithVideo] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithVideo] = deriveEncoder
}
