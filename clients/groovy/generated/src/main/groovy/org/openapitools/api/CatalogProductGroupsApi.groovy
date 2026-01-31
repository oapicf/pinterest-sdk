package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Error
import org.openapitools.model.MultipleProductGroupsInner

class CatalogProductGroupsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

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

}
