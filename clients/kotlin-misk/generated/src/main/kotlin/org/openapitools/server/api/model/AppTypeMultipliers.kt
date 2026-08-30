package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecAppType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppTypeMultipliers(
    /** App type identifier. */
    val APP_TYPE: TargetingSpecAppType? = null
)
