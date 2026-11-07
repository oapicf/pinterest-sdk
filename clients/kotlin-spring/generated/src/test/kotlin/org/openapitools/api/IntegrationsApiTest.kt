package org.openapitools.api

import org.openapitools.model.IntegrationLogsInvalidLogResponse
import org.openapitools.model.IntegrationLogsRequestCreate
import org.openapitools.model.IntegrationLogsSuccessResponse
import org.openapitools.model.IntegrationMetadata
import org.openapitools.model.IntegrationMetadataCreate
import org.openapitools.model.IntegrationMetadataUpdate
import org.openapitools.model.IntegrationRecord
import org.openapitools.model.IntegrationsGetList200Response
import org.openapitools.model.PinterestLibError
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class IntegrationsApiTest {

    private val api: IntegrationsApiController = IntegrationsApiController()

    /**
     * To test IntegrationsApiController.integrationsCommerceDel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsCommerceDelTest() {
        val externalBusinessId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<IntegrationMetadata> = api.integrationsCommerceDel(externalBusinessId)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsCommerceGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsCommerceGetTest() {
        val externalBusinessId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<IntegrationMetadata> = api.integrationsCommerceGet(externalBusinessId)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsCommercePatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsCommercePatchTest() {
        val externalBusinessId: kotlin.String = TODO()
        val integrationMetadataUpdate: IntegrationMetadataUpdate = TODO()
        
        
        val response: ResponseEntity<IntegrationMetadata> = api.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsCommercePost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsCommercePostTest() {
        val integrationMetadataCreate: IntegrationMetadataCreate = TODO()
        
        
        val response: ResponseEntity<IntegrationMetadata> = api.integrationsCommercePost(integrationMetadataCreate)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsGetById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsGetByIdTest() {
        val id: kotlin.String = TODO()
        
        
        val response: ResponseEntity<IntegrationRecord> = api.integrationsGetById(id)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsGetList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsGetListTest() {
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<IntegrationsGetList200Response> = api.integrationsGetList(bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test IntegrationsApiController.integrationsLogsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun integrationsLogsPostTest() {
        val integrationLogsRequestCreate: IntegrationLogsRequestCreate = TODO()
        
        
        val response: ResponseEntity<IntegrationLogsSuccessResponse> = api.integrationsLogsPost(integrationLogsRequestCreate)

        // TODO: test validations
    }
}
