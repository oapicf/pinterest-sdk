@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelBulkUpdateRequest(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String,

    @field:JsonProperty("status")
    val status: LabelStatusBulkUpdate,

)
