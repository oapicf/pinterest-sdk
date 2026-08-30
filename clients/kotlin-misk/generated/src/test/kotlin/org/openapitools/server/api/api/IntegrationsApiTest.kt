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
import org.openapitools.server.api.model.IntegrationLogsInvalidLogResponse
import org.openapitools.server.api.model.IntegrationLogsRequestCreate
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse
import org.openapitools.server.api.model.IntegrationMetadata
import org.openapitools.server.api.model.IntegrationMetadataCreate
import org.openapitools.server.api.model.IntegrationMetadataUpdate
import org.openapitools.server.api.model.IntegrationRecord
import org.openapitools.server.api.model.IntegrationsGetList200Response
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class IntegrationsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var integrationsApi: IntegrationsApiAction

    /**
     * To test IntegrationsApiAction.integrationsCommerceDel
     */
    @Test
    fun `should handle integrationsCommerceDel`() {
        val externalBusinessId = TODO()
        val response: IntegrationMetadata = integrationsApi.integrationsCommerceDel(externalBusinessId)
    }

    /**
     * To test IntegrationsApiAction.integrationsCommerceGet
     */
    @Test
    fun `should handle integrationsCommerceGet`() {
        val externalBusinessId = TODO()
        val response: IntegrationMetadata = integrationsApi.integrationsCommerceGet(externalBusinessId)
    }

    /**
     * To test IntegrationsApiAction.integrationsCommercePatch
     */
    @Test
    fun `should handle integrationsCommercePatch`() {
        val externalBusinessId = TODO()
        val integrationMetadataUpdate = TODO()
        val response: IntegrationMetadata = integrationsApi.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)
    }

    /**
     * To test IntegrationsApiAction.integrationsCommercePost
     */
    @Test
    fun `should handle integrationsCommercePost`() {
        val integrationMetadataCreate = TODO()
        val response: IntegrationMetadata = integrationsApi.integrationsCommercePost(integrationMetadataCreate)
    }

    /**
     * To test IntegrationsApiAction.integrationsGetById
     */
    @Test
    fun `should handle integrationsGetById`() {
        val id = TODO()
        val response: IntegrationRecord = integrationsApi.integrationsGetById(id)
    }

    /**
     * To test IntegrationsApiAction.integrationsGetList
     */
    @Test
    fun `should handle integrationsGetList`() {
        val bookmark = TODO()
        val pageSize = TODO()
        val response: IntegrationsGetList200Response = integrationsApi.integrationsGetList(bookmark, pageSize)
    }

    /**
     * To test IntegrationsApiAction.integrationsLogsPost
     */
    @Test
    fun `should handle integrationsLogsPost`() {
        val integrationLogsRequestCreate = TODO()
        val response: IntegrationLogsSuccessResponse = integrationsApi.integrationsLogsPost(integrationLogsRequestCreate)
    }
}
