package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinkedBusiness(
    /** image_large_url */
    val imageLargeUrl: kotlin.String? = null,
    /** image_medium_url */
    val imageMediumUrl: kotlin.String? = null,
    /** image_small_url */
    val imageSmallUrl: kotlin.String? = null,
    /** image_xlarge_url */
    val imageXlargeUrl: kotlin.String? = null,
    /** Username */
    val username: kotlin.String? = null
)
