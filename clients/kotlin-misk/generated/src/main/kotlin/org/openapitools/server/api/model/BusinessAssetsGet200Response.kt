package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAssets
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessAssetsGet200Response(
    val items: kotlin.collections.List<BusinessAssets>,
    val bookmark: kotlin.String? = null
)
