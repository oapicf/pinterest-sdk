@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RelatedTermsRelatedTermsListItems(
    @field:JsonProperty("related_terms")
    val relatedTerms: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("term")
    val term: kotlin.String? = null,

)
