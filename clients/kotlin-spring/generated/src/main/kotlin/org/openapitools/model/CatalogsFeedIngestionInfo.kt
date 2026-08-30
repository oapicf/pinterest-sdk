package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IN_STOCK")
    @get:JsonProperty("IN_STOCK") val IN_STOCK: kotlin.Int? = null,

    @Schema(description = "The number of ingested products that are in out of stock.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("OUT_OF_STOCK")
    @get:JsonProperty("OUT_OF_STOCK") val OUT_OF_STOCK: kotlin.Int? = null,

    @Schema(description = "The number of ingested products that are in preorder.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PREORDER")
    @get:JsonProperty("PREORDER") val PREORDER: kotlin.Int? = null
) {

}

