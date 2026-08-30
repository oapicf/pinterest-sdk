package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.PinterestLibError

class CatalogProductGroupsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsProductGroupPinsList ( String productGroupId, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}/products"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
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
                    CatalogsProductGroupPinsList200Response.class )

    }

    def catalogsProductGroupsCreate ( CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogsProductGroupsCreateRequestSchema == null) {
            throw new RuntimeException("missing required params catalogsProductGroupsCreateRequestSchema")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsProductGroupsCreateRequestSchema


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CatalogsVerticalProductGroup.class )

    }

    def catalogsProductGroupsCreateMany ( List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/multiple"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogsProductGroupsCreateManyRequestItems == null) {
            throw new RuntimeException("missing required params catalogsProductGroupsCreateManyRequestItems")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsProductGroupsCreateManyRequestItems


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    String.class )

    }

    def catalogsProductGroupsDelete ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    CatalogsVerticalProductGroup.class )

    }

    def catalogsProductGroupsDeleteMany ( List<Integer> id, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/multiple"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def catalogsProductGroupsGet ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CatalogsVerticalProductGroup.class )

    }

    def catalogsProductGroupsList ( List<Integer> id, String feedId, String catalogId, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
                    CatalogsProductGroupsList200Response.class )

    }

    def catalogsProductGroupsProductCountsGet ( String productGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}/product_counts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CatalogsProductGroupProductCountsVertical.class )

    }

    def catalogsProductGroupsUpdate ( String productGroupId, CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/product_groups/${product_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productGroupId == null) {
            throw new RuntimeException("missing required params productGroupId")
        }
        // verify required params are set
        if (catalogsProductGroupsUpdateRequestSchema == null) {
            throw new RuntimeException("missing required params catalogsProductGroupsUpdateRequestSchema")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsProductGroupsUpdateRequestSchema


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    CatalogsVerticalProductGroup.class )

    }

    def productsByProductGroupFilterList ( CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/products/get_by_product_group_filters"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CatalogsProductGroupPinsList200Response.class )

    }

}
