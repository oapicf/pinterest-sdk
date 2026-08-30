package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreateCreativeAssetsItem
import org.openapitools.server.api.model.CatalogsDeleteCreativeAssetsItem
import org.openapitools.server.api.model.CatalogsUpdatableCreativeAssetsAttributes
import org.openapitools.server.api.model.CatalogsUpdateCreativeAssetsItem
import org.openapitools.server.api.model.CatalogsUpsertCreativeAssetsItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsBatchItem(
    val attributes: CatalogsUpdatableCreativeAssetsAttributes,
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String,
    val operation: kotlin.String
)
