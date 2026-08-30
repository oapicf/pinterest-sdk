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
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.api.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.server.api.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class CatalogProductGroupsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogProductGroupsApi: CatalogProductGroupsApiAction

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupPinsList
     */
    @Test
    fun `should handle catalogsProductGroupPinsList`() {
        val productGroupId = TODO()
        val adAccountId = TODO()
        val pinMetrics = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: CatalogsProductGroupPinsList200Response = catalogProductGroupsApi.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsCreate
     */
    @Test
    fun `should handle catalogsProductGroupsCreate`() {
        val catalogsProductGroupsCreateRequestSchema = TODO()
        val adAccountId = TODO()
        val response: CatalogsVerticalProductGroup = catalogProductGroupsApi.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsCreateMany
     */
    @Test
    fun `should handle catalogsProductGroupsCreateMany`() {
        val catalogsProductGroupsCreateManyRequestItems = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<kotlin.String> = catalogProductGroupsApi.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsDelete
     */
    @Test
    fun `should handle catalogsProductGroupsDelete`() {
        val productGroupId = TODO()
        val adAccountId = TODO()
        val response: CatalogsVerticalProductGroup = catalogProductGroupsApi.catalogsProductGroupsDelete(productGroupId, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsDeleteMany
     */
    @Test
    fun `should handle catalogsProductGroupsDeleteMany`() {
        val id = TODO()
        val adAccountId = TODO()
        val response = catalogProductGroupsApi.catalogsProductGroupsDeleteMany(id, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsGet
     */
    @Test
    fun `should handle catalogsProductGroupsGet`() {
        val productGroupId = TODO()
        val adAccountId = TODO()
        val response: CatalogsVerticalProductGroup = catalogProductGroupsApi.catalogsProductGroupsGet(productGroupId, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsList
     */
    @Test
    fun `should handle catalogsProductGroupsList`() {
        val id = TODO()
        val feedId = TODO()
        val catalogId = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: CatalogsProductGroupsList200Response = catalogProductGroupsApi.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsProductCountsGet
     */
    @Test
    fun `should handle catalogsProductGroupsProductCountsGet`() {
        val productGroupId = TODO()
        val adAccountId = TODO()
        val response: CatalogsProductGroupProductCountsVertical = catalogProductGroupsApi.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.catalogsProductGroupsUpdate
     */
    @Test
    fun `should handle catalogsProductGroupsUpdate`() {
        val productGroupId = TODO()
        val catalogsProductGroupsUpdateRequestSchema = TODO()
        val adAccountId = TODO()
        val response: CatalogsVerticalProductGroup = catalogProductGroupsApi.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)
    }

    /**
     * To test CatalogProductGroupsApiAction.productsByProductGroupFilterList
     */
    @Test
    fun `should handle productsByProductGroupFilterList`() {
        val catalogsListProductsByFilterRequest = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val adAccountId = TODO()
        val pinMetrics = TODO()
        val response: CatalogsProductGroupPinsList200Response = catalogProductGroupsApi.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)
    }
}
