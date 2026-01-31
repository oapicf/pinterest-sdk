package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.Error
import org.openapitools.model.ItemsBatchPostRequest

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

}
