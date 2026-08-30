@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordsRequest(
    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<KeywordsCommon>,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String,

)
