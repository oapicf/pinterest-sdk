package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes
import org.openapitools.model.AdGroupAudienceSizingKeyword
import org.openapitools.model.AdgroupPlacementGroupType
import org.openapitools.model.TargetingSpecOptimal
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Resource create operation model.
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
 * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @param placementGroup [Placement group](/docs/redoc/#section/Placement-group).
 * @param productGroupIds Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @param targetingSpec 
 */
data class AdGroupAudienceSizingCreate(

    @Schema(description = "Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:Valid
    @Schema(description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
    @param:JsonProperty("creative_types")
    @get:JsonProperty("creative_types") val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,

    @field:Valid
    @Schema(description = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<AdGroupAudienceSizingKeyword>? = null,

    @field:Valid
    @Schema(description = "[Placement group](/docs/redoc/#section/Placement-group).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("placement_group")
    @get:JsonProperty("placement_group") val placementGroup: AdgroupPlacementGroupType? = null,

    @Schema(description = "Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
    @param:JsonProperty("product_group_ids")
    @get:JsonProperty("product_group_ids") val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_spec")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpecOptimal? = null
) {

}

