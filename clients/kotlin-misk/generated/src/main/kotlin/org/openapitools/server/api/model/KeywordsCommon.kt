package org.openapitools.server.api.model

import org.openapitools.server.api.model.MatchTypeResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsCommon(
    val matchType: MatchTypeResponse,
    /** Keyword value (120 chars max). */
    val `value`: kotlin.String,
    /** &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null
)
