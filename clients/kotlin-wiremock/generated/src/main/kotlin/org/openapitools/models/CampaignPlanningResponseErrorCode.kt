@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningResponseErrorCode {
    @JsonProperty(value = "SERVER_ERROR") SERVER_ERROR,
    @JsonProperty(value = "AUDIENCE_LIST_MISSING") AUDIENCE_LIST_MISSING,
    @JsonProperty(value = "INVALID_REQUEST") INVALID_REQUEST,
    @JsonProperty(value = "PRODUCT_GROUP_MISSING") PRODUCT_GROUP_MISSING,
}
