package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinterestLibError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsLocalStoresCreate200ResponseInnerDataOneOf(
    /** The ID of the local store. */
    val id: kotlin.String,
    val exceptions: PinterestLibError
)
