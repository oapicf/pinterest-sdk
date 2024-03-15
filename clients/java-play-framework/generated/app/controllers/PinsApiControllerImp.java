package controllers;

import apimodels.Error;
import java.time.LocalDate;
import java.util.Map;
import apimodels.Pin;
import apimodels.PinAnalyticsMetricsResponse;
import apimodels.PinCreate;
import apimodels.PinUpdate;
import apimodels.PinsAnalyticsMetricTypesParameterInner;
import apimodels.PinsList200Response;
import apimodels.PinsSaveRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinsApiControllerImp extends PinsApiControllerImpInterface {
    @Override
    public Map<String, PinAnalyticsMetricsResponse> pinsAnalytics(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, PinAnalyticsMetricsResponse>();
    }

    @Override
    public Pin pinsCreate(Http.Request request, PinCreate pinCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public void pinsDelete(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Pin pinsGet(Http.Request request, String pinId, Boolean pinMetrics,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public PinsList200Response pinsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new PinsList200Response();
    }

    @Override
    public Pin pinsSave(Http.Request request, String pinId, PinsSaveRequest pinsSaveRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public Pin pinsUpdate(Http.Request request, String pinId, PinUpdate pinUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

}
