package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpecOptimal
import org.openapitools.model.TargetingTemplateAudienceSizing
import org.openapitools.model.TargetingTemplateKeyword
import org.openapitools.model.TargetingTemplateStatus
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
 * @param targetingAttributes targeting profile attributes
 * @param adAccountId The ID of the advertiser that this targeting template belongs to.
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
 * @param createdTime Targeting template created time. Unix timestamp in seconds.
 * @param id Targeting template ID.
 * @param keywords 
 * @param placementGroup 
 * @param sizing 
 * @param status Indicate targeting template is active or Deleted
 * @param trackingUrls 
 * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
 * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
 */
data class TargetingTemplate(

    @Schema(required = true, description = "targeting template name")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "targeting profile attributes")
    @param:JsonProperty("targeting_attributes")
    @get:JsonProperty("targeting_attributes", required = true) val targetingAttributes: TargetingSpecOptimal,

    @get:Pattern(regexp="^\\d+$")
    @Schema(readOnly = true, description = "The ID of the advertiser that this targeting template belongs to.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = true,

    @Schema(readOnly = true, description = "Targeting template created time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(readOnly = true, description = "Targeting template ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("placement_group")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @param:JsonProperty("sizing")
    @get:JsonProperty("sizing") val sizing: TargetingTemplateAudienceSizing? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Indicate targeting template is active or Deleted")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: TargetingTemplateStatus? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @Schema(readOnly = true, description = "Targeting template updated time.Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @Schema(readOnly = true, description = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
    @param:JsonProperty("valid")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null
) {

}

