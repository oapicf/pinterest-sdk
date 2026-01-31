package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param itemUnderscoretype 
 * @param videoUnderscoreurl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 */
case class VideoMetadataWithItemType(coverUnderscoreimageUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                itemUnderscoretype: Option[String],
                videoUnderscoreurl: Option[String],
                width: Option[Int]
                )

object VideoMetadataWithItemType {
    /**
     * Creates the codec for converting VideoMetadataWithItemType from and to JSON.
     */
    implicit val decoder: Decoder[VideoMetadataWithItemType] = deriveDecoder
    implicit val encoder: ObjectEncoder[VideoMetadataWithItemType] = deriveEncoder
}
