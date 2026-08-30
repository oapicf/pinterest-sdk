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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesApiControllerImp extends SchedulesApiControllerImpInterface {
    @Override
    public List<SchedulesCreate200ResponseInner> schedulesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleCreate> scheduleCreate) throws Exception {
        //Do your magic!!!
        return new ArrayList<SchedulesCreate200ResponseInner>();
    }

    @Override
    public SchedulesList200Response schedulesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Size(min=1)List<@Pattern(regexp = "^\\d+$")String> entityIds, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType) throws Exception {
        //Do your magic!!!
        return new SchedulesList200Response();
    }

    @Override
    public List<SchedulesCreate200ResponseInner> schedulesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate) throws Exception {
        //Do your magic!!!
        return new ArrayList<SchedulesCreate200ResponseInner>();
    }

}
