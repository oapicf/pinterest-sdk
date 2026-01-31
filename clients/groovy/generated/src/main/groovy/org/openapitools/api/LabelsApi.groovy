package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.LabelCreateRequest
import org.openapitools.model.LabelUpdateRequest
import org.openapitools.model.LabelsList200Response
import org.openapitools.model.LabelsResponse

class LabelsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def labelsCreate ( String adAccountId, LabelCreateRequest labelCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

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
        if (labelCreateRequest == null) {
            throw new RuntimeException("missing required params labelCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = labelCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    LabelsResponse.class )

    }

    def labelsList ( String adAccountId, List<String> campaignIds, List<String> labelIds, List<String> entityStatuses, List<String> labelTypes, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (campaignIds != null) {
            queryParams.put("campaign_ids", campaignIds)
        }
        if (labelIds != null) {
            queryParams.put("label_ids", labelIds)
        }
        if (entityStatuses != null) {
            queryParams.put("entity_statuses", entityStatuses)
        }
        if (labelTypes != null) {
            queryParams.put("label_types", labelTypes)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    LabelsList200Response.class )

    }

    def labelsUpdate ( String adAccountId, LabelUpdateRequest labelUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

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
        if (labelUpdateRequest == null) {
            throw new RuntimeException("missing required params labelUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = labelUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    LabelsResponse.class )

    }

}
