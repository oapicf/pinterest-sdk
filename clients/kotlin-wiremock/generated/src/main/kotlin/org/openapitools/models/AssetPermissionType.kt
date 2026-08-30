@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AssetPermissionType {
    @JsonProperty(value = "AGGREGATED_PERMISSION") AGGREGATED_PERMISSION,
    @JsonProperty(value = "DIRECT_PERMISSION") DIRECT_PERMISSION,
}
