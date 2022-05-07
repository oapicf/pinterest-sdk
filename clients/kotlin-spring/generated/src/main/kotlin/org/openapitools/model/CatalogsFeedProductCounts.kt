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
 * The counts can be null early in the process.
 * @param original The number of products in the feed file
 */
data class CatalogsFeedProductCounts(

    @field:JsonProperty("original") val original: kotlin.Int? = null
) {

}

