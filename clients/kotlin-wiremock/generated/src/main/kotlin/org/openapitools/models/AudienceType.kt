@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceType {
    @JsonProperty(value = "CUSTOMER_LIST") CUSTOMER_LIST,
    @JsonProperty(value = "VISITOR") VISITOR,
    @JsonProperty(value = "ENGAGEMENT") ENGAGEMENT,
    @JsonProperty(value = "ACTALIKE") ACTALIKE,
    @JsonProperty(value = "PERSONA") PERSONA,
}
