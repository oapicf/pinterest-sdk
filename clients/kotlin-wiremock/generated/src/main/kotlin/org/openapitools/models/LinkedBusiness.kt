@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LinkedBusiness(
    @field:JsonProperty("image_large_url")
    val imageLargeUrl: kotlin.String? = null,

    @field:JsonProperty("image_medium_url")
    val imageMediumUrl: kotlin.String? = null,

    @field:JsonProperty("image_small_url")
    val imageSmallUrl: kotlin.String? = null,

    @field:JsonProperty("image_xlarge_url")
    val imageXlargeUrl: kotlin.String? = null,

    @field:JsonProperty("username")
    val username: kotlin.String? = null,

)
