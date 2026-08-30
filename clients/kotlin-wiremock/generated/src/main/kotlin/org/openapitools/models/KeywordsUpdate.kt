@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordsUpdate(
    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<KeywordUpdateItem>? = null,

)
