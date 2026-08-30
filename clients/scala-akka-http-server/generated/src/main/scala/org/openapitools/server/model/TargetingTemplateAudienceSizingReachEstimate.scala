package org.openapitools.server.model


/**
 * @param estimate  for example: ''null''
 * @param lowerBound  for example: ''null''
 * @param upperBound  for example: ''null''
*/
final case class TargetingTemplateAudienceSizingReachEstimate (
  estimate: Option[Long] = None,
  lowerBound: Option[Long] = None,
  upperBound: Option[Long] = None
)

