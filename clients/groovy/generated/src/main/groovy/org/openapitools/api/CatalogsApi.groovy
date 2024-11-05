package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Catalog
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsCreateRequest
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsFilters
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsBatchPostRequest
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.MultipleProductGroupsInner
import org.openapitools.model.ReportsStats200Response

class CatalogsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsCreate ( CatalogsCreateRequest catalogsCreateRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsCreateRequest == null) {
            throw new RuntimeException("missing required params catalogsCreateRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Catalog.class )

    }

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

    def catalogsProductGroupPinsList ( String productGroupId, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, Closure onSuccess, Closure onFailure)  {
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
        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsProductGroupPinsList200Response.class )

    }

    def catalogsProductGroupsCreate ( MultipleProductGroupsInner multipleProductGroupsInner, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (multipleProductGroupsInner == null) {
            throw new RuntimeException("missing required params multipleProductGroupsInner")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = multipleProductGroupsInner


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsVerticalProductGroup.class )

    }

    def catalogsProductGroupsCreateMany ( List<MultipleProductGroupsInner> multipleProductGroupsInner, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/multiple"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (multipleProductGroupsInner == null) {
            throw new RuntimeException("missing required params multipleProductGroupsInner")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = multipleProductGroupsInner


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "array",
                    String.class )

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

    def catalogsProductGroupsDeleteMany ( List<Integer> id, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/multiple"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (id != null) {
            queryParams.put("id", id)
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
                    CatalogsVerticalProductGroup.class )

    }

    def catalogsProductGroupsList ( List<Integer> id, String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (id != null) {
            queryParams.put("id", id)
        }
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
                    CatalogsProductGroupProductCountsVertical.class )

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
                    CatalogsVerticalProductGroup.class )

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

    def itemsPost ( CatalogsItemsRequest catalogsItemsRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsItemsRequest == null) {
            throw new RuntimeException("missing required params catalogsItemsRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsItemsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsItems.class )

    }

    def productsByProductGroupFilterList ( CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, Closure onSuccess, Closure onFailure)  {
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
        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
        }


        contentType = 'application/json';
        bodyParams = catalogsListProductsByFilterRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsProductGroupPinsList200Response.class )

    }

    def reportsCreate ( CatalogsReportParameters catalogsReportParameters, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsReportParameters == null) {
            throw new RuntimeException("missing required params catalogsReportParameters")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsReportParameters


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsCreateReportResponse.class )

    }

    def reportsGet ( String token, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (token != null) {
            queryParams.put("token", token)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsReport.class )

    }

    def reportsStats ( CatalogsReportParameters parameters, String adAccountId, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports/stats"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (parameters == null) {
            throw new RuntimeException("missing required params parameters")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (parameters != null) {
            queryParams.put("parameters", parameters)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ReportsStats200Response.class )

    }

}
