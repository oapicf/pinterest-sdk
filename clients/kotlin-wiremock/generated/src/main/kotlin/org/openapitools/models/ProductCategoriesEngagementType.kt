@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ProductCategoriesEngagementType {
    @JsonProperty(value = "ENGAGEMENT") ENGAGEMENT,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
    @JsonProperty(value = "SAVE") SAVE,
}
