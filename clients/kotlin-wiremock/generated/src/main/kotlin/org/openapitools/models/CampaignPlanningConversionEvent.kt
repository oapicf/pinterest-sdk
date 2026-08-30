@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignPlanningConversionEvent {
    @JsonProperty(value = "SIGNUP") SIGNUP,
    @JsonProperty(value = "CHECKOUT") CHECKOUT,
    @JsonProperty(value = "ADD_TO_CART") ADD_TO_CART,
    @JsonProperty(value = "LEAD") LEAD,
}
