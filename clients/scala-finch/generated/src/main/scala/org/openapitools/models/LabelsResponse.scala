package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Label
import org.openapitools.models.LabelError
import scala.collection.immutable.Seq

/**
 * 
 * @param errors Labels that were not successfully applied.
 * @param labels 
 */
case class LabelsResponse(errors: Option[Seq[LabelError]],
                labels: Option[Seq[Label]]
                )

object LabelsResponse {
    /**
     * Creates the codec for converting LabelsResponse from and to JSON.
     */
    implicit val decoder: Decoder[LabelsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelsResponse] = deriveEncoder
}
