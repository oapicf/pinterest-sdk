@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PlacementTrafficType {
    @JsonProperty(value = "ALL") ALL,
    @JsonProperty(value = "TWO_COLUMN_FEED") TWO_COLUMN_FEED,
    @JsonProperty(value = "FULLSCREEN_FEED") FULLSCREEN_FEED,
}
