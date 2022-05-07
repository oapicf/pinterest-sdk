package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Media upload status
 */
case class MediaUploadStatus()

object MediaUploadStatus {
    /**
     * Creates the codec for converting MediaUploadStatus from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadStatus] = deriveEncoder
}
