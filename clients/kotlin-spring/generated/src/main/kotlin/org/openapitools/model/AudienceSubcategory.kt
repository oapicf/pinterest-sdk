package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param name Subinterest name.
 * @param ratio Subinterest's percent of category's total audience.
 * @param index Subinterest affinity index.
 * @param id Subinterest ID.
 */
data class AudienceSubcategory(

    @Schema(example = "958862518888", description = "Interest unique key (same as ID).")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "travel destinations", description = "Subinterest name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0.482", description = "Subinterest's percent of category's total audience.")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null,

    @Schema(example = "1.2", description = "Subinterest affinity index.")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(example = "958862518888", description = "Subinterest ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null
    ) {

}

