package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.ConversionAccessToken
import org.openapitools.server.api.model.OauthAccessToken
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TokenGrantType
import org.openapitools.server.api.model.TokenTypeHint

/**
* @TODO("Fill out implementation")
*/
@Singleton
class OauthApiAction @Inject constructor(
) : WebAction {

    @Post("/oauth/conversion_token")
    @Description("Generate OAuth access token for conversion API")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun oauthConversionToken(
    ): ConversionAccessToken {
        TODO()
    }

    @Post("/oauth/token")
    @Description("Generate OAuth access token")
    @RequestContentType(MediaTypes.APPLICATION_FORM_URLENCODED)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun oauthToken(
        @QueryParam(value = "grant_type") grantType: TokenGrantType , 
        @QueryParam(value = "code") code: kotlin.String? , 
        @QueryParam(value = "continuous_refresh") continuousRefresh: kotlin.String? , 
        @QueryParam(value = "redirect_uri") redirectUri: kotlin.String? , 
        @QueryParam(value = "refresh_token") refreshToken: kotlin.String? , 
        @QueryParam(value = "scope") scope: kotlin.String? 
    ): OauthAccessToken {
        TODO()
    }

    @Post("/oauth/token/revoke")
    @Description("Revoke a token")
    @RequestContentType(MediaTypes.APPLICATION_FORM_URLENCODED)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun tokenRevoke(
        @QueryParam(value = "token") token: kotlin.String , 
        @QueryParam(value = "token_type_hint") tokenTypeHint: TokenTypeHint? 
    ): Response<Unit> {
        TODO()
    }
}
