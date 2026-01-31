package org.openapitools.server.model


/**
 * Details of an issue with a quality component.
 *
 * @param id Unique identifier for the issue check. for example: ''null''
 * @param name Human-readable name of the issue. for example: ''null''
 * @param reason Detailed reason for the issue. for example: ''null''
*/
final case class QualityComponentIssue (
  id: String,
  name: String,
  reason: String
)

