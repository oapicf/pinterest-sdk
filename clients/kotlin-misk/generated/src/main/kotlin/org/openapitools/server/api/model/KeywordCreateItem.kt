package org.openapitools.server.api.model

import org.openapitools.server.api.model.MatchType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordCreateItem(
    /** Keyword [match type](/docs/api-features/targeting-overview/) */
    val matchType: MatchType,
    /** Keyword value (120 chars max). */
    val `value`: kotlin.String,
    /** **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null
)
