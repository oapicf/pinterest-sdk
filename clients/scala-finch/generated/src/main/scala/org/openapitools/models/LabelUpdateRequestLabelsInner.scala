package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelStatus

/**
 * 
 * @param id Label ID.
 * @param status 
 * @param value Label name. 100-character limit.
 */
case class LabelUpdateRequestLabelsInner(id: String,
                status: Option[LabelStatus],
                value: Option[String]
                )

object LabelUpdateRequestLabelsInner {
    /**
     * Creates the codec for converting LabelUpdateRequestLabelsInner from and to JSON.
     */
    implicit val decoder: Decoder[LabelUpdateRequestLabelsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelUpdateRequestLabelsInner] = deriveEncoder
}
