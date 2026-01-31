package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ImageSize
import org.openapitools.models.PinMediaMetadata
import org.openapitools.models.PinMediaWithImage
import org.openapitools.models.PinMediaWithImageAndVideo
import org.openapitools.models.PinMediaWithImages
import org.openapitools.models.PinMediaWithVideo
import org.openapitools.models.PinMediaWithVideos
import scala.collection.immutable.Seq

/**
 * Pin media that can be an image, video, or a mix of both.
 * @param images 
 * @param mediaUnderscoretype 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param videoUnderscoreurl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 * @param items 
 */
case class PinMedia(images: Option[ImageSize],
                mediaUnderscoretype: String,
                coverUnderscoreimageUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                videoUnderscoreurl: Option[String],
                width: Option[Int],
                items: Option[Seq[PinMediaMetadata]]
                )

object PinMedia {
    /**
     * Creates the codec for converting PinMedia from and to JSON.
     */
    implicit val decoder: Decoder[PinMedia] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMedia] = deriveEncoder
}
