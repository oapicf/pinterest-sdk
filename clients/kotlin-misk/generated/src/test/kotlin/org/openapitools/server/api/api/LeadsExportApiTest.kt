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
import org.openapitools.server.api.model.LeadsExportResponseData
import org.openapitools.server.api.model.LeadsExports
import org.openapitools.server.api.model.LeadsExportsCreate
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class LeadsExportApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var leadsExportApi: LeadsExportApiAction

    /**
     * To test LeadsExportApiAction.leadsExportCreate
     */
    @Test
    fun `should handle leadsExportCreate`() {
        val adAccountId = TODO()
        val leadsExportsCreate = TODO()
        val response: LeadsExports = leadsExportApi.leadsExportCreate(adAccountId, leadsExportsCreate)
    }

    /**
     * To test LeadsExportApiAction.leadsExportGet
     */
    @Test
    fun `should handle leadsExportGet`() {
        val adAccountId = TODO()
        val leadsExportId = TODO()
        val response: LeadsExportResponseData = leadsExportApi.leadsExportGet(adAccountId, leadsExportId)
    }
}
