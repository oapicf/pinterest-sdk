package org.openapitools.server.api.model

import org.openapitools.server.api.model.NullableLabelStatus
import org.openapitools.server.api.model.NullableLabelType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelErrorData(
    /** Label ID. */
    val id: kotlin.String? = null,
    val labelType: NullableLabelType? = null,
    val status: NullableLabelStatus? = null,
    /** Label name. 100-character limit. */
    val `value`: kotlin.String? = null
)
