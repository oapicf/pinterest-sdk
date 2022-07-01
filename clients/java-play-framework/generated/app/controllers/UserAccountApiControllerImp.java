package controllers;

import apimodels.Account;
import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
public class UserAccountApiControllerImp extends UserAccountApiControllerImpInterface {
    @Override
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, AnalyticsMetricsResponse>();
    }

    @Override
    public Account userAccountGet(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        //Do your magic!!!
        return new Account();
    }

}
