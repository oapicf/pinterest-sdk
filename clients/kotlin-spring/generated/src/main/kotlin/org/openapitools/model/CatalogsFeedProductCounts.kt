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
 * The counts can be null early in the process.
 * @param original The number of products in the feed file.
 * @param ingested The number of products successfully ingested from the feed file.
 */
data class CatalogsFeedProductCounts(

    @Schema(example = "null", description = "The number of products in the feed file.")
    @get:JsonProperty("original") val original: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of products successfully ingested from the feed file.")
    @get:JsonProperty("ingested") val ingested: kotlin.Int? = null
) {

}

