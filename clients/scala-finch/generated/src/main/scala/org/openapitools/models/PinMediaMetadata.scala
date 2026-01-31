package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ImageMetadata
import org.openapitools.models.ImageSize
import org.openapitools.models.VideoMetadataWithItemType

/**
 * 
 * @param description 
 * @param images 
 * @param itemUnderscoretype 
 * @param link 
 * @param title 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param videoUnderscoreurl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 */
case class PinMediaMetadata(description: Option[String],
                images: Option[ImageSize],
                itemUnderscoretype: Option[String],
                link: Option[String],
                title: Option[String],
                coverUnderscoreimageUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                videoUnderscoreurl: Option[String],
                width: Option[Int]
                )

object PinMediaMetadata {
    /**
     * Creates the codec for converting PinMediaMetadata from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaMetadata] = deriveEncoder
}
