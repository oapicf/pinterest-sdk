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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class SchedulesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result schedulesCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleCreate> scheduleCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<SchedulesCreate200ResponseInner> obj = schedulesCreate(request, adAccountId, scheduleCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (SchedulesCreate200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<SchedulesCreate200ResponseInner> schedulesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleCreate> scheduleCreate) throws Exception;

    public Result schedulesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1)List<@Pattern(regexp = "^\\d+$")String> entityIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SchedulesList200Response obj = schedulesList(request, adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SchedulesList200Response schedulesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1)List<@Pattern(regexp = "^\\d+$")String> entityIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType) throws Exception;

    public Result schedulesUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<SchedulesCreate200ResponseInner> obj = schedulesUpdate(request, adAccountId, scheduleBatchUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (SchedulesCreate200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<SchedulesCreate200ResponseInner> schedulesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate) throws Exception;

}
