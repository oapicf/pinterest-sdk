
package org.openapitools.client.model


case class TargetingTypeFilter (
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
    _targetingTypes: Option[List[AdsAnalyticsTargetingType]]
)
object TargetingTypeFilter {
    def toStringBody(var_targetingTypes: Object) =
        s"""
        | {
        | "targetingTypes":$var_targetingTypes
        | }
        """.stripMargin
}
