package controllers;

import apimodels.ConversionEventResponse;
import apimodels.ConversionTagCreate;
import apimodels.ConversionTagListResponse;
import apimodels.ConversionTagResponse;
import apimodels.Error;
import java.util.Map;
import apimodels.PageVisitConversionTagsGet200Response;

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
public abstract class ConversionTagsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result conversionTagsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionTagCreate conversionTagCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionTagResponse obj = conversionTagsCreate(request, adAccountId, conversionTagCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionTagResponse conversionTagsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionTagCreate conversionTagCreate) throws Exception;

    public Result conversionTagsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String conversionTagId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionTagResponse obj = conversionTagsGet(request, adAccountId, conversionTagId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionTagResponse conversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String conversionTagId) throws Exception;

    public Result conversionTagsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean filterDeleted) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionTagListResponse obj = conversionTagsList(request, adAccountId, filterDeleted);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionTagListResponse conversionTagsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean filterDeleted) throws Exception;

    public Result ocpmEligibleConversionTagsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Map<String, List<ConversionEventResponse>> obj = ocpmEligibleConversionTagsGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, List<ConversionEventResponse>> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result pageVisitConversionTagsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        PageVisitConversionTagsGet200Response obj = pageVisitConversionTagsGet(request, adAccountId, pageSize, order, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception;

}
