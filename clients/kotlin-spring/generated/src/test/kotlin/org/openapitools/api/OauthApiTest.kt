package org.openapitools.api

import org.openapitools.model.ConversionAccessToken
import org.openapitools.model.OauthAccessToken
import org.openapitools.model.PinterestLibError
import org.openapitools.model.TokenGrantType
import org.openapitools.model.TokenTypeHint
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class OauthApiTest {

    private val api: OauthApiController = OauthApiController()

    /**
     * To test OauthApiController.oauthConversionToken
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun oauthConversionTokenTest() {
        
        
        val response: ResponseEntity<ConversionAccessToken> = api.oauthConversionToken()

        // TODO: test validations
    }

    /**
     * To test OauthApiController.oauthToken
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun oauthTokenTest() {
        val grantType: TokenGrantType = TODO()
        val code: kotlin.String? = TODO()
        val continuousRefresh: kotlin.String? = TODO()
        val redirectUri: kotlin.String? = TODO()
        val refreshToken: kotlin.String? = TODO()
        val scope: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<OauthAccessToken> = api.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)

        // TODO: test validations
    }

    /**
     * To test OauthApiController.tokenRevoke
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun tokenRevokeTest() {
        val token: kotlin.String = TODO()
        val tokenTypeHint: TokenTypeHint? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.tokenRevoke(token, tokenTypeHint)

        // TODO: test validations
    }
}
