package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadStatus
import org.openapitools.models.MediaUploadType

/**
 * Media upload details
 * @param mediaUnderscoreid 
 * @param mediaUnderscoretype 
 * @param status 
 */
case class MediaUploadDetails(mediaUnderscoreid: Option[String],
                mediaUnderscoretype: Option[MediaUploadType],
                status: Option[MediaUploadStatus]
                )

object MediaUploadDetails {
    /**
     * Creates the codec for converting MediaUploadDetails from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadDetails] = deriveEncoder
}
