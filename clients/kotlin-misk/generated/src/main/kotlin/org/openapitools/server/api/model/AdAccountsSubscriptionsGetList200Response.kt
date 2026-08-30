package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadSubscription
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsSubscriptionsGetList200Response(
    val items: kotlin.collections.List<LeadSubscription>,
    val bookmark: kotlin.String? = null
)
