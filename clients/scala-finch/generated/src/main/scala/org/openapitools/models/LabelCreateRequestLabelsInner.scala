package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelType

/**
 * 
 * @param labelUnderscoretype 
 * @param value Label name. 100-character limit.
 */
case class LabelCreateRequestLabelsInner(labelUnderscoretype: LabelType,
                value: String
                )

object LabelCreateRequestLabelsInner {
    /**
     * Creates the codec for converting LabelCreateRequestLabelsInner from and to JSON.
     */
    implicit val decoder: Decoder[LabelCreateRequestLabelsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelCreateRequestLabelsInner] = deriveEncoder
}
