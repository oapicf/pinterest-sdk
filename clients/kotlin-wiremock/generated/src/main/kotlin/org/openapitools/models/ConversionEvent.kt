@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionEvent {
    @JsonProperty(value = "PAGE_VISIT") PAGE_VISIT,
    @JsonProperty(value = "SIGNUP") SIGNUP,
    @JsonProperty(value = "CHECKOUT") CHECKOUT,
    @JsonProperty(value = "CUSTOM") CUSTOM,
    @JsonProperty(value = "VIEW_CATEGORY") VIEW_CATEGORY,
    @JsonProperty(value = "SEARCH") SEARCH,
    @JsonProperty(value = "ADD_TO_CART") ADD_TO_CART,
    @JsonProperty(value = "WATCH_VIDEO") WATCH_VIDEO,
    @JsonProperty(value = "LEAD") LEAD,
    @JsonProperty(value = "APP_INSTALL") APP_INSTALL,
}
