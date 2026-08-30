@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Keywords(
    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<KeywordError>,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<Keyword>,

)
