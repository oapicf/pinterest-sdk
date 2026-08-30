package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedCreateRequestSchema
import org.openapitools.server.api.model.CatalogsFeedIngestion
import org.openapitools.server.api.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.ItemsIssuesList200Response
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogFeedsApiAction @Inject constructor(
) : WebAction {

    @Get("/catalogs/feeds/{feed_id}/processing_results")
    @Description("List feed processing results")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedProcessingResultsList(
        @Pattern(regexp="^\\d+$") @PathParam("feed_id") feedId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): FeedProcessingResultsList200Response {
        TODO()
    }

    @Post("/catalogs/feeds")
    @Description("Create feed")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsCreate(
        @Valid @RequestBody catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsFeed {
        TODO()
    }

    @Delete("/catalogs/feeds/{feed_id}")
    @Description("Delete feed")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsDelete(
        @Pattern(regexp="^\\d+$") @PathParam("feed_id") feedId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsFeed {
        TODO()
    }

    @Get("/catalogs/feeds/{feed_id}")
    @Description("Get feed")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsGet(
        @Pattern(regexp="^\\d+$") @PathParam("feed_id") feedId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsFeed {
        TODO()
    }

    @Post("/catalogs/feeds/{feed_id}/ingest")
    @Description("Ingest feed items")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsIngest(
        @Pattern(regexp="^\\d+$") @PathParam("feed_id") feedId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsFeedIngestion {
        TODO()
    }

    @Get("/catalogs/feeds")
    @Description("List feeds")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsList(
         @QueryParam(value = "catalog_id") catalogId: kotlin.String?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): FeedsList200Response {
        TODO()
    }

    @Patch("/catalogs/feeds/{feed_id}")
    @Description("Update feed")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun feedsUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("feed_id") feedId: kotlin.String, 
        @Valid @RequestBody catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsFeed {
        TODO()
    }

    @Get("/catalogs/processing_results/{processing_result_id}/item_issues")
    @Description("List item issues")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemsIssuesList(
        @Pattern(regexp="^\\d+$") @PathParam("processing_result_id") processingResultId: kotlin.String, 
         @QueryParam(value = "item_numbers") itemNumbers: kotlin.collections.List<kotlin.Int>?, 
         @QueryParam(value = "item_validation_issue") itemValidationIssue: CatalogsItemValidationIssue?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): ItemsIssuesList200Response {
        TODO()
    }
}
