@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ImageSize(
    @field:JsonProperty("1200x")
    val `1200x`: ImageDetails? = null,

    @field:JsonProperty("150x150")
    val `150x150`: ImageDetails? = null,

    @field:JsonProperty("400x300")
    val `400x300`: ImageDetails? = null,

    @field:JsonProperty("600x")
    val `600x`: ImageDetails? = null,

)
