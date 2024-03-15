package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaUploadDetails
import scala.collection.immutable.Seq

/**
 * 
 * @param items Media
 * @param bookmark 
 */
case class MediaList200Response(items: Seq[MediaUploadDetails],
                bookmark: Option[String]
                )

object MediaList200Response {
    /**
     * Creates the codec for converting MediaList200Response from and to JSON.
     */
    implicit val decoder: Decoder[MediaList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaList200Response] = deriveEncoder
}
