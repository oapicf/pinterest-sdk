package org.openapitools.server.api.model

import org.openapitools.server.api.model.BrandAccountProfileImageUpdate
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandAccountUpdate(
    /** Brand Account about information */
    val about: kotlin.String? = null,
    val country: Country? = null,
    /** Brand Account name */
    val name: kotlin.String? = null,
    val profileImage: BrandAccountProfileImageUpdate? = null,
    /** Brand Account username */
    val username: kotlin.String? = null,
    /** Brand Account website */
    val website: kotlin.String? = null
)
