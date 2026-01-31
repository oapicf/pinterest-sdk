package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class LabelsList200Response(bookmark: Option[String],
                items: Seq[LabelsResponse]
                )

object LabelsList200Response {
    /**
     * Creates the codec for converting LabelsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[LabelsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelsList200Response] = deriveEncoder
}
