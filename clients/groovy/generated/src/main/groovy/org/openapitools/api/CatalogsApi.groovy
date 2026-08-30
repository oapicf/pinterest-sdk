package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Catalog
import org.openapitools.model.CatalogCreate
import org.openapitools.model.CatalogsAvailableFilterValues
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.Country
import org.openapitools.model.PinterestLibError

class CatalogsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def catalogsAvailableFilterValues ( String catalogId, String feedId, Country country, CatalogsLocale language, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/available_filter_values"

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

        if (catalogId != null) {
            queryParams.put("catalog_id", catalogId)
        }
        if (feedId != null) {
            queryParams.put("feed_id", feedId)
        }
        if (country != null) {
            queryParams.put("country", country)
        }
        if (language != null) {
            queryParams.put("language", language)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CatalogsAvailableFilterValues.class )

    }

    def catalogsCreate ( CatalogCreate catalogCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (catalogCreate == null) {
            throw new RuntimeException("missing required params catalogCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Catalog.class )

    }

    def catalogsList ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


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
                    CatalogsList200Response.class )

    }

}
