@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BulkEntityType {
    @JsonProperty(value = "CAMPAIGN") CAMPAIGN,
    @JsonProperty(value = "AD_GROUP") AD_GROUP,
    @JsonProperty(value = "PRODUCT_GROUP") PRODUCT_GROUP,
    @JsonProperty(value = "AD") AD,
    @JsonProperty(value = "KEYWORD") KEYWORD,
    @JsonProperty(value = "LABEL") LABEL,
    @JsonProperty(value = "SCHEDULE") SCHEDULE,
    @JsonProperty(value = "ENTITY_HISTORY") ENTITY_HISTORY,
}
