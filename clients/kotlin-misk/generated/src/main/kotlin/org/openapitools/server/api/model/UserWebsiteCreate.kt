package org.openapitools.server.api.model

import org.openapitools.server.api.model.WebsiteVerificationMethod
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserWebsiteCreate(
    /** Method used to verify website ownership. */
    val verificationMethod: WebsiteVerificationMethod? = null,
    /** Website with path or domain only */
    val website: kotlin.String? = null
)
