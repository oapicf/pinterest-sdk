@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormsCreate200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<LeadFormsCreate200ResponseItemsInner>,

)
