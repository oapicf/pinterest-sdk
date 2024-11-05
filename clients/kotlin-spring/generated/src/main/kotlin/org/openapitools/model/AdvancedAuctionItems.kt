package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdvancedAuctionItem
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
 * Response object containing item bid options
 * @param catalogId Response object of item bid options
 * @param items Array with item bid options
 */
data class AdvancedAuctionItems(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Response object of item bid options")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Array with item bid options")
    @get:JsonProperty("items") val items: kotlin.collections.List<AdvancedAuctionItem>? = null
    ) {

}

