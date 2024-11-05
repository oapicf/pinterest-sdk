package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvancedAuctionBidOptions
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord
import org.openapitools.model.AdvancedAuctionOperation
import org.openapitools.model.AdvancedAuctionOperationError
import org.openapitools.model.Country
import org.openapitools.model.Language
import org.openapitools.model.UpdateMaskBidOptionField
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
 * Object describing the result of an operation on an item bid option
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 */
data class AdvancedAuctionProcessedItem(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) override val operation: AdvancedAuctionOperation,

    @Schema(example = "DS0294-M", required = true, description = "The catalog retail item id in the merchant namespace")
    @get:JsonProperty("item_id", required = true) override val itemId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) override val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) override val language: Language,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bid_options", required = true) override val bidOptions: AdvancedAuctionBidOptions,

    @field:Valid
    @Schema(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, description = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
    @get:JsonProperty("update_mask", required = true) override val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>?,

    @field:Valid
    @Schema(example = "null", description = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null
    ) : AdvancedAuctionItemsSubmitRecord{

}

