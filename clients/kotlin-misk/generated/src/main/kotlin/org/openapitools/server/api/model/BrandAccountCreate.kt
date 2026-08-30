package org.openapitools.server.api.model

import org.openapitools.server.api.model.BrandAccountProfileImage
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandAccountCreate(
    val country: Country,
    /** Brand Account name */
    val name: kotlin.String,
    /** Brand Account username */
    val username: kotlin.String,
    /** Brand Account about information */
    val about: kotlin.String? = null,
    val profileImage: BrandAccountProfileImage? = null,
    /** Brand Account website */
    val website: kotlin.String? = null
)
