package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */
case class LabelType()

object LabelType {
    /**
     * Creates the codec for converting LabelType from and to JSON.
     */
    implicit val decoder: Decoder[LabelType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelType] = deriveEncoder
}
