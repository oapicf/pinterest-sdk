package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Exception
import org.openapitools.model.ProductGroupPromotionResponseElement
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
 * @param &#x60;data&#x60; 
 * @param exceptions 
 */
data class ProductGroupPromotionResponseItem(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: ProductGroupPromotionResponseElement? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<Exception>? = null
    ) {

}

