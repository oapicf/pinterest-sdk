package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelCreateItem(
    val labelType: LabelType,
    /** Label name. 100-character limit. */
    val `value`: kotlin.String
)
