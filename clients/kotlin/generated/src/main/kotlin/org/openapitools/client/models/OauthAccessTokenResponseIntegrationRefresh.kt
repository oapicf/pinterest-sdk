/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 *
 * @param refreshToken 
 * @param refreshTokenExpiresIn 
 */


data class OauthAccessTokenResponseIntegrationRefresh (

    @Json(name = "refresh_token")
    val refreshToken: kotlin.String,

    @Json(name = "refresh_token_expires_in")
    val refreshTokenExpiresIn: kotlin.Int

) {

    /**
     * 
     *
     * Values: authorization_code,refresh_token,client_credentials
     */
    @JsonClass(generateAdapter = false)
    enum class ResponseType(val value: kotlin.String) {
        @Json(name = "authorization_code") authorization_code("authorization_code"),
        @Json(name = "refresh_token") refresh_token("refresh_token"),
        @Json(name = "client_credentials") client_credentials("client_credentials");
    }

}

