package org.openapitools.server.model


/**
 * @param estimate  for example: ''63492000''
 * @param lowerBound  for example: ''47619000''
 * @param upperBound  for example: ''79365000''
*/
final case class TargetingTemplateAudienceSizingReachEstimate (
  estimate: Option[Long] = None,
  lowerBound: Option[Long] = None,
  upperBound: Option[Long] = None
)

