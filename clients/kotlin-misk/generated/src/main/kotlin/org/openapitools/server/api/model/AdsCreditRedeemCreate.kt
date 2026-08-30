package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsCreditRedeemCreate(
    /** Takes in a SHA256 hash of the offerCode. */
    val offerCodeHash: kotlin.String,
    /** If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
    val validateOnly: kotlin.Boolean
)
