package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.PinsList200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.SearchPartnerPins200Response

class SearchApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def searchPartnerPins ( String term, String countryCode, String bookmark, String locale, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/search/partner/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (term == null) {
            throw new RuntimeException("missing required params term")
        }
        // verify required params are set
        if (countryCode == null) {
            throw new RuntimeException("missing required params countryCode")
        }

        if (term != null) {
            queryParams.put("term", term)
        }
        if (countryCode != null) {
            queryParams.put("country_code", countryCode)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (locale != null) {
            queryParams.put("locale", locale)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SearchPartnerPins200Response.class )

    }

    def searchUserBoardsGet ( String adAccountId, String query, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/search/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (query != null) {
            queryParams.put("query", query)
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
                    BoardsList200Response.class )

    }

    def searchUserPinsList ( String query, String adAccountId, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/search/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (query == null) {
            throw new RuntimeException("missing required params query")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (query != null) {
            queryParams.put("query", query)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PinsList200Response.class )

    }

}
