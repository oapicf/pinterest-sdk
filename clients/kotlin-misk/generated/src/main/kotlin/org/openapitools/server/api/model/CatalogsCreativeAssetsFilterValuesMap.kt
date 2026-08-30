package org.openapitools.server.api.model

import org.openapitools.server.api.model.MediaType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsFilterValuesMap(
    val customLabel0: kotlin.collections.List<kotlin.String>? = null,
    val customLabel1: kotlin.collections.List<kotlin.String>? = null,
    val customLabel2: kotlin.collections.List<kotlin.String>? = null,
    val customLabel3: kotlin.collections.List<kotlin.String>? = null,
    val customLabel4: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory0: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory1: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory2: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory3: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory4: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory5: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory6: kotlin.collections.List<kotlin.String>? = null,
    val mediaType: kotlin.collections.List<MediaType>? = null
)
