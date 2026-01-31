package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsIssuesList200Response

class CatalogFeedsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def feedProcessingResultsList ( String feedId, String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}/processing_results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    FeedProcessingResultsList200Response.class )

    }

    def feedsCreate ( FeedsCreateRequest feedsCreateRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedsCreateRequest == null) {
            throw new RuntimeException("missing required params feedsCreateRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = feedsCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsFeed.class )

    }

    def feedsDelete ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def feedsGet ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsFeed.class )

    }

    def feedsIngest ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}/ingest"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsFeedIngestion.class )

    }

    def feedsList ( String bookmark, Integer pageSize, String catalogId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (catalogId != null) {
            queryParams.put("catalog_id", catalogId)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    FeedsList200Response.class )

    }

    def feedsUpdate ( String feedId, FeedsUpdateRequest feedsUpdateRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }
        // verify required params are set
        if (feedsUpdateRequest == null) {
            throw new RuntimeException("missing required params feedsUpdateRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = feedsUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CatalogsFeed.class )

    }

    def itemsIssuesList ( String processingResultId, String bookmark, Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/processing_results/${processing_result_id}/item_issues"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (processingResultId == null) {
            throw new RuntimeException("missing required params processingResultId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (itemNumbers != null) {
            queryParams.put("item_numbers", itemNumbers)
        }
        if (itemValidationIssue != null) {
            queryParams.put("item_validation_issue", itemValidationIssue)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ItemsIssuesList200Response.class )

    }

}
