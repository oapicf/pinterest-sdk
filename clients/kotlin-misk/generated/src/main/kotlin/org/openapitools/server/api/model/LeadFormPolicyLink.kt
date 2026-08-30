package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormPolicyLink(
    /** Policy label for an additional policy link. */
    val label: kotlin.String? = null,
    /** Policy link for an additional policy link. */
    val link: kotlin.String? = null
)
