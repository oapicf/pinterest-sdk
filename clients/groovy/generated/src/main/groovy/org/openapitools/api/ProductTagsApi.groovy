package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductTagsBulkAddRequest
import org.openapitools.model.ProductTagsBulkDeleteRequest
import org.openapitools.model.ProductTagsError
import org.openapitools.model.ProductTagsResponse

class ProductTagsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def productTagsBulkAdd ( String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}/product_tags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }
        // verify required params are set
        if (productTagsBulkAddRequest == null) {
            throw new RuntimeException("missing required params productTagsBulkAddRequest")
        }



        contentType = 'application/json';
        bodyParams = productTagsBulkAddRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductTagsResponse.class )

    }

    def productTagsBulkDelete ( String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}/product_tags/bulk-delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }
        // verify required params are set
        if (productTagsBulkDeleteRequest == null) {
            throw new RuntimeException("missing required params productTagsBulkDeleteRequest")
        }



        contentType = 'application/json';
        bodyParams = productTagsBulkDeleteRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def productTagsList ( String pinId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}/product_tags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductTagsResponse.class )

    }

}
