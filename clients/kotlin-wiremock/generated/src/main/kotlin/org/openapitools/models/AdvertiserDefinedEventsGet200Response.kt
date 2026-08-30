@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserDefinedEventsGet200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<AdvertiserDefinedEvent>,

)
