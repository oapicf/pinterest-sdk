package org.openapitools.server.api.model

import org.openapitools.server.api.model.NullableLabelStatus
import org.openapitools.server.api.model.NullableLabelType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Label(
    /** Label ID. */
    val id: kotlin.String,
    val labelType: NullableLabelType,
    /** Label name. 100-character limit. */
    val `value`: kotlin.String,
    val status: NullableLabelStatus? = null
)
