
package org.openapitools.client.model


case class AdGroupDeliveryEstimates (
    _autoTargetingEnabled: Option[Boolean],
    /* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    _creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    _keywords: Option[List[AdGroupDeliveryEstimatesKeywordsItems]],
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. */
    _monthlyFrequencyCap: Option[Integer],
    _optimizationGoalMetadata: Option[OptimizationGoalMetadata],
    /* Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. */
    _optimizationType: Option[OptimizationType],
    _placementGroup: Option[PlacementGroupType],
    /* [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. */
    _productGroupIds: Option[List[String]],
    _targetingSpec: Option[TargetingSpecOptimal]
)
object AdGroupDeliveryEstimates {
    def toStringBody(var_autoTargetingEnabled: Object, var_creativeTypes: Object, var_keywords: Object, var_monthlyFrequencyCap: Object, var_optimizationGoalMetadata: Object, var_optimizationType: Object, var_placementGroup: Object, var_productGroupIds: Object, var_targetingSpec: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"creativeTypes":$var_creativeTypes,"keywords":$var_keywords,"monthlyFrequencyCap":$var_monthlyFrequencyCap,"optimizationGoalMetadata":$var_optimizationGoalMetadata,"optimizationType":$var_optimizationType,"placementGroup":$var_placementGroup,"productGroupIds":$var_productGroupIds,"targetingSpec":$var_targetingSpec
        | }
        """.stripMargin
}
