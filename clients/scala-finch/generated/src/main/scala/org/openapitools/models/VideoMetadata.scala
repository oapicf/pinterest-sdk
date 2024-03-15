package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param itemUnderscoretype 
 * @param coverUnderscoreimageUnderscoreurl 
 * @param videoUnderscoreurl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */
case class VideoMetadata(itemUnderscoretype: Option[String],
                coverUnderscoreimageUnderscoreurl: Option[String],
                videoUnderscoreurl: Option[String],
                duration: Option[BigDecimal],
                height: Option[Int],
                width: Option[Int]
                )

object VideoMetadata {
    /**
     * Creates the codec for converting VideoMetadata from and to JSON.
     */
    implicit val decoder: Decoder[VideoMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[VideoMetadata] = deriveEncoder
}
