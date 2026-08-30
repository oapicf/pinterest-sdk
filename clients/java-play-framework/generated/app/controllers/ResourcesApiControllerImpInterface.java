package controllers;

import apimodels.AdAccountCountriesGet200Response;
import apimodels.BookClosed;
import apimodels.DeliveryMetricsGet200Response;
import apimodels.PinterestLibError;
import apimodels.PublicTargetingType;
import apimodels.ReportType;
import apimodels.SingleInterestTargetingOption;

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
public abstract class ResourcesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adAccountCountriesGetHttp(Http.Request request) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdAccountCountriesGet200Response obj = adAccountCountriesGet(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdAccountCountriesGet200Response adAccountCountriesGet(Http.Request request) throws Exception;

    public Result deliveryMetricsGetHttp(Http.Request request, ReportType reportType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        DeliveryMetricsGet200Response obj = deliveryMetricsGet(request, reportType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeliveryMetricsGet200Response deliveryMetricsGet(Http.Request request, ReportType reportType) throws Exception;

    public Result interestTargetingOptionsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String interestId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SingleInterestTargetingOption obj = interestTargetingOptionsGet(request, interestId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SingleInterestTargetingOption interestTargetingOptionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String interestId) throws Exception;

    public Result leadFormQuestionsGetHttp(Http.Request request) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        leadFormQuestionsGet(request);
        return ok();

    }

    public abstract void leadFormQuestionsGet(Http.Request request) throws Exception;

    public Result metricsReadyStateGetHttp(Http.Request request, @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")String date) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BookClosed obj = metricsReadyStateGet(request, date);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BookClosed metricsReadyStateGet(Http.Request request, @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")String date) throws Exception;

    public Result targetingOptionsGetHttp(Http.Request request, PublicTargetingType targetingType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String clientId, String oauthSignature,  @Pattern(regexp="\\d+")String timestamp) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<Object> obj = targetingOptionsGet(request, targetingType, adAccountId, clientId, oauthSignature, timestamp);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Object> targetingOptionsGet(Http.Request request, PublicTargetingType targetingType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String clientId, String oauthSignature,  @Pattern(regexp="\\d+")String timestamp) throws Exception;

}
