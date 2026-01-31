package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestion;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationIssue;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.FeedProcessingResultsList200Response;
import org.openapitools.vertxweb.server.model.FeedsCreateRequest;
import org.openapitools.vertxweb.server.model.FeedsList200Response;
import org.openapitools.vertxweb.server.model.FeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.ItemsIssuesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogFeedsApi  {
    Future<ApiResponse<FeedProcessingResultsList200Response>> feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, String adAccountId);
    Future<ApiResponse<CatalogsFeed>> feedsCreate(FeedsCreateRequest feedsCreateRequest, String adAccountId);
    Future<ApiResponse<Void>> feedsDelete(String feedId, String adAccountId);
    Future<ApiResponse<CatalogsFeed>> feedsGet(String feedId, String adAccountId);
    Future<ApiResponse<CatalogsFeedIngestion>> feedsIngest(String feedId, String adAccountId);
    Future<ApiResponse<FeedsList200Response>> feedsList(String bookmark, Integer pageSize, String catalogId, String adAccountId);
    Future<ApiResponse<CatalogsFeed>> feedsUpdate(String feedId, FeedsUpdateRequest feedsUpdateRequest, String adAccountId);
    Future<ApiResponse<ItemsIssuesList200Response>> itemsIssuesList(String processingResultId, String bookmark, Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId);
}
