@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RelatedTerms(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("related_term_count")
    val relatedTermCount: kotlin.Int? = null,

    @field:JsonProperty("related_terms_list")
    val relatedTermsList: kotlin.collections.List<RelatedTermsRelatedTermsListItems>? = null,

)
