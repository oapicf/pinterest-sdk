package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvancedAuctionOperationError
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
 * Object describing an item bid option deletion operation
 * @param country 
 * @param itemId The catalog retail item id in the merchant namespace
 * @param language 
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 */
data class AdvancedAuctionItemsSubmitDeleteRecord(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @Schema(example = "DS0294-M", required = true, description = "The catalog retail item id in the merchant namespace")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: Language,

    @field:Valid
    @Schema(example = "null", description = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null
) {

}

