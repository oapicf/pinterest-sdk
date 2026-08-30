package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.Schedule
import org.openapitools.model.ScheduleBatchUpdate
import org.openapitools.model.ScheduleCreate
import org.openapitools.model.ScheduleStatus
import org.openapitools.model.ScheduleType
import org.openapitools.model.SchedulesCreate200ResponseInner
import org.openapitools.model.SchedulesList200Response

class SchedulesApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def schedulesCreate ( String adAccountId, List<ScheduleCreate> scheduleCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/schedules"

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
        if (scheduleCreate == null) {
            throw new RuntimeException("missing required params scheduleCreate")
        }



        contentType = 'application/json';
        bodyParams = scheduleCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    SchedulesCreate200ResponseInner.class )

    }

    def schedulesList ( String adAccountId, List<String> entityIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/schedules"

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
        if (entityIds == null) {
            throw new RuntimeException("missing required params entityIds")
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
        if (scheduleStatuses != null) {
            queryParams.put("schedule_statuses", scheduleStatuses)
        }
        if (scheduleType != null) {
            queryParams.put("schedule_type", scheduleType)
        }
        if (entityIds != null) {
            queryParams.put("entity_ids", entityIds)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SchedulesList200Response.class )

    }

    def schedulesUpdate ( String adAccountId, List<ScheduleBatchUpdate> scheduleBatchUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/schedules"

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
        if (scheduleBatchUpdate == null) {
            throw new RuntimeException("missing required params scheduleBatchUpdate")
        }



        contentType = 'application/json';
        bodyParams = scheduleBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "array",
                    SchedulesCreate200ResponseInner.class )

    }

}
