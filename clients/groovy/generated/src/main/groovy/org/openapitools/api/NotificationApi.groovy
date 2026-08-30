package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.NotificationPostRequest
import org.openapitools.model.NotificationResponse
import org.openapitools.model.PinterestLibError

class NotificationApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def notificationPost ( NotificationPostRequest notificationPostRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/notifications"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (notificationPostRequest == null) {
            throw new RuntimeException("missing required params notificationPostRequest")
        }



        contentType = 'application/json';
        bodyParams = notificationPostRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    NotificationResponse.class )

    }

}
