package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecGender
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderMultipliers(
    /** Gender identifier. */
    val GENDER: TargetingSpecGender? = null
)
