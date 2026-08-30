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
 * Resource create operation model.
 * @param name targeting template name
 * @param targetingAttributes targeting profile attributes
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
 * @param keywords 
 * @param placementGroup 
 * @param trackingUrls 
 */
data class TargetingTemplateCreate(

    @Schema(required = true, description = "targeting template name")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "targeting profile attributes")
    @param:JsonProperty("targeting_attributes")
    @get:JsonProperty("targeting_attributes", required = true) val targetingAttributes: TargetingSpecOptimal,

    @Schema(description = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = true,

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
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null
) {

}

