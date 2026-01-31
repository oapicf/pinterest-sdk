package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */
case class DisclosureType()

object DisclosureType {
    /**
     * Creates the codec for converting DisclosureType from and to JSON.
     */
    implicit val decoder: Decoder[DisclosureType] = deriveDecoder
    implicit val encoder: ObjectEncoder[DisclosureType] = deriveEncoder
}
