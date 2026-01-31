package org.openapitools.api

import org.openapitools.model.ConversionAccessTokenResponse
import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse
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
        
        val response: ResponseEntity<ConversionAccessTokenResponse> = api.oauthConversionToken()

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
        val grantType: kotlin.String = TODO()
        
        val response: ResponseEntity<OauthAccessTokenResponse> = api.oauthToken(grantType)

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
        val tokenTypeHint: kotlin.String? = TODO()
        
        val response: ResponseEntity<Unit> = api.tokenRevoke(token, tokenTypeHint)

        // TODO: test validations
    }
}
