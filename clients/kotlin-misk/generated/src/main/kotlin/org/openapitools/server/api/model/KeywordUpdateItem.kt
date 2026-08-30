package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordUpdateItem(
    /** Keyword ID . */
    val id: kotlin.String,
    val archived: kotlin.Boolean? = null,
    /** **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null
)
