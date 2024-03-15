
package org.openapitools.client.model


case class TargetingTypeFilter (
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
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
