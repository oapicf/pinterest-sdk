package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemValidationEvent(
    /** The attribute that the item validation event references */
    val attribute: kotlin.String? = null,
    /** The event code that the item validation event references */
    val code: kotlin.Int? = null,
    /** Title message describing the item validation event */
    val message: kotlin.String? = null
)
