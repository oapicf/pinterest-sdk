package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroupAudienceSizingCreativeTypes
import org.openapitools.server.api.model.AdGroupAudienceSizingKeyword
import org.openapitools.server.api.model.AdgroupPlacementGroupType
import org.openapitools.server.api.model.TargetingSpecOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupAudienceSizingCreate(
    /** Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
    val autoTargetingEnabled: kotlin.Boolean? = true,
    /** Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,
    /** Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    val keywords: kotlin.collections.List<AdGroupAudienceSizingKeyword>? = null,
    /** [Placement group](/docs/redoc/#section/Placement-group). */
    val placementGroup: AdgroupPlacementGroupType? = null,
    /** Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,
    val targetingSpec: TargetingSpecOptimal? = null
)
