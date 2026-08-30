@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BusinessRoleForInvite {
    @JsonProperty(value = "EMPLOYEE") EMPLOYEE,
    @JsonProperty(value = "BIZ_ADMIN") BIZ_ADMIN,
    @JsonProperty(value = "PARTNER") PARTNER,
}
