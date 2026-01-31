package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Entity status
 */
case class NonDraftEntityStatus()

object NonDraftEntityStatus {
    /**
     * Creates the codec for converting NonDraftEntityStatus from and to JSON.
     */
    implicit val decoder: Decoder[NonDraftEntityStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[NonDraftEntityStatus] = deriveEncoder
}
