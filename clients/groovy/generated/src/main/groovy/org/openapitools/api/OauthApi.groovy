package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionAccessToken
import org.openapitools.model.OauthAccessToken
import org.openapitools.model.PinterestLibError
import org.openapitools.model.TokenGrantType
import org.openapitools.model.TokenTypeHint

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
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ConversionAccessToken.class )

    }

    def oauthToken ( TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/oauth/token"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (grantType == null) {
            throw new RuntimeException("missing required params grantType")
        }




        contentType = 'application/x-www-form-urlencoded';
        bodyParams = [:]
        bodyParams.put("code", code)
        bodyParams.put("continuous_refresh", continuousRefresh)
        bodyParams.put("grant_type", grantType)
        bodyParams.put("redirect_uri", redirectUri)
        bodyParams.put("refresh_token", refreshToken)
        bodyParams.put("scope", scope)

        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    OauthAccessToken.class )

    }

    def tokenRevoke ( String token, TokenTypeHint tokenTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/oauth/token/revoke"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }




        contentType = 'application/x-www-form-urlencoded';
        bodyParams = [:]
        bodyParams.put("token", token)
        bodyParams.put("token_type_hint", tokenTypeHint)

        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

}
