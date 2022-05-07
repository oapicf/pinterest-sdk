package controllers;

import apimodels.AnalyticsMetricsResponse;
import apimodels.Error;
import java.time.LocalDate;
import apimodels.Pin;

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
public abstract class PinsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result pinsAnalyticsHttp(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Map<String, AnalyticsMetricsResponse> obj = pinsAnalytics(request, pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, AnalyticsMetricsResponse> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, AnalyticsMetricsResponse> pinsAnalytics(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<String> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception;

    public Result pinsCreateHttp(Http.Request request, Pin pin) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsCreate(request, pin);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsCreate(Http.Request request, Pin pin) throws Exception;

    public Result pinsDeleteHttp(Http.Request request, String pinId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        pinsDelete(request, pinId);
        return ok();

    }

    public abstract void pinsDelete(Http.Request request, String pinId) throws Exception;

    public Result pinsGetHttp(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsGet(request, pinId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsGet(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$")String adAccountId) throws Exception;

}
