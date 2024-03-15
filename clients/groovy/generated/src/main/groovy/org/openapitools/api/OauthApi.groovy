package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse

class OauthApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def oauthToken ( String grantType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/oauth/token"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (grantType == null) {
            throw new RuntimeException("missing required params grantType")
        }




        contentType = 'application/x-www-form-urlencoded';
        bodyParams = grantType

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    OauthAccessTokenResponse.class )

    }

}
