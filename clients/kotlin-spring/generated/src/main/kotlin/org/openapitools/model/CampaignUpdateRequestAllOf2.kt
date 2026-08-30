package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignBidOptionsUpdate
import org.openapitools.model.IntendedPromotionType
import org.openapitools.model.ObjectiveType
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
 * @param bidOptions 
 * @param intendedPromotionType 
 * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
 * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
 * @param isTopOfSearch Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
 * @param objectiveType 
 */
data class CampaignUpdateRequestAllOf2(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("bid_options")
    @get:JsonProperty("bid_options") val bidOptions: CampaignBidOptionsUpdate? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("intended_promotion_type")
    @get:JsonProperty("intended_promotion_type") val intendedPromotionType: IntendedPromotionType? = null,

    @Schema(description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_ltv_optimized")
    @get:JsonProperty("is_ltv_optimized") val isLtvOptimized: kotlin.Boolean? = null,

    @Schema(description = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_performance_plus")
    @get:JsonProperty("is_performance_plus") val isPerformancePlus: kotlin.Boolean? = null,

    @Schema(description = "Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_top_of_search")
    @get:JsonProperty("is_top_of_search") val isTopOfSearch: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type") val objectiveType: ObjectiveType? = null
) {

}

