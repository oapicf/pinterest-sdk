package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageMetadataImages
import org.openapitools.models.PinMedia

/**
 * Pin with image.
 * @param mediaUnderscoretype 
 * @param images 
 */
case class PinMediaWithImage(mediaUnderscoretype: Option[String],
                images: Option[ImageMetadataImages]
                )

object PinMediaWithImage {
    /**
     * Creates the codec for converting PinMediaWithImage from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImage] = deriveEncoder
}
