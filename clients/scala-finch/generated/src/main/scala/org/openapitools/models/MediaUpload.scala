package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadAllOfUploadParameters
import org.openapitools.models.MediaUploadType

/**
 * Media upload that has been registered but not uploaded/processed yet.
 * @param mediaUnderscoreid Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaUnderscoretype 
 * @param uploadUnderscoreurl The URL where you will POST your media file.
 * @param uploadUnderscoreparameters 
 */
case class MediaUpload(mediaUnderscoreid: Option[String],
                mediaUnderscoretype: Option[MediaUploadType],
                uploadUnderscoreurl: Option[String],
                uploadUnderscoreparameters: Option[MediaUploadAllOfUploadParameters]
                )

object MediaUpload {
    /**
     * Creates the codec for converting MediaUpload from and to JSON.
     */
    implicit val decoder: Decoder[MediaUpload] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUpload] = deriveEncoder
}
