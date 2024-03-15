package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsFilters
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCounts
import org.openapitools.model.CatalogsProductGroupsCreate201Response
import org.openapitools.model.CatalogsProductGroupsCreateRequest
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsBatchPostRequest
import org.openapitools.model.ItemsIssuesList200Response

class CatalogsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsList ( String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs"

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
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsList200Response.class )

    }

    def catalogsProductGroupPinsList ( String productGroupId, String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}/products"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
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
                    CatalogsProductGroupPinsList200Response.class )

    }

    def catalogsProductGroupsCreate ( CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsProductGroupsCreateRequest == null) {
            throw new RuntimeException("missing required params catalogsProductGroupsCreateRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsProductGroupsCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsProductGroupsCreate201Response.class )

    }

    def catalogsProductGroupsDelete ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def catalogsProductGroupsGet ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsProductGroupsCreate201Response.class )

    }

    def catalogsProductGroupsList ( String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (feedId != null) {
            queryParams.put("feed_id", feedId)
        }
        if (catalogId != null) {
            queryParams.put("catalog_id", catalogId)
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
                    CatalogsProductGroupsList200Response.class )

    }

    def catalogsProductGroupsProductCountsGet ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}/product_counts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsProductGroupProductCounts.class )

    }

    def catalogsProductGroupsUpdate ( String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }
        // verify required params are set
        if (catalogsProductGroupsUpdateRequest == null) {
            throw new RuntimeException("missing required params catalogsProductGroupsUpdateRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsProductGroupsUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CatalogsProductGroupsCreate201Response.class )

    }

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

    def itemsBatchGet ( String batchId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items/batch/${batch_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsItemsBatch.class )

    }

    def itemsBatchPost ( ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (itemsBatchPostRequest == null) {
            throw new RuntimeException("missing required params itemsBatchPostRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = itemsBatchPostRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsItemsBatch.class )

    }

    def itemsGet ( String country, String language, String adAccountId, List<String> itemIds, CatalogsItemsFilters filters, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (country == null) {
            throw new RuntimeException("missing required params country")
        }
        // verify required params are set
        if (language == null) {
            throw new RuntimeException("missing required params language")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (country != null) {
            queryParams.put("country", country)
        }
        if (language != null) {
            queryParams.put("language", language)
        }
        if (itemIds != null) {
            queryParams.put("item_ids", itemIds)
        }
        if (filters != null) {
            queryParams.put("filters", filters)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsItems.class )

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

    def productsByProductGroupFilterList ( CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/products/get_by_product_group_filters"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsListProductsByFilterRequest == null) {
            throw new RuntimeException("missing required params catalogsListProductsByFilterRequest")
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


        contentType = 'application/json';
        bodyParams = catalogsListProductsByFilterRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsProductGroupPinsList200Response.class )

    }

}
