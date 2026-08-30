package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Schedule
import org.openapitools.server.api.model.ScheduleBatchUpdate
import org.openapitools.server.api.model.ScheduleCreate
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import org.openapitools.server.api.model.SchedulesCreate200ResponseInner
import org.openapitools.server.api.model.SchedulesList200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class SchedulesApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/schedules")
    @Description("Create schedules")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun schedulesCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody scheduleCreate: kotlin.collections.List<ScheduleCreate>
    ): kotlin.collections.List<SchedulesCreate200ResponseInner> {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/schedules")
    @Description("Get Schedules")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun schedulesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "entity_ids") entityIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "schedule_statuses") scheduleStatuses: kotlin.collections.List<ScheduleStatus>?, 
         @QueryParam(value = "schedule_type") scheduleType: ScheduleType?
    ): SchedulesList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/schedules")
    @Description("Update schedules")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun schedulesUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody scheduleBatchUpdate: kotlin.collections.List<ScheduleBatchUpdate>
    ): kotlin.collections.List<SchedulesCreate200ResponseInner> {
        TODO()
    }
}
