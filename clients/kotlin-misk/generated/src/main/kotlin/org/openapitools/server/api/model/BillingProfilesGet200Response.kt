package org.openapitools.server.api.model

import org.openapitools.server.api.model.BillingProfilesResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BillingProfilesGet200Response(
    val items: kotlin.collections.List<BillingProfilesResponse>,
    val bookmark: kotlin.String? = null
)
