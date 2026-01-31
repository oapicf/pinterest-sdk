package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadParameters
import org.openapitools.models.MediaUploadType

/**
 * Media upload that has been registered but not uploaded/processed yet.
 * @param mediaUnderscoreid Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaUnderscoretype 
 * @param uploadUnderscoreparameters The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 * @param uploadUnderscoreurl The URL where you will POST your media file.
 */
case class MediaUpload(mediaUnderscoreid: String,
                mediaUnderscoretype: MediaUploadType,
                uploadUnderscoreparameters: Option[MediaUploadParameters],
                uploadUnderscoreurl: Option[String]
                )

object MediaUpload {
    /**
     * Creates the codec for converting MediaUpload from and to JSON.
     */
    implicit val decoder: Decoder[MediaUpload] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUpload] = deriveEncoder
}
