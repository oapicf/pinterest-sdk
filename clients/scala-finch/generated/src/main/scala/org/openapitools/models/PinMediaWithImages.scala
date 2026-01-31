package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageMetadata
import scala.collection.immutable.Seq

/**
 * Pin with multiple images.
 * @param items 
 * @param mediaUnderscoretype 
 */
case class PinMediaWithImages(items: Option[Seq[ImageMetadata]],
                mediaUnderscoretype: String
                )

object PinMediaWithImages {
    /**
     * Creates the codec for converting PinMediaWithImages from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImages] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImages] = deriveEncoder
}
