package org.openapitools.server.model


/**
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. for example: ''null''
*/
final case class TargetingTypeFilter (
  targetingTypes: Option[Seq[String]] = None
)

