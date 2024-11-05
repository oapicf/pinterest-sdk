package org.openapitools.server.model


/**
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. for example: ''null''
*/
final case class TargetingTypeFilter (
  targetingTypes: Option[Seq[AdsAnalyticsTargetingType]] = None
)

