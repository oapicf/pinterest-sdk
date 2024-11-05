package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AudienceSubcategory
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
 * @param key Interest unique key (same as ID).
 * @param name Interest name.
 * @param ratio Interest's percent of category's total audience.
 * @param index Interest affinity index.
 * @param id Interest ID.
 * @param subcategories Subcategory interest distribution
 */
data class AudienceCategory(

    @Schema(example = "1234567", description = "Interest unique key (same as ID).")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "travel", description = "Interest name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0.551", description = "Interest's percent of category's total audience.")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null,

    @Schema(example = "1.2", description = "Interest affinity index.")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(example = "1234567", description = "Interest ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Subcategory interest distribution")
    @get:JsonProperty("subcategories") val subcategories: kotlin.collections.List<AudienceSubcategory>? = null
    ) {

}

