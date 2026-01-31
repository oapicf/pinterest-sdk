package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Label parent entity type.
 */
case class LabelParentType()

object LabelParentType {
    /**
     * Creates the codec for converting LabelParentType from and to JSON.
     */
    implicit val decoder: Decoder[LabelParentType] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelParentType] = deriveEncoder
}
