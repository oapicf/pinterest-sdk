package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ProductCategoriesEngagementType
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
 * @param pinterestProductCategoryId Pinterest Product Category Id
 * @param productCategory Product Category Name
 * @param verticals Vertical name associated with the product category
 */
data class TrendingProductCategory(

    @field:Valid
    @Schema(required = true, description = "Engagement type")
    @param:JsonProperty("engagement_type")
    @get:JsonProperty("engagement_type", required = true) val engagementType: ProductCategoriesEngagementType,

    @Schema(required = true, description = "Month-over-month change percentage")
    @param:JsonProperty("pct_change_mom")
    @get:JsonProperty("pct_change_mom", required = true) val pctChangeMom: kotlin.Int,

    @Schema(required = true, description = "Relative volume percentage")
    @param:JsonProperty("percent_relative_volume")
    @get:JsonProperty("percent_relative_volume", required = true) val percentRelativeVolume: kotlin.Int,

    @Schema(required = true, description = "Pinterest Product Category Id")
    @param:JsonProperty("pinterest_product_category_id")
    @get:JsonProperty("pinterest_product_category_id", required = true) val pinterestProductCategoryId: kotlin.Int,

    @Schema(required = true, description = "Product Category Name")
    @param:JsonProperty("product_category")
    @get:JsonProperty("product_category", required = true) val productCategory: kotlin.String,

    @Schema(description = "Vertical name associated with the product category")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("verticals")
    @get:JsonProperty("verticals") val verticals: kotlin.collections.List<kotlin.String>? = null
) {

}

