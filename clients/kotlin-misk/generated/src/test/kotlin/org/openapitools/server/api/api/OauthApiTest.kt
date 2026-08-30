package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.ConversionAccessToken
import org.openapitools.server.api.model.OauthAccessToken
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TokenGrantType
import org.openapitools.server.api.model.TokenTypeHint

@MiskTest(startService = true)
internal class OauthApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var oauthApi: OauthApiAction

    /**
     * To test OauthApiAction.oauthConversionToken
     */
    @Test
    fun `should handle oauthConversionToken`() {
        val response: ConversionAccessToken = oauthApi.oauthConversionToken()
    }

    /**
     * To test OauthApiAction.oauthToken
     */
    @Test
    fun `should handle oauthToken`() {
        val grantType = TODO()
        val code = TODO()
        val continuousRefresh = TODO()
        val redirectUri = TODO()
        val refreshToken = TODO()
        val scope = TODO()
        val response: OauthAccessToken = oauthApi.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)
    }

    /**
     * To test OauthApiAction.tokenRevoke
     */
    @Test
    fun `should handle tokenRevoke`() {
        val token = TODO()
        val tokenTypeHint = TODO()
        val response = oauthApi.tokenRevoke(token, tokenTypeHint)
    }
}
