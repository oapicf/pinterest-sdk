package org.openapitools.server.api.model

import org.openapitools.server.api.model.AccountTemplate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TemplatesList200Response(
    val items: kotlin.collections.List<AccountTemplate>,
    val bookmark: kotlin.String? = null
)
