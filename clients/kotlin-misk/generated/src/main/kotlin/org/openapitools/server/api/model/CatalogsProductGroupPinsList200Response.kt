package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProduct
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupPinsList200Response(
    val items: kotlin.collections.List<CatalogsProduct>,
    val bookmark: kotlin.String? = null
)
