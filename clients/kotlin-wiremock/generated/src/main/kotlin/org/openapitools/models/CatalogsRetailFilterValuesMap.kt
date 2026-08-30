@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailFilterValuesMap(
    @field:JsonProperty("ad_image_tags")
    val adImageTags: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ad_video_tags")
    val adVideoTags: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("availability")
    val availability: kotlin.collections.List<ProductAvailability>? = null,

    @field:JsonProperty("brand")
    val brand: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("condition")
    val condition: kotlin.collections.List<ProductCondition>? = null,

    @field:JsonProperty("custom_label_0")
    val customLabel0: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("custom_label_1")
    val customLabel1: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("custom_label_2")
    val customLabel2: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("custom_label_3")
    val customLabel3: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("custom_label_4")
    val customLabel4: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("gender")
    val gender: kotlin.collections.List<Gender>? = null,

    @field:JsonProperty("google_product_category_0")
    val googleProductCategory0: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_1")
    val googleProductCategory1: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_2")
    val googleProductCategory2: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_3")
    val googleProductCategory3: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_4")
    val googleProductCategory4: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_5")
    val googleProductCategory5: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("google_product_category_6")
    val googleProductCategory6: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("media_type")
    val mediaType: kotlin.collections.List<MediaType>? = null,

    @field:JsonProperty("product_type_0")
    val productType0: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("product_type_1")
    val productType1: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("product_type_2")
    val productType2: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("product_type_3")
    val productType3: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("product_type_4")
    val productType4: kotlin.collections.List<kotlin.String>? = null,

)
