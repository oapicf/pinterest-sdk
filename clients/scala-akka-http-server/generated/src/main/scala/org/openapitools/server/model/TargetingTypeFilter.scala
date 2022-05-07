package org.openapitools.server.model


/**
 * @param targetingTypes List of targeting types for example: ''null''
*/
final case class TargetingTypeFilter (
  targetingTypes: Option[Seq[AdsAnalyticsTargetingType]]
)

