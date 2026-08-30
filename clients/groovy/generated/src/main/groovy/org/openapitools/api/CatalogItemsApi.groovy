package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchPostRequest
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.ItemsPost200Response
import org.openapitools.model.PinterestLibError

class CatalogItemsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def itemsBatchGet ( String batchId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items/batch/${batch_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CatalogsItemsBatch.class )

    }

    def itemsBatchPost ( CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogsItemsBatchPostRequest == null) {
            throw new RuntimeException("missing required params catalogsItemsBatchPostRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsItemsBatchPostRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CatalogsItemsBatch.class )

    }

    def itemsPost ( CatalogsItemsRequest catalogsItemsRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ItemsPost200Response.class )

    }

}
