package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * bid option field to apply operation updates to
 */
case class UpdateMaskBidOptionField()

object UpdateMaskBidOptionField {
    /**
     * Creates the codec for converting UpdateMaskBidOptionField from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMaskBidOptionField] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMaskBidOptionField] = deriveEncoder
}
