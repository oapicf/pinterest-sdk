package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class BoardPrivacyFilter()

object BoardPrivacyFilter {
    /**
     * Creates the codec for converting BoardPrivacyFilter from and to JSON.
     */
    implicit val decoder: Decoder[BoardPrivacyFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardPrivacyFilter] = deriveEncoder
}
