package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdvancedAuctionOperationError
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.Language
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionItemsSubmitDeleteRecord(
    val country: Country,
    /** The catalog retail item id in the merchant namespace */
    val itemId: kotlin.String,
    val language: Language,
    val operation: kotlin.String,
    /** Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    val errors: kotlin.collections.List<AdvancedAuctionOperationError>? = null
)
