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
import org.openapitools.server.api.model.LeadForm
import org.openapitools.server.api.model.LeadFormBatchUpdate
import org.openapitools.server.api.model.LeadFormCreate
import org.openapitools.server.api.model.LeadFormTest
import org.openapitools.server.api.model.LeadFormTestCreate
import org.openapitools.server.api.model.LeadFormsCreate200Response
import org.openapitools.server.api.model.LeadFormsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class LeadFormsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var leadFormsApi: LeadFormsApiAction

    /**
     * To test LeadFormsApiAction.leadFormGet
     */
    @Test
    fun `should handle leadFormGet`() {
        val leadFormId = TODO()
        val adAccountId = TODO()
        val response: LeadForm = leadFormsApi.leadFormGet(leadFormId, adAccountId)
    }

    /**
     * To test LeadFormsApiAction.leadFormTestCreate
     */
    @Test
    fun `should handle leadFormTestCreate`() {
        val adAccountId = TODO()
        val leadFormId = TODO()
        val leadFormTestCreate = TODO()
        val response: LeadFormTest = leadFormsApi.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)
    }

    /**
     * To test LeadFormsApiAction.leadFormsCreate
     */
    @Test
    fun `should handle leadFormsCreate`() {
        val adAccountId = TODO()
        val leadFormCreate = TODO()
        val response: LeadFormsCreate200Response = leadFormsApi.leadFormsCreate(adAccountId, leadFormCreate)
    }

    /**
     * To test LeadFormsApiAction.leadFormsList
     */
    @Test
    fun `should handle leadFormsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: LeadFormsList200Response = leadFormsApi.leadFormsList(adAccountId, bookmark, pageSize, order)
    }

    /**
     * To test LeadFormsApiAction.leadFormsUpdate
     */
    @Test
    fun `should handle leadFormsUpdate`() {
        val adAccountId = TODO()
        val leadFormBatchUpdate = TODO()
        val response: LeadFormsCreate200Response = leadFormsApi.leadFormsUpdate(adAccountId, leadFormBatchUpdate)
    }
}
