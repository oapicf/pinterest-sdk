package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Keyword match type
 */
case class MatchTypeResponse()

object MatchTypeResponse {
    /**
     * Creates the codec for converting MatchTypeResponse from and to JSON.
     */
    implicit val decoder: Decoder[MatchTypeResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[MatchTypeResponse] = deriveEncoder
}
