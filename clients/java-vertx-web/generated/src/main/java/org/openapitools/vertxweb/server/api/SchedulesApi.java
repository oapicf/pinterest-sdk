package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.Schedule;
import org.openapitools.vertxweb.server.model.ScheduleBatchUpdate;
import org.openapitools.vertxweb.server.model.ScheduleCreate;
import org.openapitools.vertxweb.server.model.ScheduleStatus;
import org.openapitools.vertxweb.server.model.ScheduleType;
import org.openapitools.vertxweb.server.model.SchedulesCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.SchedulesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface SchedulesApi  {
    Future<ApiResponse<List<SchedulesCreate200ResponseInner>>> schedulesCreate(String adAccountId, List<ScheduleCreate> scheduleCreate);
    Future<ApiResponse<SchedulesList200Response>> schedulesList(String adAccountId, List<String> entityIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType);
    Future<ApiResponse<List<SchedulesCreate200ResponseInner>>> schedulesUpdate(String adAccountId, List<ScheduleBatchUpdate> scheduleBatchUpdate);
}
