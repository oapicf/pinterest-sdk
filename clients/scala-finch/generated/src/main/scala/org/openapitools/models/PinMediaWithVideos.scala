package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMedia
import org.openapitools.models.VideoMetadata
import scala.collection.immutable.Seq

/**
 * Pin with multiple videos.
 * @param mediaUnderscoretype 
 * @param items 
 */
case class PinMediaWithVideos(mediaUnderscoretype: Option[String],
                items: Option[Seq[VideoMetadata]]
                )

object PinMediaWithVideos {
    /**
     * Creates the codec for converting PinMediaWithVideos from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithVideos] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithVideos] = deriveEncoder
}
