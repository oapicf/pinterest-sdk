package org.openapitools.server.api.model

import org.openapitools.server.api.model.TokenGrantType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OauthAccessToken(
    val accessToken: kotlin.String,
    val expiresIn: kotlin.Int,
    val tokenType: kotlin.String = "bearer",
    val refreshToken: kotlin.String? = null,
    val refreshTokenExpiresAt: kotlin.Int? = null,
    val refreshTokenExpiresIn: kotlin.Int? = null,
    val responseType: TokenGrantType? = null,
    val scope: kotlin.String? = null
)
