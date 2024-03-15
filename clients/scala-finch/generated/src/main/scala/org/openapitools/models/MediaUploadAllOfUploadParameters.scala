package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 * @param xMinusamzMinusdate 
 * @param xMinusamzMinussignature 
 * @param xMinusamzMinussecurityMinustoken 
 * @param xMinusamzMinusalgorithm 
 * @param key 
 * @param policy 
 * @param xMinusamzMinuscredential 
 * @param ContentMinusType 
 */
case class MediaUploadAllOfUploadParameters(xMinusamzMinusdate: Option[String],
                xMinusamzMinussignature: Option[String],
                xMinusamzMinussecurityMinustoken: Option[String],
                xMinusamzMinusalgorithm: Option[String],
                key: Option[String],
                policy: Option[String],
                xMinusamzMinuscredential: Option[String],
                ContentMinusType: Option[String]
                )

object MediaUploadAllOfUploadParameters {
    /**
     * Creates the codec for converting MediaUploadAllOfUploadParameters from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadAllOfUploadParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadAllOfUploadParameters] = deriveEncoder
}
