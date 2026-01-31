package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadStatus
import org.openapitools.models.MediaUploadType

/**
 * 
 * @param mediaUnderscoreid Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaUnderscoretype 
 * @param status 
 */
case class Media(mediaUnderscoreid: String,
                mediaUnderscoretype: MediaUploadType,
                status: Option[MediaUploadStatus]
                )

object Media {
    /**
     * Creates the codec for converting Media from and to JSON.
     */
    implicit val decoder: Decoder[Media] = deriveDecoder
    implicit val encoder: ObjectEncoder[Media] = deriveEncoder
}
