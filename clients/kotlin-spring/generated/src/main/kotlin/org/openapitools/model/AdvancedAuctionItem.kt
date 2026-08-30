package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvancedAuctionBidOptions
import org.openapitools.model.Country
import org.openapitools.model.Language
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
 * @param bidOptions 
 * @param country 
 * @param itemId The catalog retail item id in the merchant namespace
 * @param language 
 */
data class AdvancedAuctionItem(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("bid_options")
    @get:JsonProperty("bid_options", required = true) val bidOptions: AdvancedAuctionBidOptions,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("country")
    @get:JsonProperty("country", required = true) val country: Country,

    @Schema(example = "DS0294-M", required = true, description = "The catalog retail item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("language")
    @get:JsonProperty("language", required = true) val language: Language
) {

}

