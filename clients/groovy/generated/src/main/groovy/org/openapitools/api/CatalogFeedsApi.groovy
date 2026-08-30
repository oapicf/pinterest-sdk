package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedCreateRequestSchema
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.PinterestLibError

class CatalogFeedsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def feedProcessingResultsList ( String feedId, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}/processing_results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FeedProcessingResultsList200Response.class )

    }

    def feedsCreate ( CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogsFeedCreateRequestSchema == null) {
            throw new RuntimeException("missing required params catalogsFeedCreateRequestSchema")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsFeedCreateRequestSchema


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CatalogsFeed.class )

    }

    def feedsDelete ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    CatalogsFeed.class )

    }

    def feedsGet ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CatalogsFeed.class )

    }

    def feedsIngest ( String feedId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}/ingest"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CatalogsFeedIngestion.class )

    }

    def feedsList ( String catalogId, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (catalogId != null) {
            queryParams.put("catalog_id", catalogId)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FeedsList200Response.class )

    }

    def feedsUpdate ( String feedId, CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds/${feed_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }
        // verify required params are set
        if (catalogsFeedUpdateRequestSchema == null) {
            throw new RuntimeException("missing required params catalogsFeedUpdateRequestSchema")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsFeedUpdateRequestSchema


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    CatalogsFeed.class )

    }

    def itemsIssuesList ( String processingResultId, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/processing_results/${processing_result_id}/item_issues"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (processingResultId == null) {
            throw new RuntimeException("missing required params processingResultId")
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
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ItemsIssuesList200Response.class )

    }

}
