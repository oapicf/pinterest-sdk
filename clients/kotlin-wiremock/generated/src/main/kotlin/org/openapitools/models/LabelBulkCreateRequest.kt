@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabelBulkCreateRequest(
    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<LabelCreateItem>,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String,

)
