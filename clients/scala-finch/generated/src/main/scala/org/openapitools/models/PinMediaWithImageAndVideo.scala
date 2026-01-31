package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaMetadata
import scala.collection.immutable.Seq

/**
 * Pin with a mix of images and videos.
 * @param items 
 * @param mediaUnderscoretype 
 */
case class PinMediaWithImageAndVideo(items: Option[Seq[PinMediaMetadata]],
                mediaUnderscoretype: String
                )

object PinMediaWithImageAndVideo {
    /**
     * Creates the codec for converting PinMediaWithImageAndVideo from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImageAndVideo] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImageAndVideo] = deriveEncoder
}
