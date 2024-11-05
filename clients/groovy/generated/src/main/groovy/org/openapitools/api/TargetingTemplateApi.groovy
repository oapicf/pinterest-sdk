package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.TargetingTemplateCreate
import org.openapitools.model.TargetingTemplateGetResponseData
import org.openapitools.model.TargetingTemplateList200Response
import org.openapitools.model.TargetingTemplateUpdateRequest

class TargetingTemplateApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def targetingTemplateCreate ( String adAccountId, TargetingTemplateCreate targetingTemplateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (targetingTemplateCreate == null) {
            throw new RuntimeException("missing required params targetingTemplateCreate")
        }



        contentType = 'application/json';
        bodyParams = targetingTemplateCreate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    TargetingTemplateGetResponseData.class )

    }

    def targetingTemplateList ( String adAccountId, String order, Boolean includeSizing, String searchQuery, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (order != null) {
            queryParams.put("order", order)
        }
        if (includeSizing != null) {
            queryParams.put("include_sizing", includeSizing)
        }
        if (searchQuery != null) {
            queryParams.put("search_query", searchQuery)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TargetingTemplateList200Response.class )

    }

    def targetingTemplateUpdate ( String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (targetingTemplateUpdateRequest == null) {
            throw new RuntimeException("missing required params targetingTemplateUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = targetingTemplateUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    null )

    }

}
