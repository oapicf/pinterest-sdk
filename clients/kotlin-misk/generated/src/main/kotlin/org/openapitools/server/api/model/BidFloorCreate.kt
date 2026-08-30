package org.openapitools.server.api.model

import org.openapitools.server.api.model.BidFloorSpec
import org.openapitools.server.api.model.TargetingSpecOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidFloorCreate(
    /** List of bid floor specifications. */
    val bidFloorSpecs: kotlin.collections.List<BidFloorSpec>,
    /** Ad group targeting specification defining the ad group target audience. */
    val targetingSpec: TargetingSpecOptimal? = null
)
