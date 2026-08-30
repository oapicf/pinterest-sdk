package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreativeAssetsVisibilityType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProductMetadata(
    /** The user-created unique ID that represents the creative assets item. */
    val creativeAssetsId: kotlin.String,
    val visibility: CreativeAssetsVisibilityType
)
