@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CreationSource {
    @JsonProperty(value = "ADS_API") ADS_API,
    @JsonProperty(value = "ADS_MANAGER_REPORTING_PAGE") ADS_MANAGER_REPORTING_PAGE,
    @JsonProperty(value = "ADS_MANAGER_REPORT_BUILDER") ADS_MANAGER_REPORT_BUILDER,
}
