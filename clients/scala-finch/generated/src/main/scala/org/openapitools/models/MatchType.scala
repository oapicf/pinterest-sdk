package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Keyword match type
 */
case class MatchType()

object MatchType {
    /**
     * Creates the codec for converting MatchType from and to JSON.
     */
    implicit val decoder: Decoder[MatchType] = deriveDecoder
    implicit val encoder: ObjectEncoder[MatchType] = deriveEncoder
}
