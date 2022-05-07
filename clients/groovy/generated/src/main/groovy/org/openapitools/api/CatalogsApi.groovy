package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedsCreateRequest
import org.openapitools.model.CatalogsFeedsUpdateRequest
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchRequest
import org.openapitools.model.CatalogsProductGroup
import org.openapitools.model.CatalogsProductGroupCreateRequest
import org.openapitools.model.CatalogsProductGroupUpdateRequest
import org.openapitools.model.Error
import org.openapitools.model.Paginated

class CatalogsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsProductGroupsCreate ( CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsProductGroupCreateRequest == null) {
            throw new RuntimeException("missing required params catalogsProductGroupCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = catalogsProductGroupCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Object.class )

    }

    def catalogsProductGroupsDelete ( String productGroupId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def catalogsProductGroupsList ( String feedId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (feedId != null) {
            queryParams.put("feed_id", feedId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def catalogsProductGroupsUpdate ( String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest, Closure onSuccess, Closure onFailure)  {
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
        if (catalogsProductGroupUpdateRequest == null) {
            throw new RuntimeException("missing required params catalogsProductGroupUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = catalogsProductGroupUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CatalogsProductGroup.class )

    }

    def feedProcessingResultsList ( String feedId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def feedsCreate ( CatalogsFeedsCreateRequest catalogsFeedsCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsFeedsCreateRequest == null) {
            throw new RuntimeException("missing required params catalogsFeedsCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = catalogsFeedsCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsFeed.class )

    }

    def feedsDelete ( String feedId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def feedsGet ( String feedId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsFeed.class )

    }

    def feedsList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def feedsUpdate ( String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest, Closure onSuccess, Closure onFailure)  {
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
        if (catalogsFeedsUpdateRequest == null) {
            throw new RuntimeException("missing required params catalogsFeedsUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = catalogsFeedsUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CatalogsFeed.class )

    }

    def itemsBatchGet ( String batchId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsItemsBatch.class )

    }

    def itemsBatchPost ( CatalogsItemsBatchRequest catalogsItemsBatchRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsItemsBatchRequest == null) {
            throw new RuntimeException("missing required params catalogsItemsBatchRequest")
        }



        contentType = 'application/json';
        bodyParams = catalogsItemsBatchRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsItemsBatch.class )

    }

    def itemsGet ( String country, List<String> itemIds, String language, Closure onSuccess, Closure onFailure)  {
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
        if (itemIds == null) {
            throw new RuntimeException("missing required params itemIds")
        }
        // verify required params are set
        if (language == null) {
            throw new RuntimeException("missing required params language")
        }

        if (country != null) {
            queryParams.put("country", country)
        }
        if (itemIds != null) {
            queryParams.put("item_ids", itemIds)
        }
        if (language != null) {
            queryParams.put("language", language)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsItems.class )

    }

}
