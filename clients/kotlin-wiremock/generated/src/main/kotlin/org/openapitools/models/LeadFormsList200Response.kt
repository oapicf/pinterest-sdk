@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormsList200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<LeadForm>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
