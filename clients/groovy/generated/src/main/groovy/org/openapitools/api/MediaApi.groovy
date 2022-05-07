package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadDetails
import org.openapitools.model.MediaUploadRequest
import org.openapitools.model.Paginated

class MediaApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def mediaCreate ( MediaUploadRequest mediaUploadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/media"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (mediaUploadRequest == null) {
            throw new RuntimeException("missing required params mediaUploadRequest")
        }



        contentType = 'application/json';
        bodyParams = mediaUploadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    MediaUpload.class )

    }

    def mediaGet ( String mediaId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/media/${media_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (mediaId == null) {
            throw new RuntimeException("missing required params mediaId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MediaUploadDetails.class )

    }

    def mediaList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/media"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

}
