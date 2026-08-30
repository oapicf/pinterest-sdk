package org.openapitools.server.api.model

import org.openapitools.server.api.model.Label
import org.openapitools.server.api.model.LabelError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelsResponse(
    /** Labels that were not successfully applied. */
    val errors: kotlin.collections.List<LabelError>? = null,
    val labels: kotlin.collections.List<Label>? = null
)
