package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param inStock 
 * @param outOfStock 
 * @param preorder 
 */
data class CatalogsFeedIngestionInfo(

    @field:JsonProperty("in_stock") val inStock: kotlin.Int? = null,

    @field:JsonProperty("out_of_stock") val outOfStock: kotlin.Int? = null,

    @field:JsonProperty("preorder") val preorder: kotlin.Int? = null
) {

}

