package org.openapitools.api

import org.openapitools.model.BrandAccountsCreate200Response
import org.openapitools.model.BrandAccountsCreateRequest
import org.openapitools.model.BrandAccountsUpdateRequest
import org.openapitools.model.Error
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BusinessAccessApiTest {

    private val api: BusinessAccessApiController = BusinessAccessApiController()

    /**
     * To test BusinessAccessApiController.brandAccountsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun brandAccountsCreateTest() {
        val businessHierarchyId: kotlin.String = TODO()
        val brandAccountsCreateRequest: BrandAccountsCreateRequest = TODO()
        
        val response: ResponseEntity<BrandAccountsCreate200Response> = api.brandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessAccessApiController.brandAccountsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun brandAccountsUpdateTest() {
        val businessHierarchyId: kotlin.String = TODO()
        val brandAccountId: kotlin.String = TODO()
        val brandAccountsUpdateRequest: BrandAccountsUpdateRequest = TODO()
        
        val response: ResponseEntity<BrandAccountsCreate200Response> = api.brandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest)

        // TODO: test validations
    }
}
