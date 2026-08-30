package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes
import org.openapitools.model.AdGroupDeliveryEstimatesKeywordsItems
import org.openapitools.model.OptimizationGoalMetadata
import org.openapitools.model.OptimizationType
import org.openapitools.model.PlacementGroupType
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
 * Ad group configuration for delivery estimates.
 * @param autoTargetingEnabled 
 * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @param monthlyFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
 * @param optimizationGoalMetadata 
 * @param optimizationType Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
 * @param placementGroup 
 * @param productGroupIds [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
 * @param targetingSpec 
 */
data class AdGroupDeliveryEstimates(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("creative_types")
    @get:JsonProperty("creative_types") val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,

    @field:Valid
    @Schema(description = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<AdGroupDeliveryEstimatesKeywordsItems>? = null,

    @get:Min(value=0)
    @Schema(description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("monthly_frequency_cap")
    @get:JsonProperty("monthly_frequency_cap") val monthlyFrequencyCap: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("optimization_goal_metadata")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: OptimizationGoalMetadata? = null,

    @field:Valid
    @Schema(description = "Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("optimization_type")
    @get:JsonProperty("optimization_type") val optimizationType: OptimizationType? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("placement_group")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @Schema(description = "[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
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

