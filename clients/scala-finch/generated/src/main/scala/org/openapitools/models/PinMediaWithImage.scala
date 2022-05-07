package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageDetails
import org.openapitools.models.PinMedia
import org.openapitools.models.PinMediaWithImageAllOf
import scala.collection.immutable.Seq

/**
 * Pin with image.
 * @param images 
 * @param mediaUnderscoretype 
 */
case class PinMediaWithImage(images: Option[Map[String, ImageDetails]],
                mediaUnderscoretype: Option[String]
                )

object PinMediaWithImage {
    /**
     * Creates the codec for converting PinMediaWithImage from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImage] = deriveEncoder
}
