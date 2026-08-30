@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PermissionsWithOwner {
    @JsonProperty(value = "ADMIN") ADMIN,
    @JsonProperty(value = "ANALYST") ANALYST,
    @JsonProperty(value = "FINANCE_MANAGER") FINANCE_MANAGER,
    @JsonProperty(value = "FINANCE_EDIT") FINANCE_EDIT,
    @JsonProperty(value = "FINANCE_VIEW") FINANCE_VIEW,
    @JsonProperty(value = "AUDIENCE_MANAGER") AUDIENCE_MANAGER,
    @JsonProperty(value = "CAMPAIGN_MANAGER") CAMPAIGN_MANAGER,
    @JsonProperty(value = "CATALOGS_MANAGER") CATALOGS_MANAGER,
    @JsonProperty(value = "CATALOGS_VIEWER") CATALOGS_VIEWER,
    @JsonProperty(value = "PROFILE_PUBLISHER") PROFILE_PUBLISHER,
    @JsonProperty(value = "OWNER") OWNER,
}
