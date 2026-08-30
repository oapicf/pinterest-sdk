@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Interest(
    @field:JsonProperty("canonical_url")
    val canonicalUrl: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("key")
    val key: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
