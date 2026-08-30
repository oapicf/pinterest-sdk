package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.model.CatalogsLocalStoresList200Response
import org.openapitools.model.LocalInventoryItemsBatch
import org.openapitools.model.LocalInventoryItemsBatchCreate
import org.openapitools.model.LocalInventoryItemsGet
import org.openapitools.model.LocalInventoryItemsGetCreate
import org.openapitools.model.LocalStore
import org.openapitools.model.LocalStoreBatchUpdate
import org.openapitools.model.LocalStoreCreate
import org.openapitools.model.PinterestLibError
import org.openapitools.model.SupplementalItemsBatchResponse

class CatalogSupplementalApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsLocalInventoryItemsBatchOperate ( String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_inventory_items/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
        // verify required params are set
        if (localInventoryItemsBatchCreate == null) {
            throw new RuntimeException("missing required params localInventoryItemsBatchCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = localInventoryItemsBatchCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SupplementalItemsBatchResponse.class )

    }

    def catalogsLocalInventoryItemsPost ( String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_inventory_items/query"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
        // verify required params are set
        if (localInventoryItemsGetCreate == null) {
            throw new RuntimeException("missing required params localInventoryItemsGetCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = localInventoryItemsGetCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LocalInventoryItemsGet.class )

    }

    def catalogsLocalStoresCreate ( String catalogId, List<LocalStoreCreate> localStoreCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
        // verify required params are set
        if (localStoreCreate == null) {
            throw new RuntimeException("missing required params localStoreCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = localStoreCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    CatalogsLocalStoresCreate200ResponseInner.class )

    }

    def catalogsLocalStoresDelete ( String catalogId, List<String> ids, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "array",
                    CatalogsLocalStoresDelete200ResponseInner.class )

    }

    def catalogsLocalStoresList ( String catalogId, List<String> ids, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
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
                    CatalogsLocalStoresList200Response.class )

    }

    def catalogsLocalStoresUpdate ( String catalogId, List<LocalStoreBatchUpdate> localStoreBatchUpdate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/local_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
        // verify required params are set
        if (localStoreBatchUpdate == null) {
            throw new RuntimeException("missing required params localStoreBatchUpdate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = localStoreBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "array",
                    CatalogsLocalStoresCreate200ResponseInner.class )

    }

    def catalogsSupplementalItemsBatchGet ( String catalogId, String batchId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/${catalog_id}/supplemental_items/batch/${batch_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogId == null) {
            throw new RuntimeException("missing required params catalogId")
        }
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
                    SupplementalItemsBatchResponse.class )

    }

}
