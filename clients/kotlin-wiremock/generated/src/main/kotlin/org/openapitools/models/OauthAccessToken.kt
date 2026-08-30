@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OauthAccessToken(
    @field:JsonProperty("access_token")
    val accessToken: kotlin.String,

    @field:JsonProperty("expires_in")
    val expiresIn: kotlin.Int,

    @field:JsonProperty("token_type")
    val tokenType: kotlin.String = "bearer",

    @field:JsonProperty("refresh_token")
    val refreshToken: kotlin.String? = null,

    @field:JsonProperty("refresh_token_expires_at")
    val refreshTokenExpiresAt: kotlin.Int? = null,

    @field:JsonProperty("refresh_token_expires_in")
    val refreshTokenExpiresIn: kotlin.Int? = null,

    @field:JsonProperty("response_type")
    val responseType: TokenGrantType? = null,

    @field:JsonProperty("scope")
    val scope: kotlin.String? = null,

)
