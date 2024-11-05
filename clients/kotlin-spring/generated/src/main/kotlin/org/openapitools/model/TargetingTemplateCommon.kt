package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpec
import org.openapitools.model.TargetingTemplateKeyword
import org.openapitools.model.TrackingUrls
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
 * @param name targeting template name
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param targetingAttributes 
 * @param placementGroup 
 * @param keywords 
 * @param trackingUrls 
 */
data class TargetingTemplateCommon(

    @Schema(example = "Gaming", description = "targeting template name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_attributes") val targetingAttributes: TargetingSpec? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @field:Valid
    @Schema(example = "[{\"value\":\"cats\",\"match_type\":\"EXACT_NEGATIVE\"}]", description = "")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null
    ) {

}

