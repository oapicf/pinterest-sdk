@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CatalogsFormat {
    @JsonProperty(value = "TSV") TSV,
    @JsonProperty(value = "CSV") CSV,
    @JsonProperty(value = "XML") XML,
    @JsonProperty(value = "INTEGRATION") INTEGRATION,
}
