package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelUpdateRequestLabelsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param labels Labels that you are applying to the campaign.
 */
case class LabelUpdateRequest(labels: Seq[LabelUpdateRequestLabelsInner]
                )

object LabelUpdateRequest {
    /**
     * Creates the codec for converting LabelUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[LabelUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelUpdateRequest] = deriveEncoder
}
