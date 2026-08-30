package org.openapitools.server.api.model

import org.openapitools.server.api.model.LabelCreateItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelBulkCreateRequest(
    /** Labels that you are applying to the campaign. */
    val labels: kotlin.collections.List<LabelCreateItem>,
    /** Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    val parentId: kotlin.String
)
