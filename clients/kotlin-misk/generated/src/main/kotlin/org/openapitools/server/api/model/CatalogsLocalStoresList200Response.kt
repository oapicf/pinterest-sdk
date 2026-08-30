package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocalStore
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsLocalStoresList200Response(
    val items: kotlin.collections.List<LocalStore>,
    val bookmark: kotlin.String? = null
)
