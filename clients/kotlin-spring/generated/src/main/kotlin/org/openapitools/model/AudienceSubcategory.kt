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
 * @param id 
 * @param index 
 * @param key 
 * @param name 
 * @param ratio 
 */
data class AudienceSubcategory(

    @Schema(description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(description = "")
    @param:JsonProperty("index")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(description = "")
    @param:JsonProperty("key")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "")
    @param:JsonProperty("ratio")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null
) {

}

