package org.openapitools.server.api.model

import org.openapitools.server.api.model.SharedAudienceAccount
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsAudiencesSharedAccountsList200Response(
    val items: kotlin.collections.List<SharedAudienceAccount>,
    val bookmark: kotlin.String? = null
)
