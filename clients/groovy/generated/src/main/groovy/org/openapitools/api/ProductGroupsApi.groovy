package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response
import org.openapitools.model.Error

class ProductGroupsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountsCatalogsProductGroupsList ( String adAccountId, String feedProfileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_groups/catalogs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (feedProfileId != null) {
            queryParams.put("feed_profile_id", feedProfileId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccountsCatalogsProductGroupsList200Response.class )

    }

}
