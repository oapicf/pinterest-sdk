@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class VerticalProductCategory {
    @JsonProperty(value = "FASHION") FASHION,
    @JsonProperty(value = "HOME_DECOR") HOME_DECOR,
    @JsonProperty(value = "BEAUTY") BEAUTY,
}
