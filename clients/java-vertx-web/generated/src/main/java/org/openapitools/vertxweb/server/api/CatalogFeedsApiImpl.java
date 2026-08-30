package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestion;
import org.openapitools.vertxweb.server.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationIssue;
import org.openapitools.vertxweb.server.model.FeedProcessingResultsList200Response;
import org.openapitools.vertxweb.server.model.FeedsList200Response;
import org.openapitools.vertxweb.server.model.ItemsIssuesList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogFeedsApiImpl implements CatalogFeedsApi {
    public Future<ApiResponse<FeedProcessingResultsList200Response>> feedProcessingResultsList(String feedId, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsCreate(CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsDelete(String feedId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsGet(String feedId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeedIngestion>> feedsIngest(String feedId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FeedsList200Response>> feedsList(String catalogId, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsFeed>> feedsUpdate(String feedId, CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemsIssuesList200Response>> itemsIssuesList(String processingResultId, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
