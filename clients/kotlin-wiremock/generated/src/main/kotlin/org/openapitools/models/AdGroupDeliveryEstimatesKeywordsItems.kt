@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupDeliveryEstimatesKeywordsItems(
    @field:JsonProperty("match_type")
    val matchType: NullalbleMatchType,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

)
