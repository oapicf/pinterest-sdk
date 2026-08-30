package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SupplementalItemValidationEvent(
    /** The item attribute referenced by the validation event eg. price, availability, ad_link */
    val attribute: kotlin.String,
    /** The event code that the item validation event references */
    val code: kotlin.Int,
    /** Title message describing the item validation event */
    val message: kotlin.String
)
