package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.LeadFormResponse
import org.openapitools.model.LeadFormTestRequest
import org.openapitools.model.LeadFormTestResponse
import org.openapitools.model.LeadFormsList200Response

class LeadFormsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def leadFormGet ( String adAccountId, String leadFormId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}"

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
        if (leadFormId == null) {
            throw new RuntimeException("missing required params leadFormId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    LeadFormResponse.class )

    }

    def leadFormTestCreate ( String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}/test"

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
        if (leadFormId == null) {
            throw new RuntimeException("missing required params leadFormId")
        }
        // verify required params are set
        if (leadFormTestRequest == null) {
            throw new RuntimeException("missing required params leadFormTestRequest")
        }



        contentType = 'application/json';
        bodyParams = leadFormTestRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    LeadFormTestResponse.class )

    }

    def leadFormsList ( String adAccountId, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    LeadFormsList200Response.class )

    }

}
