package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdgroupTrackingFeatureType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdgroupTrackingFeatures(
    /** Tracking features. To clear this field, set to null. */
    val enabled: kotlin.collections.List<AdgroupTrackingFeatureType>? = null
)
