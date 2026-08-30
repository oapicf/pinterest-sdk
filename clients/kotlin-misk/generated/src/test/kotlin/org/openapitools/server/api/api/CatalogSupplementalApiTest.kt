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
import org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresList200Response
import org.openapitools.server.api.model.LocalInventoryItemsBatch
import org.openapitools.server.api.model.LocalInventoryItemsBatchCreate
import org.openapitools.server.api.model.LocalInventoryItemsGet
import org.openapitools.server.api.model.LocalInventoryItemsGetCreate
import org.openapitools.server.api.model.LocalStore
import org.openapitools.server.api.model.LocalStoreBatchUpdate
import org.openapitools.server.api.model.LocalStoreCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SupplementalItemsBatchResponse

@MiskTest(startService = true)
internal class CatalogSupplementalApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogSupplementalApi: CatalogSupplementalApiAction

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalInventoryItemsBatchOperate
     */
    @Test
    fun `should handle catalogsLocalInventoryItemsBatchOperate`() {
        val catalogId = TODO()
        val localInventoryItemsBatchCreate = TODO()
        val adAccountId = TODO()
        val response: SupplementalItemsBatchResponse = catalogSupplementalApi.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalInventoryItemsPost
     */
    @Test
    fun `should handle catalogsLocalInventoryItemsPost`() {
        val catalogId = TODO()
        val localInventoryItemsGetCreate = TODO()
        val adAccountId = TODO()
        val response: LocalInventoryItemsGet = catalogSupplementalApi.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalStoresCreate
     */
    @Test
    fun `should handle catalogsLocalStoresCreate`() {
        val catalogId = TODO()
        val localStoreCreate = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> = catalogSupplementalApi.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalStoresDelete
     */
    @Test
    fun `should handle catalogsLocalStoresDelete`() {
        val catalogId = TODO()
        val ids = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<CatalogsLocalStoresDelete200ResponseInner> = catalogSupplementalApi.catalogsLocalStoresDelete(catalogId, ids, adAccountId)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalStoresList
     */
    @Test
    fun `should handle catalogsLocalStoresList`() {
        val catalogId = TODO()
        val ids = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: CatalogsLocalStoresList200Response = catalogSupplementalApi.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsLocalStoresUpdate
     */
    @Test
    fun `should handle catalogsLocalStoresUpdate`() {
        val catalogId = TODO()
        val localStoreBatchUpdate = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<CatalogsLocalStoresCreate200ResponseInner> = catalogSupplementalApi.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)
    }

    /**
     * To test CatalogSupplementalApiAction.catalogsSupplementalItemsBatchGet
     */
    @Test
    fun `should handle catalogsSupplementalItemsBatchGet`() {
        val catalogId = TODO()
        val batchId = TODO()
        val adAccountId = TODO()
        val response: SupplementalItemsBatchResponse = catalogSupplementalApi.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)
    }
}
