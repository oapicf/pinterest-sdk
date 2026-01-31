package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ContentMinusType 
 * @param key 
 * @param policy 
 * @param xMinusamzMinusalgorithm 
 * @param xMinusamzMinuscredential 
 * @param xMinusamzMinusdate 
 * @param xMinusamzMinussecurityMinustoken 
 * @param xMinusamzMinussignature 
 */
case class MediaUploadParameters(ContentMinusType: Option[String],
                key: Option[String],
                policy: Option[String],
                xMinusamzMinusalgorithm: Option[String],
                xMinusamzMinuscredential: Option[String],
                xMinusamzMinusdate: Option[String],
                xMinusamzMinussecurityMinustoken: Option[String],
                xMinusamzMinussignature: Option[String]
                )

object MediaUploadParameters {
    /**
     * Creates the codec for converting MediaUploadParameters from and to JSON.
     */
    implicit val decoder: Decoder[MediaUploadParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaUploadParameters] = deriveEncoder
}
