package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvancedAuctionBidOptions
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitDeleteRecord
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitUpsertRecord
import org.openapitools.server.api.model.AdvancedAuctionOperationError
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.Language
import org.openapitools.server.api.model.UpdateMaskBidOptionField
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionItemsSubmitRecord(
    val bidOptions: AdvancedAuctionBidOptions,
    val country: Country,
    /** The catalog retail item id in the merchant namespace */
    val itemId: kotlin.String,
    val language: Language,
    val operation: kotlin.String,
    /** The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. */
    val updateMask: kotlin.collections.List<UpdateMaskBidOptionField>,
    /** Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null
)
