package org.openapitools.server.api.model

import org.openapitools.server.api.model.RelatedTermsRelatedTermsListItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelatedTerms(
    /** First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; */
    val id: kotlin.String? = null,
    /** Total number of related terms returned */
    val relatedTermCount: kotlin.Int? = null,
    /** The id of the advertiser. */
    val relatedTermsList: kotlin.collections.List<RelatedTermsRelatedTermsListItems>? = null
)
