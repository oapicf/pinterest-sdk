package org.openapitools.server.api.model

import org.openapitools.server.api.model.Gender
import org.openapitools.server.api.model.MediaType
import org.openapitools.server.api.model.ProductAvailability
import org.openapitools.server.api.model.ProductCondition
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailFilterValuesMap(
    val adImageTags: kotlin.collections.List<kotlin.String>? = null,
    val adVideoTags: kotlin.collections.List<kotlin.String>? = null,
    val availability: kotlin.collections.List<ProductAvailability>? = null,
    val brand: kotlin.collections.List<kotlin.String>? = null,
    val condition: kotlin.collections.List<ProductCondition>? = null,
    val customLabel0: kotlin.collections.List<kotlin.String>? = null,
    val customLabel1: kotlin.collections.List<kotlin.String>? = null,
    val customLabel2: kotlin.collections.List<kotlin.String>? = null,
    val customLabel3: kotlin.collections.List<kotlin.String>? = null,
    val customLabel4: kotlin.collections.List<kotlin.String>? = null,
    val gender: kotlin.collections.List<Gender>? = null,
    val googleProductCategory0: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory1: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory2: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory3: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory4: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory5: kotlin.collections.List<kotlin.String>? = null,
    val googleProductCategory6: kotlin.collections.List<kotlin.String>? = null,
    val mediaType: kotlin.collections.List<MediaType>? = null,
    val productType0: kotlin.collections.List<kotlin.String>? = null,
    val productType1: kotlin.collections.List<kotlin.String>? = null,
    val productType2: kotlin.collections.List<kotlin.String>? = null,
    val productType3: kotlin.collections.List<kotlin.String>? = null,
    val productType4: kotlin.collections.List<kotlin.String>? = null
)
