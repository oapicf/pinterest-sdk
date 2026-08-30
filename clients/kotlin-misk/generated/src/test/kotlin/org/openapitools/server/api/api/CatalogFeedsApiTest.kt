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
import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedCreateRequestSchema
import org.openapitools.server.api.model.CatalogsFeedIngestion
import org.openapitools.server.api.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.ItemsIssuesList200Response
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class CatalogFeedsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogFeedsApi: CatalogFeedsApiAction

    /**
     * To test CatalogFeedsApiAction.feedProcessingResultsList
     */
    @Test
    fun `should handle feedProcessingResultsList`() {
        val feedId = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: FeedProcessingResultsList200Response = catalogFeedsApi.feedProcessingResultsList(feedId, adAccountId, bookmark, pageSize)
    }

    /**
     * To test CatalogFeedsApiAction.feedsCreate
     */
    @Test
    fun `should handle feedsCreate`() {
        val catalogsFeedCreateRequestSchema = TODO()
        val adAccountId = TODO()
        val response: CatalogsFeed = catalogFeedsApi.feedsCreate(catalogsFeedCreateRequestSchema, adAccountId)
    }

    /**
     * To test CatalogFeedsApiAction.feedsDelete
     */
    @Test
    fun `should handle feedsDelete`() {
        val feedId = TODO()
        val adAccountId = TODO()
        val response: CatalogsFeed = catalogFeedsApi.feedsDelete(feedId, adAccountId)
    }

    /**
     * To test CatalogFeedsApiAction.feedsGet
     */
    @Test
    fun `should handle feedsGet`() {
        val feedId = TODO()
        val adAccountId = TODO()
        val response: CatalogsFeed = catalogFeedsApi.feedsGet(feedId, adAccountId)
    }

    /**
     * To test CatalogFeedsApiAction.feedsIngest
     */
    @Test
    fun `should handle feedsIngest`() {
        val feedId = TODO()
        val adAccountId = TODO()
        val response: CatalogsFeedIngestion = catalogFeedsApi.feedsIngest(feedId, adAccountId)
    }

    /**
     * To test CatalogFeedsApiAction.feedsList
     */
    @Test
    fun `should handle feedsList`() {
        val catalogId = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: FeedsList200Response = catalogFeedsApi.feedsList(catalogId, adAccountId, bookmark, pageSize)
    }

    /**
     * To test CatalogFeedsApiAction.feedsUpdate
     */
    @Test
    fun `should handle feedsUpdate`() {
        val feedId = TODO()
        val catalogsFeedUpdateRequestSchema = TODO()
        val adAccountId = TODO()
        val response: CatalogsFeed = catalogFeedsApi.feedsUpdate(feedId, catalogsFeedUpdateRequestSchema, adAccountId)
    }

    /**
     * To test CatalogFeedsApiAction.itemsIssuesList
     */
    @Test
    fun `should handle itemsIssuesList`() {
        val processingResultId = TODO()
        val itemNumbers = TODO()
        val itemValidationIssue = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: ItemsIssuesList200Response = catalogFeedsApi.itemsIssuesList(processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize)
    }
}
