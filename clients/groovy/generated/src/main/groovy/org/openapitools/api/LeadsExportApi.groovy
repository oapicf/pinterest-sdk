package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LeadsExportResponseData
import org.openapitools.model.LeadsExports
import org.openapitools.model.LeadsExportsCreate
import org.openapitools.model.PinterestLibError

class LeadsExportApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def leadsExportCreate ( String adAccountId, LeadsExportsCreate leadsExportsCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads_export"

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
        if (leadsExportsCreate == null) {
            throw new RuntimeException("missing required params leadsExportsCreate")
        }



        contentType = 'application/json';
        bodyParams = leadsExportsCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LeadsExports.class )

    }

    def leadsExportGet ( String adAccountId, String leadsExportId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads_export/${leads_export_id}"

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
        if (leadsExportId == null) {
            throw new RuntimeException("missing required params leadsExportId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    LeadsExportResponseData.class )

    }

}
