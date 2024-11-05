package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.LeadsExportCreateRequest
import org.openapitools.model.LeadsExportCreateResponse
import org.openapitools.model.LeadsExportResponseData

class LeadsExportApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def leadsExportCreate ( String adAccountId, LeadsExportCreateRequest leadsExportCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads_export"

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
        if (leadsExportCreateRequest == null) {
            throw new RuntimeException("missing required params leadsExportCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = leadsExportCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    LeadsExportCreateResponse.class )

    }

    def leadsExportGet ( String adAccountId, String leadsExportId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads_export/${leads_export_id}"

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
        if (leadsExportId == null) {
            throw new RuntimeException("missing required params leadsExportId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    LeadsExportResponseData.class )

    }

}
