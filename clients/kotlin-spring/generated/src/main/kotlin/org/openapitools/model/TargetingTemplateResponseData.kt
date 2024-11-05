package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpec
import org.openapitools.model.TargetingTemplateAudienceSizing
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
 * @param id Targeting template ID.
 * @param createdTime Targeting template created time. Unix timestamp in seconds.
 * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
 * @param adAccountId The ID of the advertiser that this targeting template belongs to.
 * @param status Indicate targeting template is active or Deleted
 * @param sizing 
 */
data class TargetingTemplateResponseData(

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
    @Schema(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", description = "")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "643", description = "Targeting template ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "1432744744", description = "Targeting template created time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(example = "1432744744", description = "Targeting template updated time.Unix timestamp in seconds.")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "The ID of the advertiser that this targeting template belongs to.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "ACTIVE", description = "Indicate targeting template is active or Deleted")
    @get:JsonProperty("status") val status: TargetingTemplateResponseData.Status? = Status.ACTIVE,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("sizing") val sizing: TargetingTemplateAudienceSizing? = null
    ) {

    /**
    * Indicate targeting template is active or Deleted
    * Values: ACTIVE,DELETED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        ACTIVE("ACTIVE"),
        DELETED("DELETED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().first{it -> it.value == value}
            }
        }
    }

}

