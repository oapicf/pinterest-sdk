@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdgroupTrackingFeatures(
    @field:JsonProperty("enabled")
    val enabled: kotlin.collections.List<AdgroupTrackingFeatureType>? = null,

)
