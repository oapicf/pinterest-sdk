package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibStatus204
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAdPreviewDelete200ResponseInnerStatus(
    val statusCode: java.math.BigDecimal,
    val code: kotlin.Int,
    val message: kotlin.String
)
