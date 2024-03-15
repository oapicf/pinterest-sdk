package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadType

/**
 * Media upload request
 * @param mediaUnderscoretype 
 */
case class MediaUploadRequest(mediaUnderscoretype: MediaUploadType
                )

object MediaUploadRequest {
    /**
     * Creates the codec for converting MediaUploadRequest from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadRequest] = deriveEncoder
}
