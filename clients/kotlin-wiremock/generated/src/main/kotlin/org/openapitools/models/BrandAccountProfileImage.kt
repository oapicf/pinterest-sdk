@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BrandAccountProfileImage(
    @field:JsonProperty("content_type")
    val contentType: kotlin.String,

    @field:JsonProperty("data")
    val `data`: kotlin.String,

)
