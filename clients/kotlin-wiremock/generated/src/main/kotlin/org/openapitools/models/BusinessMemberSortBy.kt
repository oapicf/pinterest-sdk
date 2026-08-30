@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BusinessMemberSortBy {
    @JsonProperty(value = "FULL_NAME") FULL_NAME,
    @JsonProperty(value = "BUSINESS_ROLES") BUSINESS_ROLES,
    @JsonProperty(value = "CREATED_TIME") CREATED_TIME,
}
