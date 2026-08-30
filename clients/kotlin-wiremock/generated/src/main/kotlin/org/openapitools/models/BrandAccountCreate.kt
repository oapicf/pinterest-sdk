@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BrandAccountCreate(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("username")
    val username: kotlin.String,

    @field:JsonProperty("about")
    val about: kotlin.String? = null,

    @field:JsonProperty("profile_image")
    val profileImage: BrandAccountProfileImage? = null,

    @field:JsonProperty("website")
    val website: kotlin.String? = null,

)
