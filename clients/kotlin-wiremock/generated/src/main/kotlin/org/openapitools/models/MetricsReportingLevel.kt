@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MetricsReportingLevel {
    @JsonProperty(value = "ADVERTISER") ADVERTISER,
    @JsonProperty(value = "ADVERTISER_TARGETING") ADVERTISER_TARGETING,
    @JsonProperty(value = "CAMPAIGN") CAMPAIGN,
    @JsonProperty(value = "CAMPAIGN_TARGETING") CAMPAIGN_TARGETING,
    @JsonProperty(value = "AD_GROUP") AD_GROUP,
    @JsonProperty(value = "AD_GROUP_TARGETING") AD_GROUP_TARGETING,
    @JsonProperty(value = "PIN_PROMOTION") PIN_PROMOTION,
    @JsonProperty(value = "PIN_PROMOTION_TARGETING") PIN_PROMOTION_TARGETING,
    @JsonProperty(value = "KEYWORD") KEYWORD,
    @JsonProperty(value = "PRODUCT_GROUP") PRODUCT_GROUP,
    @JsonProperty(value = "PRODUCT_GROUP_TARGETING") PRODUCT_GROUP_TARGETING,
    @JsonProperty(value = "PRODUCT_ITEM") PRODUCT_ITEM,
    @JsonProperty(value = "PRODUCT_ITEM_TARGETING") PRODUCT_ITEM_TARGETING,
}
