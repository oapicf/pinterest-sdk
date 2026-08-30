package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelStatusBulkUpdate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelBulkUpdateRequest(
    /** Label ID. */
    val id: kotlin.String,
    /** Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    val parentId: kotlin.String,
    val status: LabelStatusBulkUpdate
)
