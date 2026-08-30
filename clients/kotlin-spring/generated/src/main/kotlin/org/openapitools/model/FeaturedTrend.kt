package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.InterestsEnum
import org.openapitools.model.ProductCategoryRegion
import org.openapitools.model.TrendingTopic
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
 * Featured trending topics for a specific interest and market
 * @param interest The main interest category
 * @param market Market code (e.g., 'US', 'UK', etc.)
 * @param trends List of trending topics within this interest category
 */
data class FeaturedTrend(

    @field:Valid
    @Schema(required = true, description = "The main interest category")
    @param:JsonProperty("interest")
    @get:JsonProperty("interest", required = true) val interest: InterestsEnum,

    @field:Valid
    @Schema(description = "Market code (e.g., 'US', 'UK', etc.)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("market")
    @get:JsonProperty("market") val market: ProductCategoryRegion? = null,

    @field:Valid
    @Schema(description = "List of trending topics within this interest category")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("trends")
    @get:JsonProperty("trends") val trends: kotlin.collections.List<TrendingTopic>? = null
) {

}

