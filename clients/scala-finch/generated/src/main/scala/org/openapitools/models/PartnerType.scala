package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class PartnerType()

object PartnerType {
    /**
     * Creates the codec for converting PartnerType from and to JSON.
     */
    implicit val decoder: Decoder[PartnerType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PartnerType] = deriveEncoder
}
