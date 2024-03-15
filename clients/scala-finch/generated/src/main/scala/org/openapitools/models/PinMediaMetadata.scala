package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ImageMetadata
import org.openapitools.models.ImageMetadataImages
import org.openapitools.models.VideoMetadata

/**
 * 
 * @param itemUnderscoretype 
 * @param title 
 * @param description 
 * @param link 
 * @param images 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param videoUnderscoreurl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */
case class PinMediaMetadata(itemUnderscoretype: Option[String],
                title: Option[String],
                description: Option[String],
                link: Option[String],
                images: Option[ImageMetadataImages],
                coverUnderscoreimageUnderscoreurl: Option[String],
                videoUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                width: Option[Int]
                )

object PinMediaMetadata {
    /**
     * Creates the codec for converting PinMediaMetadata from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaMetadata] = deriveEncoder
}
