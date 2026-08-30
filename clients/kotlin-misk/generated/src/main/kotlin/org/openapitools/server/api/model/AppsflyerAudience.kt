package org.openapitools.server.api.model

import org.openapitools.server.api.model.AppsflyerPlatform
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppsflyerAudience(
    /** The ID of the audience container */
    val containerId: kotlin.String,
    /** The name of the audience */
    val name: kotlin.String,
    /** The platform of the audience */
    val platform: AppsflyerPlatform
)
