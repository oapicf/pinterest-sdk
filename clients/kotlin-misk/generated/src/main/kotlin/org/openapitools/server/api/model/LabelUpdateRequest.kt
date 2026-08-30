package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelUpdateItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelUpdateRequest(
    /** Labels that you are applying to the campaign. */
    val labels: kotlin.collections.List<LabelUpdateItem>
)
