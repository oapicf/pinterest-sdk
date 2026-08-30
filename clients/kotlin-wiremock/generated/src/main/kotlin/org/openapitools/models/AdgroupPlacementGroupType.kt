@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdgroupPlacementGroupType {
    @JsonProperty(value = "ALL") ALL,
    @JsonProperty(value = "SEARCH") SEARCH,
    @JsonProperty(value = "BROWSE") BROWSE,
    @JsonProperty(value = "OTHER") OTHER,
}
