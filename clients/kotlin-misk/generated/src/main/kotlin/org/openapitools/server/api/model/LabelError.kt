package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelErrorData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelError(
    val `data`: LabelErrorData? = null,
    val errorMessages: kotlin.collections.List<kotlin.String>? = null
)
