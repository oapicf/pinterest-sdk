package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The unique universal product identifier.
 */
case class UpdatableItemAttributesGtin()

object UpdatableItemAttributesGtin {
    /**
     * Creates the codec for converting UpdatableItemAttributesGtin from and to JSON.
     */
    implicit val decoder: Decoder[UpdatableItemAttributesGtin] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatableItemAttributesGtin] = deriveEncoder
}
