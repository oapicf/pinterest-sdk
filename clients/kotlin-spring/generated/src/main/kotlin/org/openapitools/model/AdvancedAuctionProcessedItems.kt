package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdvancedAuctionProcessedItem
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
 * Response object containing the results of an operation on an item bid option
 * @param catalogId Catalog id pertaining to all items
 * @param items Array of advanced auction processed items
 */
data class AdvancedAuctionProcessedItems(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Catalog id pertaining to all items")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Array of advanced auction processed items")
    @get:JsonProperty("items") val items: kotlin.collections.List<AdvancedAuctionProcessedItem>? = null
    ) {

}

