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
import org.openapitools.server.api.model.CatalogsCreateReportResponse
import org.openapitools.server.api.model.CatalogsReport
import org.openapitools.server.api.model.CatalogsReportParameters
import org.openapitools.server.api.model.CatalogsReportStatsParameters
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ReportsStats200Response

@MiskTest(startService = true)
internal class CatalogReportsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogReportsApi: CatalogReportsApiAction

    /**
     * To test CatalogReportsApiAction.reportsCreate
     */
    @Test
    fun `should handle reportsCreate`() {
        val catalogsReportParameters = TODO()
        val adAccountId = TODO()
        val response: CatalogsCreateReportResponse = catalogReportsApi.reportsCreate(catalogsReportParameters, adAccountId)
    }

    /**
     * To test CatalogReportsApiAction.reportsGet
     */
    @Test
    fun `should handle reportsGet`() {
        val token = TODO()
        val adAccountId = TODO()
        val response: CatalogsReport = catalogReportsApi.reportsGet(token, adAccountId)
    }

    /**
     * To test CatalogReportsApiAction.reportsStats
     */
    @Test
    fun `should handle reportsStats`() {
        val parameters = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: ReportsStats200Response = catalogReportsApi.reportsStats(parameters, adAccountId, bookmark, pageSize)
    }
}
