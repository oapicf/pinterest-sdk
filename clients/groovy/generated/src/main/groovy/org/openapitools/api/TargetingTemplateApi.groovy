package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.TargetingTemplate
import org.openapitools.model.TargetingTemplateCreate
import org.openapitools.model.TargetingTemplateList200Response
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate

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
        def accept
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


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    TargetingTemplate.class )

    }

    def targetingTemplateList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TargetingTemplateList200Response.class )

    }

    def targetingTemplateUpdate ( String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (targetingTemplateUpdateRequestReadOrUpdate == null) {
            throw new RuntimeException("missing required params targetingTemplateUpdateRequestReadOrUpdate")
        }



        contentType = 'application/json';
        bodyParams = targetingTemplateUpdateRequestReadOrUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    null )

    }

}
