package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details of an issue with a quality component.
 * @param id Unique identifier for the issue check.
 * @param name Human-readable name of the issue.
 * @param reason Detailed reason for the issue.
 */
case class QualityComponentIssue(id: String,
                name: String,
                reason: String
                )

object QualityComponentIssue {
    /**
     * Creates the codec for converting QualityComponentIssue from and to JSON.
     */
    implicit val decoder: Decoder[QualityComponentIssue] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityComponentIssue] = deriveEncoder
}
