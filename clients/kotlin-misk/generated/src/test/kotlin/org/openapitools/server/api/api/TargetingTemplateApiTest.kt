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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.TargetingTemplate
import org.openapitools.server.api.model.TargetingTemplateCreate
import org.openapitools.server.api.model.TargetingTemplateList200Response
import org.openapitools.server.api.model.TargetingTemplateUpdateRequestReadOrUpdate

@MiskTest(startService = true)
internal class TargetingTemplateApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var targetingTemplateApi: TargetingTemplateApiAction

    /**
     * To test TargetingTemplateApiAction.targetingTemplateCreate
     */
    @Test
    fun `should handle targetingTemplateCreate`() {
        val adAccountId = TODO()
        val targetingTemplateCreate = TODO()
        val response: TargetingTemplate = targetingTemplateApi.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
    }

    /**
     * To test TargetingTemplateApiAction.targetingTemplateList
     */
    @Test
    fun `should handle targetingTemplateList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val includeSizing = TODO()
        val searchQuery = TODO()
        val response: TargetingTemplateList200Response = targetingTemplateApi.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
    }

    /**
     * To test TargetingTemplateApiAction.targetingTemplateUpdate
     */
    @Test
    fun `should handle targetingTemplateUpdate`() {
        val adAccountId = TODO()
        val targetingTemplateUpdateRequestReadOrUpdate = TODO()
        val response = targetingTemplateApi.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)
    }
}
