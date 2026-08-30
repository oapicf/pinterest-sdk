@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserDefinedEventsCreateRequest(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<AdvertiserDefinedEventInput>,

)
