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
 * @param key 
 * @param name 
 * @param ratio 
 * @param index 
 * @param id 
 */
data class AudienceInsightCategoryCommon(

    @Schema(example = "549755885175", description = "")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "travel", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0.551", description = "")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null,

    @Schema(example = "1.2", description = "")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(example = "549755885175", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null
    ) {

}

