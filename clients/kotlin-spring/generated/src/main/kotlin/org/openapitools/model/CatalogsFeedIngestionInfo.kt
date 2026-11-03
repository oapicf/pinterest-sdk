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
 * @param IN_STOCK The number of ingested products that are in stock.
 * @param OUT_OF_STOCK The number of ingested products that are in out of stock.
 * @param PREORDER The number of ingested products that are in preorder.
 */
data class CatalogsFeedIngestionInfo(

    @Schema(description = "The number of ingested products that are in stock.")
    @param:JsonProperty("IN_STOCK")
    @get:JsonProperty("IN_STOCK") val IN_STOCK: kotlin.Int? = null,

    @Schema(description = "The number of ingested products that are in out of stock.")
    @param:JsonProperty("OUT_OF_STOCK")
    @get:JsonProperty("OUT_OF_STOCK") val OUT_OF_STOCK: kotlin.Int? = null,

    @Schema(description = "The number of ingested products that are in preorder.")
    @param:JsonProperty("PREORDER")
    @get:JsonProperty("PREORDER") val PREORDER: kotlin.Int? = null
) {

}

