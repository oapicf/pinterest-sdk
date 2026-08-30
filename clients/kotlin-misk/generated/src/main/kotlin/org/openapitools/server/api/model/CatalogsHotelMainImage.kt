package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelMainImage(
    /** &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. */
    val link: kotlin.String? = null,
    /** Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image */
    val tag: kotlin.collections.List<kotlin.String>? = null
)
