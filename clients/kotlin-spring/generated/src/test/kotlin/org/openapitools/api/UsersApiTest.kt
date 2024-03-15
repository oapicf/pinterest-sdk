package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.UserAccountFollowedInterests200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UsersApiTest {

    private val api: UsersApiController = UsersApiController()

    /**
     * To test UsersApiController.userAccountFollowedInterests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountFollowedInterestsTest() {
        val username: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<UserAccountFollowedInterests200Response> = api.userAccountFollowedInterests(username, bookmark, pageSize)

        // TODO: test validations
    }
}
