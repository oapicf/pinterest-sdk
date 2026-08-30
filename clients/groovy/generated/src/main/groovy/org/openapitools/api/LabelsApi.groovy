package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LabelCreateRequest
import org.openapitools.model.LabelUpdateRequest
import org.openapitools.model.LabeledEntities
import org.openapitools.model.LabeledEntitiesCreate
import org.openapitools.model.LabelsList200Response
import org.openapitools.model.LabelsResponse
import org.openapitools.model.PinterestLibError
import org.openapitools.model.QueryLabelEntityStatusesItems
import org.openapitools.model.QueryLabelTypesItems

class LabelsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def labelsApply ( String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels/${label_id}/apply"

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
        if (labelId == null) {
            throw new RuntimeException("missing required params labelId")
        }
        // verify required params are set
        if (labeledEntitiesCreate == null) {
            throw new RuntimeException("missing required params labeledEntitiesCreate")
        }



        contentType = 'application/json';
        bodyParams = labeledEntitiesCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LabeledEntities.class )

    }

    def labelsCreate ( String adAccountId, LabelCreateRequest labelCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

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
        if (labelCreateRequest == null) {
            throw new RuntimeException("missing required params labelCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = labelCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LabelsResponse.class )

    }

    def labelsList ( String adAccountId, List<String> campaignIds, List<String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

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
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    LabelsList200Response.class )

    }

    def labelsRemove ( String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels/${label_id}/remove"

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
        if (labelId == null) {
            throw new RuntimeException("missing required params labelId")
        }
        // verify required params are set
        if (labeledEntitiesCreate == null) {
            throw new RuntimeException("missing required params labeledEntitiesCreate")
        }



        contentType = 'application/json';
        bodyParams = labeledEntitiesCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    LabeledEntities.class )

    }

    def labelsUpdate ( String adAccountId, LabelUpdateRequest labelUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/labels"

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
        if (labelUpdateRequest == null) {
            throw new RuntimeException("missing required params labelUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = labelUpdateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    LabelsResponse.class )

    }

}
