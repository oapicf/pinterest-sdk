package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreativeAssetsIdFilter(
    val CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria
)
