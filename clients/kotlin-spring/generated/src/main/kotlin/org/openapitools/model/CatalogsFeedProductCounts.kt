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
 * The counts can be null early in the process.
 * @param ingested The number of products successfully ingested from the feed file.
 * @param original The number of products in the feed file.
 */
data class CatalogsFeedProductCounts(

    @Schema(description = "The number of products successfully ingested from the feed file.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ingested")
    @get:JsonProperty("ingested") val ingested: kotlin.Int? = null,

    @Schema(description = "The number of products in the feed file.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("original")
    @get:JsonProperty("original") val original: kotlin.Int? = null
) {

}

