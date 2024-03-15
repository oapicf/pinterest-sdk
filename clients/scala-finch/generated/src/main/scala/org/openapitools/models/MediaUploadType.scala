package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class MediaUploadType()

object MediaUploadType {
    /**
     * Creates the codec for converting MediaUploadType from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadType] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadType] = deriveEncoder
}
