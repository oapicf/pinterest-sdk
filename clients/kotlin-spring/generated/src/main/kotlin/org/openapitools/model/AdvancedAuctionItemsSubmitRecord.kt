package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvancedAuctionBidOptions
import org.openapitools.model.AdvancedAuctionItemsSubmitDeleteRecord
import org.openapitools.model.AdvancedAuctionItemsSubmitUpsertRecord
import org.openapitools.model.AdvancedAuctionOperation
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
 * Object describing an item bid option operation
 * @param operation 
 * @param itemId The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 * @param bidOptions 
 * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = AdvancedAuctionItemsSubmitDeleteRecord::class, name = "DELETE"),
      JsonSubTypes.Type(value = AdvancedAuctionItemsSubmitUpsertRecord::class, name = "UPSERT")
)

interface AdvancedAuctionItemsSubmitRecord{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val operation: AdvancedAuctionOperation

                @get:Schema(example = "DS0294-M", requiredMode = Schema.RequiredMode.REQUIRED, description = "The catalog retail item id in the merchant namespace")
        val itemId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val language: Language

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val bidOptions: AdvancedAuctionBidOptions

                @get:Schema(example = "[BID, APP_TYPE_BID_MULTIPLIER_SET]", requiredMode = Schema.RequiredMode.REQUIRED, description = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
        val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>


}

