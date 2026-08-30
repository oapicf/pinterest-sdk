@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormsCreate200ResponseItemsInner(
    @field:JsonProperty("data")
    val `data`: LeadForm? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<PinterestLibBatchItemException>? = null,

)
