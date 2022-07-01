package controllers;

import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;
import apimodels.Pin;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
public class PinsApiControllerImp extends PinsApiControllerImpInterface {
    @Override
    public Map<String, AnalyticsMetricsResponse> pinsAnalytics(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, AnalyticsMetricsResponse>();
    }

    @Override
    public Pin pinsCreate(Http.Request request, Pin pin) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

    @Override
    public void pinsDelete(Http.Request request, String pinId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Pin pinsGet(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        //Do your magic!!!
        return new Pin();
    }

}
