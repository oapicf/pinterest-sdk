package controllers;

import apimodels.Account;
import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;

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

@SuppressWarnings("RedundantThrows")
public abstract class UserAccountApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result userAccountAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Map<String, AnalyticsMetricsResponse> obj = userAccountAnalytics(request, startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, AnalyticsMetricsResponse> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, AnalyticsMetricsResponse> userAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception;

    public Result userAccountGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Account obj = userAccountGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Account userAccountGet(Http.Request request,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception;

}
