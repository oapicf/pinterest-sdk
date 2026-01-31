package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.QualityComponentIssue
import scala.collection.immutable.Seq

/**
 * Metrics for a specific event type within a quality component.
 * @param coverage Coverage percentage for this event type.
 * @param issues List of issues detected for this event type, if any.
 * @param overlap Overlap percentage for this event type. Only populated for external_event_id
 */
case class QualityComponentDetails(coverage: BigDecimal,
                issues: Option[Seq[QualityComponentIssue]],
                overlap: Option[BigDecimal]
                )

object QualityComponentDetails {
    /**
     * Creates the codec for converting QualityComponentDetails from and to JSON.
     */
    implicit val decoder: Decoder[QualityComponentDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityComponentDetails] = deriveEncoder
}
