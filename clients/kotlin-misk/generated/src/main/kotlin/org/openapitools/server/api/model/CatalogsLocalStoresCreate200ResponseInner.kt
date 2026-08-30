package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInnerData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsLocalStoresCreate200ResponseInner(
    val `data`: CatalogsLocalStoresCreate200ResponseInnerData
)
