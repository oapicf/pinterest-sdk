package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.IntegrationLogsInvalidLogResponse
import org.openapitools.model.IntegrationLogsRequestCreate
import org.openapitools.model.IntegrationLogsSuccessResponse
import org.openapitools.model.IntegrationMetadata
import org.openapitools.model.IntegrationMetadataCreate
import org.openapitools.model.IntegrationMetadataUpdate
import org.openapitools.model.IntegrationRecord
import org.openapitools.model.IntegrationsGetList200Response
import org.openapitools.model.PinterestLibError

class IntegrationsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def integrationsCommerceDel ( String externalBusinessId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce/${external_business_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    IntegrationMetadata.class )

    }

    def integrationsCommerceGet ( String externalBusinessId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce/${external_business_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    IntegrationMetadata.class )

    }

    def integrationsCommercePatch ( String externalBusinessId, IntegrationMetadataUpdate integrationMetadataUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce/${external_business_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }
        // verify required params are set
        if (integrationMetadataUpdate == null) {
            throw new RuntimeException("missing required params integrationMetadataUpdate")
        }



        contentType = 'application/json';
        bodyParams = integrationMetadataUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    IntegrationMetadata.class )

    }

    def integrationsCommercePost ( IntegrationMetadataCreate integrationMetadataCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (integrationMetadataCreate == null) {
            throw new RuntimeException("missing required params integrationMetadataCreate")
        }



        contentType = 'application/json';
        bodyParams = integrationMetadataCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    IntegrationMetadata.class )

    }

    def integrationsGetById ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    IntegrationRecord.class )

    }

    def integrationsGetList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    IntegrationsGetList200Response.class )

    }

    def integrationsLogsPost ( IntegrationLogsRequestCreate integrationLogsRequestCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/logs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (integrationLogsRequestCreate == null) {
            throw new RuntimeException("missing required params integrationLogsRequestCreate")
        }



        contentType = 'application/json';
        bodyParams = integrationLogsRequestCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    IntegrationLogsSuccessResponse.class )

    }

}
