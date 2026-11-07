package org.openapitools.api

import org.openapitools.model.BrandAccount
import org.openapitools.model.BrandAccountCreate
import org.openapitools.model.BrandAccountUpdate
import org.openapitools.model.PinterestLibError
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
        val brandAccountCreate: BrandAccountCreate = TODO()
        
        
        val response: ResponseEntity<BrandAccount> = api.brandAccountsCreate(businessHierarchyId, brandAccountCreate)

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
        val brandAccountId: kotlin.String = TODO()
        val businessHierarchyId: kotlin.String = TODO()
        val brandAccountUpdate: BrandAccountUpdate = TODO()
        
        
        val response: ResponseEntity<BrandAccount> = api.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)

        // TODO: test validations
    }
}
