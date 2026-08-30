@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AiDisclosuresUpdate(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<AiDisclosureItem>? = null,

)
