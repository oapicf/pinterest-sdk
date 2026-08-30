@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplateAudienceSizing(
    @field:JsonProperty("reach_estimate")
    val reachEstimate: TargetingTemplateAudienceSizingReachEstimate? = null,

)
