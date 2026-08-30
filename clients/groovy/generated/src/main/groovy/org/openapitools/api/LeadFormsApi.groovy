package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LeadForm
import org.openapitools.model.LeadFormBatchUpdate
import org.openapitools.model.LeadFormCreate
import org.openapitools.model.LeadFormTest
import org.openapitools.model.LeadFormTestCreate
import org.openapitools.model.LeadFormsCreate200Response
import org.openapitools.model.LeadFormsList200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder

class LeadFormsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def leadFormGet ( String leadFormId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (leadFormId == null) {
            throw new RuntimeException("missing required params leadFormId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    LeadForm.class )

    }

    def leadFormTestCreate ( String adAccountId, String leadFormId, LeadFormTestCreate leadFormTestCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}/test"

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
        if (leadFormId == null) {
            throw new RuntimeException("missing required params leadFormId")
        }
        // verify required params are set
        if (leadFormTestCreate == null) {
            throw new RuntimeException("missing required params leadFormTestCreate")
        }



        contentType = 'application/json';
        bodyParams = leadFormTestCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LeadFormTest.class )

    }

    def leadFormsCreate ( String adAccountId, List<LeadFormCreate> leadFormCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms"

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
        if (leadFormCreate == null) {
            throw new RuntimeException("missing required params leadFormCreate")
        }



        contentType = 'application/json';
        bodyParams = leadFormCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LeadFormsCreate200Response.class )

    }

    def leadFormsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    LeadFormsList200Response.class )

    }

    def leadFormsUpdate ( String adAccountId, List<LeadFormBatchUpdate> leadFormBatchUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/lead_forms"

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
        if (leadFormBatchUpdate == null) {
            throw new RuntimeException("missing required params leadFormBatchUpdate")
        }



        contentType = 'application/json';
        bodyParams = leadFormBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    LeadFormsCreate200Response.class )

    }

}
