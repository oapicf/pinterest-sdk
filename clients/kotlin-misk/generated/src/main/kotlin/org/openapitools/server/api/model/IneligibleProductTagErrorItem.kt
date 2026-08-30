package org.openapitools.server.api.model

import org.openapitools.server.api.model.IneligibleProductTagReason
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IneligibleProductTagErrorItem(
    /** Reason why the pin is ineligible for tagging. */
    val errorMessage: IneligibleProductTagReason,
    /** Pin ID that failed eligibility check. */
    val pinId: kotlin.String
)
