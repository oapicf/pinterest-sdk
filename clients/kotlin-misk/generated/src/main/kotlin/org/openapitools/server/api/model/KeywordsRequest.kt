package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordsCommon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsRequest(
    /** Keyword JSON array. Each array element has 3 fields */
    val keywords: kotlin.collections.List<KeywordsCommon>,
    /** Keyword parent entity ID (advertiser, campaign, ad group). */
    val parentId: kotlin.String
)
