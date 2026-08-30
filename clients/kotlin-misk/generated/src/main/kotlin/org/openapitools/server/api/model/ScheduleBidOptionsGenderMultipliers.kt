package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecGender
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleBidOptionsGenderMultipliers(
    val GENDER: TargetingSpecGender? = null
)
