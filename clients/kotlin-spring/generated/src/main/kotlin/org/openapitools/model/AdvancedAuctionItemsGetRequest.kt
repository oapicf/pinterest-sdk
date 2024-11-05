package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdvancedAuctionItemsGetRecord
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
 * Request object used to get bid options values for a batch of retail catalog items
 * @param catalogId Catalog id pertaining to the retail item
 * @param items A list of retail catalog items to fetch bid options for
 */
data class AdvancedAuctionItemsGetRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to the retail item")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=10000) 
    @Schema(example = "null", required = true, description = "A list of retail catalog items to fetch bid options for")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<AdvancedAuctionItemsGetRecord>
    ) {

}

