package org.openapitools.server.api.model

import org.openapitools.server.api.model.AppsflyerPlatform
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AppsflyerAudienceCreate(
    /** The name of the audience */
    val name: kotlin.String,
    /** The platform of the audience */
    val platform: AppsflyerPlatform
)
