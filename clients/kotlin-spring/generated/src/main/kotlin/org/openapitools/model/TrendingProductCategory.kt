package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProductCategoriesEngagementType
import org.openapitools.model.VerticalProductCategory
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
 * Trending shopping product category
 * @param engagementType Engagement type
 * @param pctChangeMom Month-over-month change percentage
 * @param percentRelativeVolume Relative volume percentage
 * @param productCategory Product Category Name
 * @param verticals Vertical name associated with the product category
 */
data class TrendingProductCategory(

    @field:Valid
    @Schema(example = "null", required = true, description = "Engagement type")
    @get:JsonProperty("engagement_type", required = true) val engagementType: ProductCategoriesEngagementType,

    @Schema(example = "null", required = true, description = "Month-over-month change percentage")
    @get:JsonProperty("pct_change_mom", required = true) val pctChangeMom: kotlin.Int,

    @Schema(example = "null", required = true, description = "Relative volume percentage")
    @get:JsonProperty("percent_relative_volume", required = true) val percentRelativeVolume: kotlin.Int,

    @Schema(example = "null", required = true, description = "Product Category Name")
    @get:JsonProperty("product_category", required = true) val productCategory: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Vertical name associated with the product category")
    @get:JsonProperty("verticals") val verticals: kotlin.collections.List<VerticalProductCategory>? = null
) {

}

