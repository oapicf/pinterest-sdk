package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Media
import org.openapitools.model.MediaList200Response
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadCreate
import org.openapitools.model.PinterestLibError

class MediaApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def mediaCreate ( MediaUploadCreate mediaUploadCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/media"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (mediaUploadCreate == null) {
            throw new RuntimeException("missing required params mediaUploadCreate")
        }



        contentType = 'application/json';
        bodyParams = mediaUploadCreate


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
                    Media.class )

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
                    MediaList200Response.class )

    }

}
