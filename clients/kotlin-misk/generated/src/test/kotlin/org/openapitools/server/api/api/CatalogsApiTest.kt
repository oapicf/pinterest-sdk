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
import org.openapitools.server.api.model.Catalog
import org.openapitools.server.api.model.CatalogCreate
import org.openapitools.server.api.model.CatalogsAvailableFilterValues
import org.openapitools.server.api.model.CatalogsList200Response
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class CatalogsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogsApi: CatalogsApiAction

    /**
     * To test CatalogsApiAction.catalogsAvailableFilterValues
     */
    @Test
    fun `should handle catalogsAvailableFilterValues`() {
        val catalogId = TODO()
        val feedId = TODO()
        val country = TODO()
        val language = TODO()
        val adAccountId = TODO()
        val response: CatalogsAvailableFilterValues = catalogsApi.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId)
    }

    /**
     * To test CatalogsApiAction.catalogsCreate
     */
    @Test
    fun `should handle catalogsCreate`() {
        val catalogCreate = TODO()
        val adAccountId = TODO()
        val response: Catalog = catalogsApi.catalogsCreate(catalogCreate, adAccountId)
    }

    /**
     * To test CatalogsApiAction.catalogsList
     */
    @Test
    fun `should handle catalogsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: CatalogsList200Response = catalogsApi.catalogsList(adAccountId, bookmark, pageSize)
    }
}
