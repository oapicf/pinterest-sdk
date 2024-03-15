package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DetailedError
import org.openapitools.model.Error
import org.openapitools.model.IntegrationLogsRequest
import org.openapitools.model.IntegrationLogsSuccessResponse
import org.openapitools.model.IntegrationMetadata
import org.openapitools.model.IntegrationRecord
import org.openapitools.model.IntegrationRequest
import org.openapitools.model.IntegrationRequestPatch
import org.openapitools.model.IntegrationsGetList200Response

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
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def integrationsCommerceGet ( String externalBusinessId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce/${external_business_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    IntegrationMetadata.class )

    }

    def integrationsCommercePatch ( String externalBusinessId, IntegrationRequestPatch integrationRequestPatch, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce/${external_business_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (externalBusinessId == null) {
            throw new RuntimeException("missing required params externalBusinessId")
        }



        contentType = 'application/json';
        bodyParams = integrationRequestPatch


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    IntegrationMetadata.class )

    }

    def integrationsCommercePost ( IntegrationRequest integrationRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/commerce"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType




        contentType = 'application/json';
        bodyParams = integrationRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    IntegrationMetadata.class )

    }

    def integrationsGetById ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    IntegrationRecord.class )

    }

    def integrationsGetList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations"

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
                    IntegrationsGetList200Response.class )

    }

    def integrationsLogsPost ( IntegrationLogsRequest integrationLogsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/integrations/logs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (integrationLogsRequest == null) {
            throw new RuntimeException("missing required params integrationLogsRequest")
        }



        contentType = 'application/json';
        bodyParams = integrationLogsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    IntegrationLogsSuccessResponse.class )

    }

}
