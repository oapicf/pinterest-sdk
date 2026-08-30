@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class CatalogSupplementalApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation catalogsLocalInventoryItemsBatchOperate.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalInventoryItemsBatchOperateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalInventoryItemsBatchOperate(catalogId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalInventoryItemsBatchOperateStubBuilder =
        CatalogsLocalInventoryItemsBatchOperateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/{catalog_id}/local_inventory_items/batch"))
            .withPathParam("catalog_id", catalogId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsLocalInventoryItemsPost.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalInventoryItemsPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalInventoryItemsPost(catalogId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalInventoryItemsPostStubBuilder =
        CatalogsLocalInventoryItemsPostStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/{catalog_id}/local_inventory_items/query"))
            .withPathParam("catalog_id", catalogId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsLocalStoresCreate.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalStoresCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalStoresCreate(catalogId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalStoresCreateStubBuilder =
        CatalogsLocalStoresCreateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/{catalog_id}/local_stores"))
            .withPathParam("catalog_id", catalogId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsLocalStoresDelete.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param ids query parameter ids pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalStoresDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalStoresDelete(catalogId: StringValuePattern, ids: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalStoresDeleteStubBuilder =
        CatalogsLocalStoresDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/catalogs/{catalog_id}/local_stores"))
            .withPathParam("catalog_id", catalogId)
            .apply { ids?.let { withQueryParam("ids", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsLocalStoresList.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param ids query parameter ids pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalStoresListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalStoresList(catalogId: StringValuePattern, ids: StringValuePattern? = null, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalStoresListStubBuilder =
        CatalogsLocalStoresListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/{catalog_id}/local_stores"))
            .withPathParam("catalog_id", catalogId)
            .apply { ids?.let { withQueryParam("ids", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsLocalStoresUpdate.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsLocalStoresUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsLocalStoresUpdate(catalogId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsLocalStoresUpdateStubBuilder =
        CatalogsLocalStoresUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/catalogs/{catalog_id}/local_stores"))
            .withPathParam("catalog_id", catalogId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsSupplementalItemsBatchGet.
     *
     * @param catalogId path parameter catalogId pattern.
     * @param batchId path parameter batchId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsSupplementalItemsBatchGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsSupplementalItemsBatchGet(catalogId: StringValuePattern, batchId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsSupplementalItemsBatchGetStubBuilder =
        CatalogsSupplementalItemsBatchGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}"))
            .withPathParam("catalog_id", catalogId)
            .withPathParam("batch_id", batchId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
