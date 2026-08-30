@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionTagTypeOptimal {
    @JsonProperty(value = "PAGE_LOAD") PAGE_LOAD,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "INITIALIZED") INITIALIZED,
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
    @JsonProperty(value = "WEB_SESSION") WEB_SESSION,
    @JsonProperty(value = "EXTERNAL_MEASUREMENT") EXTERNAL_MEASUREMENT,
    @JsonProperty(value = "ADD_PAYMENT_INFO") ADD_PAYMENT_INFO,
    @JsonProperty(value = "ADD_TO_WISHLIST") ADD_TO_WISHLIST,
    @JsonProperty(value = "INITIATE_CHECKOUT") INITIATE_CHECKOUT,
    @JsonProperty(value = "SUBSCRIBE") SUBSCRIBE,
    @JsonProperty(value = "VIEW_CONTENT") VIEW_CONTENT,
    @JsonProperty(value = "ADVERTISER_DEFINED_EVENT") ADVERTISER_DEFINED_EVENT,
    @JsonProperty(value = "APP_OPEN") APP_OPEN,
    @JsonProperty(value = "CONTACT") CONTACT,
    @JsonProperty(value = "SCHEDULE") SCHEDULE,
    @JsonProperty(value = "FIND_LOCATION") FIND_LOCATION,
    @JsonProperty(value = "CUSTOMIZE_PRODUCT") CUSTOMIZE_PRODUCT,
    @JsonProperty(value = "SUBMIT_APPLICATION") SUBMIT_APPLICATION,
    @JsonProperty(value = "START_TRIAL") START_TRIAL,
}
