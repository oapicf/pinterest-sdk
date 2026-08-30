@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsUpdatableCreativeAssetsAttributes(
    @field:JsonProperty("android_deep_link")
    val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("custom_label_0")
    val customLabel0: kotlin.String? = null,

    @field:JsonProperty("custom_label_1")
    val customLabel1: kotlin.String? = null,

    @field:JsonProperty("custom_label_2")
    val customLabel2: kotlin.String? = null,

    @field:JsonProperty("custom_label_3")
    val customLabel3: kotlin.String? = null,

    @field:JsonProperty("custom_label_4")
    val customLabel4: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("google_product_category")
    val googleProductCategory: kotlin.String? = null,

    @field:JsonProperty("ios_deep_link")
    val iosDeepLink: kotlin.String? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("visibility")
    val visibility: kotlin.String? = null,

)
