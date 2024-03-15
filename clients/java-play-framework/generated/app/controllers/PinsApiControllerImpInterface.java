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
public abstract class PinsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result pinsAnalyticsHttp(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Map<String, PinAnalyticsMetricsResponse> obj = pinsAnalytics(request, pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, PinAnalyticsMetricsResponse> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, PinAnalyticsMetricsResponse> pinsAnalytics(Http.Request request, String pinId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pinsCreateHttp(Http.Request request, PinCreate pinCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsCreate(request, pinCreate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsCreate(Http.Request request, PinCreate pinCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pinsDeleteHttp(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        pinsDelete(request, pinId, adAccountId);
        return ok();

    }

    public abstract void pinsDelete(Http.Request request, String pinId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pinsGetHttp(Http.Request request, String pinId, Boolean pinMetrics,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsGet(request, pinId, pinMetrics, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsGet(Http.Request request, String pinId, Boolean pinMetrics,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pinsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        PinsList200Response obj = pinsList(request, bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PinsList200Response pinsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception;

    public Result pinsSaveHttp(Http.Request request, String pinId, PinsSaveRequest pinsSaveRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsSave(request, pinId, pinsSaveRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsSave(Http.Request request, String pinId, PinsSaveRequest pinsSaveRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pinsUpdateHttp(Http.Request request, String pinId, PinUpdate pinUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Pin obj = pinsUpdate(request, pinId, pinUpdate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Pin pinsUpdate(Http.Request request, String pinId, PinUpdate pinUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
