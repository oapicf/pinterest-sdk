package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsUpdatableCreativeAssetsAttributes(
    /** Link to the creative assets page. */
    val androidDeepLink: kotlin.String? = null,
    /** Custom grouping of creative assets. */
    val customLabel0: kotlin.String? = null,
    /** Custom grouping of creative assets. */
    val customLabel1: kotlin.String? = null,
    /** Custom grouping of creative assets. */
    val customLabel2: kotlin.String? = null,
    /** Custom grouping of creative assets. */
    val customLabel3: kotlin.String? = null,
    /** Custom grouping of creative assets. */
    val customLabel4: kotlin.String? = null,
    /** Brief description of the creative assets. */
    val description: kotlin.String? = null,
    /** The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
    val googleProductCategory: kotlin.String? = null,
    /** IOS deep link to the creative assets page. */
    val iosDeepLink: kotlin.String? = null,
    /** Link to the creative assets page. */
    val link: kotlin.String? = null,
    /** The name of the creative assets. */
    val title: kotlin.String? = null,
    /** Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;. */
    val visibility: kotlin.String? = null
)
