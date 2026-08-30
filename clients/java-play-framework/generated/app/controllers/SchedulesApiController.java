package controllers;

import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.Schedule;
import apimodels.ScheduleBatchUpdate;
import apimodels.ScheduleCreate;
import apimodels.ScheduleStatus;
import apimodels.ScheduleType;
import apimodels.SchedulesCreate200ResponseInner;
import apimodels.SchedulesList200Response;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesApiController extends Controller {
    private final SchedulesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private SchedulesApiController(Config configuration, SchedulesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result schedulesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodescheduleCreate = request.body().asJson();
        List<@Valid ScheduleCreate> scheduleCreate;
        if (nodescheduleCreate != null) {
            scheduleCreate = mapper.readValue(nodescheduleCreate.toString(), new TypeReference<List<@Valid ScheduleCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (ScheduleCreate curItem : scheduleCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'ScheduleCreate' parameter is required");
        }
        return imp.schedulesCreateHttp(request, adAccountId, scheduleCreate);
    }

    @ApiAction
    public Result schedulesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueorder = request.getQueryString("order");
        PinterestLibPaginationOrder order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String[] scheduleStatusesArray = request.queryString().get("schedule_statuses");
        List<String> scheduleStatusesList = OpenAPIUtils.parametersToList("multi", scheduleStatusesArray);
        List<ScheduleStatus> scheduleStatuses = new ArrayList<>();
        for (String curParam : scheduleStatusesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                scheduleStatuses.add(curParam);
            }
        }
        String valuescheduleType = request.getQueryString("schedule_type");
        ScheduleType scheduleType;
        if (valuescheduleType != null) {
            scheduleType = valuescheduleType;
        } else {
            scheduleType = null;
        }
        String[] entityIdsArray = request.queryString().get("entity_ids");
        if (entityIdsArray == null) {
            throw new IllegalArgumentException("'entity_ids' parameter is required");
        }
        List<String> entityIdsList = OpenAPIUtils.parametersToList("multi", entityIdsArray);
        List<@Pattern(regexp = "^\\d+$")String> entityIds = new ArrayList<>();
        for (String curParam : entityIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                entityIds.add(curParam);
            }
        }
        return imp.schedulesListHttp(request, adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType);
    }

    @ApiAction
    public Result schedulesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodescheduleBatchUpdate = request.body().asJson();
        List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate;
        if (nodescheduleBatchUpdate != null) {
            scheduleBatchUpdate = mapper.readValue(nodescheduleBatchUpdate.toString(), new TypeReference<List<@Valid ScheduleBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (ScheduleBatchUpdate curItem : scheduleBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'ScheduleBatchUpdate' parameter is required");
        }
        return imp.schedulesUpdateHttp(request, adAccountId, scheduleBatchUpdate);
    }

}
