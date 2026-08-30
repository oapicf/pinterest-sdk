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
open class CatalogProductGroupsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation catalogsProductGroupPinsList.
     *
     * @param productGroupId path parameter productGroupId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param pinMetrics query parameter pinMetrics pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupPinsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupPinsList(productGroupId: StringValuePattern, adAccountId: StringValuePattern? = null, pinMetrics: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupPinsListStubBuilder =
        CatalogsProductGroupPinsListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/product_groups/{product_group_id}/products"))
            .withPathParam("product_group_id", productGroupId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { pinMetrics?.let { withQueryParam("pin_metrics", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsCreateStubBuilder =
        CatalogsProductGroupsCreateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/product_groups"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsCreateMany.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsCreateManyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsCreateMany(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsCreateManyStubBuilder =
        CatalogsProductGroupsCreateManyStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/product_groups/multiple"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsDelete.
     *
     * @param productGroupId path parameter productGroupId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsDelete(productGroupId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsDeleteStubBuilder =
        CatalogsProductGroupsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/catalogs/product_groups/{product_group_id}"))
            .withPathParam("product_group_id", productGroupId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsDeleteMany.
     *
     * @param id query parameter id pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsDeleteManyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsDeleteMany(id: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsDeleteManyStubBuilder =
        CatalogsProductGroupsDeleteManyStubBuilder(objectMapper, delete(urlPathTemplate("/catalogs/product_groups/multiple"))
            .apply { id?.let { withQueryParam("id", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsGet.
     *
     * @param productGroupId path parameter productGroupId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsGet(productGroupId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsGetStubBuilder =
        CatalogsProductGroupsGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/product_groups/{product_group_id}"))
            .withPathParam("product_group_id", productGroupId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsList.
     *
     * @param id query parameter id pattern.
     * @param feedId query parameter feedId pattern.
     * @param catalogId query parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsList(id: StringValuePattern? = null, feedId: StringValuePattern? = null, catalogId: StringValuePattern? = null, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsListStubBuilder =
        CatalogsProductGroupsListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/product_groups"))
            .apply { id?.let { withQueryParam("id", it) } }
            .apply { feedId?.let { withQueryParam("feed_id", it) } }
            .apply { catalogId?.let { withQueryParam("catalog_id", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsProductCountsGet.
     *
     * @param productGroupId path parameter productGroupId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsProductCountsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsProductCountsGet(productGroupId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsProductCountsGetStubBuilder =
        CatalogsProductGroupsProductCountsGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/product_groups/{product_group_id}/product_counts"))
            .withPathParam("product_group_id", productGroupId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsProductGroupsUpdate.
     *
     * @param productGroupId path parameter productGroupId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsProductGroupsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsProductGroupsUpdate(productGroupId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsProductGroupsUpdateStubBuilder =
        CatalogsProductGroupsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/catalogs/product_groups/{product_group_id}"))
            .withPathParam("product_group_id", productGroupId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation productsByProductGroupFilterList.
     *
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param pinMetrics query parameter pinMetrics pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductsByProductGroupFilterListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productsByProductGroupFilterList(bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, adAccountId: StringValuePattern? = null, pinMetrics: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductsByProductGroupFilterListStubBuilder =
        ProductsByProductGroupFilterListStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/products/get_by_product_group_filters"))
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { pinMetrics?.let { withQueryParam("pin_metrics", it) } }
            .configurer()
        )
}
