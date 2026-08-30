package org.openapitools.server.api.model

import org.openapitools.server.api.model.SSIOInsertionOrderStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SsioInsertionOrdersStatusGetByAdAccount200Response(
    val items: kotlin.collections.List<SSIOInsertionOrderStatus>,
    val bookmark: kotlin.String? = null
)
