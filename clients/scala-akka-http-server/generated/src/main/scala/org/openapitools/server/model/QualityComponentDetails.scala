package org.openapitools.server.model


/**
 * Metrics for a specific event type within a quality component.
 *
 * @param coverage Coverage percentage for this event type. for example: ''null''
 * @param issues List of issues detected for this event type, if any. for example: ''null''
 * @param overlap Overlap percentage for this event type. Only populated for external_event_id for example: ''null''
*/
final case class QualityComponentDetails (
  coverage: Double,
  issues: Option[Seq[QualityComponentIssue]] = None,
  overlap: Option[Double] = None
)

