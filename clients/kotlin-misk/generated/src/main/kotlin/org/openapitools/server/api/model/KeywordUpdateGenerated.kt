package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordUpdateGenerated(
    /** Keyword ID. */
    val id: kotlin.String,
    /** Is keyword archived? */
    val archived: kotlin.Boolean? = null,
    /** &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null
)
