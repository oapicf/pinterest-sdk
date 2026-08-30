@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FormFactor {
    @JsonProperty(value = "desktop") desktop,
    @JsonProperty(value = "laptop") laptop,
    @JsonProperty(value = "cellphone") cellphone,
    @JsonProperty(value = "tablet") tablet,
    @JsonProperty(value = "smartwatch") smartwatch,
    @JsonProperty(value = "tv") tv,
    @JsonProperty(value = "vr") vr,
    @JsonProperty(value = "console") console,
    @JsonProperty(value = "other") other,
}
