package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.InnerProductCategoriesMetricsHighlights
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
 * Key performance metrics highlights for this product category
 * @param engagement Engagement metric value
 * @param outboundClicks Number of outbound clicks
 * @param pinSaves Number of pin saves
 */
data class ProductCategoriesMetricsHighlights(

    @field:Valid
    @Schema(example = "null", description = "Engagement metric value")
    @get:JsonProperty("engagement") val engagement: InnerProductCategoriesMetricsHighlights? = null,

    @field:Valid
    @Schema(example = "null", description = "Number of outbound clicks")
    @get:JsonProperty("outbound_clicks") val outboundClicks: InnerProductCategoriesMetricsHighlights? = null,

    @field:Valid
    @Schema(example = "null", description = "Number of pin saves")
    @get:JsonProperty("pin_saves") val pinSaves: InnerProductCategoriesMetricsHighlights? = null
) {

}

