@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedCredentials(
    @field:JsonProperty("password")
    val password: kotlin.String,

    @field:JsonProperty("username")
    val username: kotlin.String,

)
