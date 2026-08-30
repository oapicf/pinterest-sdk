package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelUpdateItem(
    /** Label ID. */
    val id: kotlin.String,
    val status: LabelStatus? = null,
    /** Label name. 100-character limit. */
    val `value`: kotlin.String? = null
)
