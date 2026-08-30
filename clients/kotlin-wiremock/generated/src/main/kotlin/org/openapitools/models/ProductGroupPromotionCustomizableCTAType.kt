@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductGroupPromotionCustomizableCTAType {
    @JsonProperty(value = "GET_OFFER") GET_OFFER,
    @JsonProperty(value = "LEARN_MORE") LEARN_MORE,
    @JsonProperty(value = "ORDER_NOW") ORDER_NOW,
    @JsonProperty(value = "SHOP_NOW") SHOP_NOW,
    @JsonProperty(value = "SIGN_UP") SIGN_UP,
    @JsonProperty(value = "SUBSCRIBE") SUBSCRIBE,
    @JsonProperty(value = "BUY_NOW") BUY_NOW,
    @JsonProperty(value = "CONTACT_US") CONTACT_US,
    @JsonProperty(value = "GET_QUOTE") GET_QUOTE,
    @JsonProperty(value = "VISIT_SITE") VISIT_SITE,
    @JsonProperty(value = "APPLY_NOW") APPLY_NOW,
    @JsonProperty(value = "BOOK_NOW") BOOK_NOW,
    @JsonProperty(value = "REGISTER_NOW") REGISTER_NOW,
    @JsonProperty(value = "FIND_A_DEALER") FIND_A_DEALER,
    @JsonProperty(value = "WATCH_NOW") WATCH_NOW,
    @JsonProperty(value = "READ_MORE") READ_MORE,
    @JsonProperty(value = "BUY_TICKETS") BUY_TICKETS,
    @JsonProperty(value = "DONATE_NOW") DONATE_NOW,
    @JsonProperty(value = "DOWNLOAD") DOWNLOAD,
    @JsonProperty(value = "EXPLORE_MORE") EXPLORE_MORE,
    @JsonProperty(value = "FIND_A_LOCATION") FIND_A_LOCATION,
    @JsonProperty(value = "GET_DEAL") GET_DEAL,
    @JsonProperty(value = "GET_RECIPE") GET_RECIPE,
    @JsonProperty(value = "GET_SHOWTIMES") GET_SHOWTIMES,
    @JsonProperty(value = "ON_SALE") ON_SALE,
    @JsonProperty(value = "PLAY_GAME") PLAY_GAME,
    @JsonProperty(value = "TRY_IT") TRY_IT,
    @JsonProperty(value = "BUY_ONLINE_PICKUP_IN_STORE") BUY_ONLINE_PICKUP_IN_STORE,
    @JsonProperty(value = "SHOP_ON_ADVERTISER") SHOP_ON_ADVERTISER,
    @JsonProperty(value = "SHOP_THE_COLLECTION") SHOP_THE_COLLECTION,
    @JsonProperty(value = "GET_IT_NOW") GET_IT_NOW,
    @JsonProperty(value = "TAKE_A_PEEK") TAKE_A_PEEK,
    @JsonProperty(value = "TAKE_A_CLOSER_LOOK") TAKE_A_CLOSER_LOOK,
}
