@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BusinessAccessRole {
    @JsonProperty(value = "OWNER") OWNER,
    @JsonProperty(value = "ADMIN") ADMIN,
    @JsonProperty(value = "ANALYST") ANALYST,
    @JsonProperty(value = "SOS_READER") SOS_READER,
    @JsonProperty(value = "FINANCE_MANAGER") FINANCE_MANAGER,
    @JsonProperty(value = "FINANCE_VIEW") FINANCE_VIEW,
    @JsonProperty(value = "FINANCE_EDIT") FINANCE_EDIT,
    @JsonProperty(value = "AUDIENCE_MANAGER") AUDIENCE_MANAGER,
    @JsonProperty(value = "CAMPAIGN_MANAGER") CAMPAIGN_MANAGER,
    @JsonProperty(value = "CATALOGS_MANAGER") CATALOGS_MANAGER,
    @JsonProperty(value = "RESTRICTED_OWNER") RESTRICTED_OWNER,
    @JsonProperty(value = "PROFILE_MANAGER") PROFILE_MANAGER,
    @JsonProperty(value = "PROFILE_PUBLISHER") PROFILE_PUBLISHER,
    @JsonProperty(value = "RESOURCE_PINNER_LIST_OWNER") RESOURCE_PINNER_LIST_OWNER,
    @JsonProperty(value = "RESOURCE_PINNER_LIST_READER") RESOURCE_PINNER_LIST_READER,
    @JsonProperty(value = "BIZ_PINNER_LIST_SHARER") BIZ_PINNER_LIST_SHARER,
    @JsonProperty(value = "RESOURCE_CONVERSION_TAGS_READER") RESOURCE_CONVERSION_TAGS_READER,
}
