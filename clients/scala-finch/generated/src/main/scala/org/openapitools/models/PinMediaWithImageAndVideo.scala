package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMedia
import org.openapitools.models.PinMediaMetadata
import scala.collection.immutable.Seq

/**
 * Pin with a mix of images and videos.
 * @param mediaUnderscoretype 
 * @param items 
 */
case class PinMediaWithImageAndVideo(mediaUnderscoretype: Option[String],
                items: Option[Seq[PinMediaMetadata]]
                )

object PinMediaWithImageAndVideo {
    /**
     * Creates the codec for converting PinMediaWithImageAndVideo from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImageAndVideo] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImageAndVideo] = deriveEncoder
}
