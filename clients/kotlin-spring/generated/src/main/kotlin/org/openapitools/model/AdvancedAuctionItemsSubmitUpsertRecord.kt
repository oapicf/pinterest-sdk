package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvancedAuctionBidOptions
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
 * Object describing an item bid option upsert operation
 * @param itemId The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 * @param bidOptions 
 * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 */
data class AdvancedAuctionItemsSubmitUpsertRecord(

    @Schema(example = "DS0294-M", required = true, description = "The catalog retail item id in the merchant namespace")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: Language,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bid_options", required = true) val bidOptions: AdvancedAuctionBidOptions,

    @field:Valid
    @Schema(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, description = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
    @get:JsonProperty("update_mask", required = true) val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>?
    ) {

}

