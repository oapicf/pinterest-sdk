package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord
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
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 * @param catalogId Catalog id pertaining to all items
 * @param items Array of item bid option operations
 */
data class AdvancedAuctionItemsSubmitRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to all items")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=10000) 
    @Schema(example = "null", required = true, description = "Array of item bid option operations")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<AdvancedAuctionItemsSubmitRecord>
    ) {

}

