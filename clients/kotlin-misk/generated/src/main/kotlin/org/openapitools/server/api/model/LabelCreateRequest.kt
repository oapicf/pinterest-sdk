package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelCreateItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelCreateRequest(
    /** Labels that you are applying to the campaign. */
    val labels: kotlin.collections.List<LabelCreateItem>
)
