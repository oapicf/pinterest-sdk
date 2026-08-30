@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AssetSearchBy {
    @JsonProperty(value = "NAME") NAME,
    @JsonProperty(value = "ID") ID,
    @JsonProperty(value = "NAME_OR_ID") NAME_OR_ID,
    @JsonProperty(value = "OWNER_NAME") OWNER_NAME,
    @JsonProperty(value = "NAME_OR_OWNER") NAME_OR_OWNER,
}
