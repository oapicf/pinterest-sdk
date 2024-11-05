package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpec
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
 * 
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param creativeTypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @param targetingSpec 
 * @param productGroupIds Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 */
data class AdGroupAudienceSizingRequest(

    @Schema(example = "true", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:Valid
    @Schema(example = "null", description = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = "ALL",

    @Schema(example = "null", description = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
    @get:JsonProperty("creative_types") val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingRequest.CreativeTypes>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpec? = null,

    @Schema(example = "null", description = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
    @get:JsonProperty("product_group_ids") val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<AdGroupAudienceSizingRequestKeywordsInner>? = null
    ) {

    /**
    * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    * Values: REGULAR,VIDEO,SHOPPING,CAROUSEL,MAX_VIDEO,SHOP_THE_PIN,COLLECTION,IDEA
    */
    enum class CreativeTypes(@get:JsonValue val value: kotlin.String) {

        REGULAR("REGULAR"),
        VIDEO("VIDEO"),
        SHOPPING("SHOPPING"),
        CAROUSEL("CAROUSEL"),
        MAX_VIDEO("MAX_VIDEO"),
        SHOP_THE_PIN("SHOP_THE_PIN"),
        COLLECTION("COLLECTION"),
        IDEA("IDEA");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CreativeTypes {
                return values().first{it -> it.value == value}
            }
        }
    }

}

