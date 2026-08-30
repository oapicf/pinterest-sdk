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
import org.openapitools.server.api.model.LabelCreateRequest
import org.openapitools.server.api.model.LabelUpdateRequest
import org.openapitools.server.api.model.LabeledEntities
import org.openapitools.server.api.model.LabeledEntitiesCreate
import org.openapitools.server.api.model.LabelsList200Response
import org.openapitools.server.api.model.LabelsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.QueryLabelEntityStatusesItems
import org.openapitools.server.api.model.QueryLabelTypesItems

@MiskTest(startService = true)
internal class LabelsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var labelsApi: LabelsApiAction

    /**
     * To test LabelsApiAction.labelsApply
     */
    @Test
    fun `should handle labelsApply`() {
        val adAccountId = TODO()
        val labelId = TODO()
        val labeledEntitiesCreate = TODO()
        val response: LabeledEntities = labelsApi.labelsApply(adAccountId, labelId, labeledEntitiesCreate)
    }

    /**
     * To test LabelsApiAction.labelsCreate
     */
    @Test
    fun `should handle labelsCreate`() {
        val adAccountId = TODO()
        val labelCreateRequest = TODO()
        val response: LabelsResponse = labelsApi.labelsCreate(adAccountId, labelCreateRequest)
    }

    /**
     * To test LabelsApiAction.labelsList
     */
    @Test
    fun `should handle labelsList`() {
        val adAccountId = TODO()
        val campaignIds = TODO()
        val labelIds = TODO()
        val entityStatuses = TODO()
        val labelTypes = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: LabelsList200Response = labelsApi.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)
    }

    /**
     * To test LabelsApiAction.labelsRemove
     */
    @Test
    fun `should handle labelsRemove`() {
        val adAccountId = TODO()
        val labelId = TODO()
        val labeledEntitiesCreate = TODO()
        val response: LabeledEntities = labelsApi.labelsRemove(adAccountId, labelId, labeledEntitiesCreate)
    }

    /**
     * To test LabelsApiAction.labelsUpdate
     */
    @Test
    fun `should handle labelsUpdate`() {
        val adAccountId = TODO()
        val labelUpdateRequest = TODO()
        val response: LabelsResponse = labelsApi.labelsUpdate(adAccountId, labelUpdateRequest)
    }
}
