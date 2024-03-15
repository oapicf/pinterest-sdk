package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageMetadata
import org.openapitools.models.PinMedia
import scala.collection.immutable.Seq

/**
 * Pin with multiple images.
 * @param mediaUnderscoretype 
 * @param items 
 */
case class PinMediaWithImages(mediaUnderscoretype: Option[String],
                items: Option[Seq[ImageMetadata]]
                )

object PinMediaWithImages {
    /**
     * Creates the codec for converting PinMediaWithImages from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImages] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImages] = deriveEncoder
}
