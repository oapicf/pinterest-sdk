package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdvancedAuctionBidOptions
import org.openapitools.model.AdvancedAuctionOperationError
import org.openapitools.model.Country
import org.openapitools.model.Language
import org.openapitools.model.UpdateMaskBidOptionField
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * @param bidOptions 
 * @param country 
 * @param itemId The catalog retail item id in the merchant namespace
 * @param language 
 * @param operation 
 * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 */
data class AdvancedAuctionItemsSubmitUpsertRecord(

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
    @get:JsonProperty("language", required = true) val language: Language,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: AdvancedAuctionItemsSubmitUpsertRecord.Operation = kotlin.String.UPSERT,

    @field:Valid
    @Schema(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, description = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
    @param:JsonProperty("update_mask")
    @get:JsonProperty("update_mask", required = true) val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>?,

    @field:Valid
    @Schema(description = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null
) : AdvancedAuctionItemsSubmitRecord {

    /**
    * 
    * Values: UPSERT
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        UPSERT("UPSERT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Operation'")
            }
        }
    }

}

