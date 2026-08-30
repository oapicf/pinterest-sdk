package org.openapitools.server.api.model

import org.openapitools.server.api.model.IneligibleProductTagsErrorDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductTagsError(
    val code: kotlin.Int,
    val message: kotlin.String,
    /** Details about which product tags failed eligibility check. */
    val details: IneligibleProductTagsErrorDetails? = null
)
