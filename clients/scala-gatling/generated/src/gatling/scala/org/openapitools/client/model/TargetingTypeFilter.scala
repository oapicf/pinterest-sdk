
package org.openapitools.client.model


case class TargetingTypeFilter (
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
    _targetingTypes: Option[List[String]]
)
object TargetingTypeFilter {
    def toStringBody(var_targetingTypes: Object) =
        s"""
        | {
        | "targetingTypes":$var_targetingTypes
        | }
        """.stripMargin
}
