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
open class CatalogFeedsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation feedProcessingResultsList.
     *
     * @param feedId path parameter feedId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedProcessingResultsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedProcessingResultsList(feedId: StringValuePattern, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedProcessingResultsListStubBuilder =
        FeedProcessingResultsListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/feeds/{feed_id}/processing_results"))
            .withPathParam("feed_id", feedId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsCreateStubBuilder =
        FeedsCreateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/feeds"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsDelete.
     *
     * @param feedId path parameter feedId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsDelete(feedId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsDeleteStubBuilder =
        FeedsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/catalogs/feeds/{feed_id}"))
            .withPathParam("feed_id", feedId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsGet.
     *
     * @param feedId path parameter feedId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsGet(feedId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsGetStubBuilder =
        FeedsGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/feeds/{feed_id}"))
            .withPathParam("feed_id", feedId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsIngest.
     *
     * @param feedId path parameter feedId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsIngestStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsIngest(feedId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsIngestStubBuilder =
        FeedsIngestStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/feeds/{feed_id}/ingest"))
            .withPathParam("feed_id", feedId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsList.
     *
     * @param catalogId query parameter catalogId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsList(catalogId: StringValuePattern? = null, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsListStubBuilder =
        FeedsListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/feeds"))
            .apply { catalogId?.let { withQueryParam("catalog_id", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation feedsUpdate.
     *
     * @param feedId path parameter feedId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FeedsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun feedsUpdate(feedId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FeedsUpdateStubBuilder =
        FeedsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/catalogs/feeds/{feed_id}"))
            .withPathParam("feed_id", feedId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemsIssuesList.
     *
     * @param processingResultId path parameter processingResultId pattern.
     * @param itemNumbers query parameter itemNumbers pattern.
     * @param itemValidationIssue query parameter itemValidationIssue pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemsIssuesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemsIssuesList(processingResultId: StringValuePattern, itemNumbers: StringValuePattern? = null, itemValidationIssue: StringValuePattern? = null, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemsIssuesListStubBuilder =
        ItemsIssuesListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/processing_results/{processing_result_id}/item_issues"))
            .withPathParam("processing_result_id", processingResultId)
            .apply { itemNumbers?.let { withQueryParam("item_numbers", it) } }
            .apply { itemValidationIssue?.let { withQueryParam("item_validation_issue", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )
}
