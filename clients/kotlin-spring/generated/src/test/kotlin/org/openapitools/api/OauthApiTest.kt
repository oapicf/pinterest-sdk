package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class OauthApiTest {

    private val api: OauthApiController = OauthApiController()

    /**
     * To test OauthApiController.oauthToken
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun oauthTokenTest() {
        val grantType:kotlin.String = TODO()
        val response: ResponseEntity<OauthAccessTokenResponse> = api.oauthToken(grantType)

        // TODO: test validations
    }

}
