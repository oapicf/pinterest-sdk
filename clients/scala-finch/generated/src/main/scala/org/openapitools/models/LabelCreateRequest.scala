package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelCreateRequestLabelsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param labels Labels that you are applying to the campaign.
 * @param parentUnderscoreid Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 */
case class LabelCreateRequest(labels: Seq[LabelCreateRequestLabelsInner],
                parentUnderscoreid: String
                )

object LabelCreateRequest {
    /**
     * Creates the codec for converting LabelCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[LabelCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelCreateRequest] = deriveEncoder
}
