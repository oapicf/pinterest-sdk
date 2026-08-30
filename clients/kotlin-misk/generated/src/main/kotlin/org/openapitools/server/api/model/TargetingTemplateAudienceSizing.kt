package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingTemplateAudienceSizingReachEstimate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateAudienceSizing(
    val reachEstimate: TargetingTemplateAudienceSizingReachEstimate? = null
)
