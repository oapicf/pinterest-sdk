package controllers;

import apimodels.CreativeType;
import apimodels.Error;
import java.time.LocalDate;
import java.util.Map;
import apimodels.Pin;
import apimodels.PinAnalyticsMetricsResponse;
import apimodels.PinCreate;
import apimodels.PinUpdate;
import apimodels.PinsList200Response;
import apimodels.PinsSaveRequest;
import apimodels.PinterestLibError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PinsApiControllerImp extends PinsApiControllerImpInterface {
    @Override
    public Map<String, Map<String> multiPinsAnalytics(Http.Request request, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> metricTypes, String appTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, Map<String>();
    }

    @Override
    public Map<String, PinAnalyticsMetricsResponse> pinsAnalytics(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, PinAnalyticsMetricsResponse>();
    }

    @Override
    public Pin pinsCreate(Http.Request request, PinCreate pinCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public void pinsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Pin pinsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public PinsList200Response pinsList(Http.Request request, String pinFilter, Boolean pinMetrics, Boolean includeProtectedPins, String pinType, List<CreativeType> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new PinsList200Response();
    }

    @Override
    public Pin pinsSave(Http.Request request, String pinId, PinsSaveRequest pinsSaveRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public Pin pinsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId, PinUpdate pinUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

}
