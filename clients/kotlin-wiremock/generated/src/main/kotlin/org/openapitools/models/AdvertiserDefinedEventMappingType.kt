@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdvertiserDefinedEventMappingType {
    @JsonProperty(value = "SIGNUP") SIGNUP,
    @JsonProperty(value = "ADD_TO_CART") ADD_TO_CART,
    @JsonProperty(value = "LEAD") LEAD,
    @JsonProperty(value = "CHECKOUT") CHECKOUT,
    @JsonProperty(value = "SUBSCRIBE") SUBSCRIBE,
    @JsonProperty(value = "ADD_TO_WISHLIST") ADD_TO_WISHLIST,
    @JsonProperty(value = "ADD_PAYMENT_INFO") ADD_PAYMENT_INFO,
    @JsonProperty(value = "INITIATE_CHECKOUT") INITIATE_CHECKOUT,
    @JsonProperty(value = "CONTACT") CONTACT,
    @JsonProperty(value = "CUSTOMIZE_PRODUCT") CUSTOMIZE_PRODUCT,
    @JsonProperty(value = "FIND_LOCATION") FIND_LOCATION,
    @JsonProperty(value = "SCHEDULE") SCHEDULE,
    @JsonProperty(value = "SUBMIT_APPLICATION") SUBMIT_APPLICATION,
    @JsonProperty(value = "START_TRIAL") START_TRIAL,
    @JsonProperty(value = "PAGE_VISIT") PAGE_VISIT,
    @JsonProperty(value = "VIEW_CATEGORY") VIEW_CATEGORY,
    @JsonProperty(value = "VIEW_CONTENT") VIEW_CONTENT,
    @JsonProperty(value = "SEARCH") SEARCH,
    @JsonProperty(value = "WATCH_VIDEO") WATCH_VIDEO,
}
