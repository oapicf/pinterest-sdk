@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EntityLabelError(
    @field:JsonProperty("data")
    val `data`: EntityLabel? = null,

    @field:JsonProperty("error_messages")
    val errorMessages: kotlin.collections.List<kotlin.String>? = null,

)
