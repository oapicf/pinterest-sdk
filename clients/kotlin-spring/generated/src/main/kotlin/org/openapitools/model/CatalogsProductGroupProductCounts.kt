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
 * Product counts for a CatalogsProductGroup
 * @param inStock 
 * @param outOfStock 
 * @param preorder 
 * @param total 
 */
data class CatalogsProductGroupProductCounts(

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("in_stock", required = true) val inStock: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("out_of_stock", required = true) val outOfStock: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("preorder", required = true) val preorder: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("total", required = true) val total: java.math.BigDecimal
) {

}

