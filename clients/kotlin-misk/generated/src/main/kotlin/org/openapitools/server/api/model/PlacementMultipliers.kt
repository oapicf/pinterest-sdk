package org.openapitools.server.api.model

import org.openapitools.server.api.model.PlacementType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlacementMultipliers(
    /** Placement type identifier. */
    val PLACEMENT: PlacementType? = null
)
