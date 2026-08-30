@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordsCreate(
    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<KeywordCreateItem>,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String,

)
