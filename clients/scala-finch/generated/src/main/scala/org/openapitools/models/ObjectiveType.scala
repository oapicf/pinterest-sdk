package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Campaign objective type.
 */
case class ObjectiveType()

object ObjectiveType {
    /**
     * Creates the codec for converting ObjectiveType from and to JSON.
     */
    implicit val decoder: Decoder[ObjectiveType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ObjectiveType] = deriveEncoder
}
