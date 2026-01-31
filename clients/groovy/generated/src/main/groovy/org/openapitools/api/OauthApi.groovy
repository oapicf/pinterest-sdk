package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionAccessTokenResponse
import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse

class OauthApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def oauthConversionToken ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/oauth/conversion_token"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ConversionAccessTokenResponse.class )

    }

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

    def tokenRevoke ( String token, String tokenTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/oauth/token/revoke"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }




        contentType = 'application/x-www-form-urlencoded';
        bodyParams = [:]
        bodyParams.put("token", token)
        bodyParams.put("token_type_hint", tokenTypeHint)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
