package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroupAudienceSizingCreativeTypes
import org.openapitools.server.api.model.AdGroupDeliveryEstimatesKeywordsItems
import org.openapitools.server.api.model.OptimizationGoalMetadata
import org.openapitools.server.api.model.OptimizationType
import org.openapitools.server.api.model.PlacementGroupType
import org.openapitools.server.api.model.TargetingSpecOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupDeliveryEstimates(
    val autoTargetingEnabled: kotlin.Boolean? = null,
    /** Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,
    /** Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    val keywords: kotlin.collections.List<AdGroupDeliveryEstimatesKeywordsItems>? = null,
    /** Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. */
    val monthlyFrequencyCap: kotlin.Int? = null,
    val optimizationGoalMetadata: OptimizationGoalMetadata? = null,
    /** Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. */
    val optimizationType: OptimizationType? = null,
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,
    /** [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. */
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,
    val targetingSpec: TargetingSpecOptimal? = null
)
