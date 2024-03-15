package org.openapitools.server.model


/**
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. for example: ''null''
*/
final case class TargetingTypeFilter (
  targetingTypes: Option[Seq[AdsAnalyticsTargetingType]] = None
)

