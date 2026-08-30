package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelatedTermsRelatedTermsListItems(
    val relatedTerms: kotlin.collections.List<kotlin.String>? = null,
    val term: kotlin.String? = null
)
