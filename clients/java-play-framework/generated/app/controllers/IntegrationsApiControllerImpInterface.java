package controllers;

import apimodels.DetailedError;
import apimodels.Error;
import apimodels.IntegrationLogsRequest;
import apimodels.IntegrationLogsSuccessResponse;
import apimodels.IntegrationMetadata;
import apimodels.IntegrationRecord;
import apimodels.IntegrationRequest;
import apimodels.IntegrationRequestPatch;
import apimodels.IntegrationsGetList200Response;

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
public abstract class IntegrationsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result integrationsCommerceDelHttp(Http.Request request, String externalBusinessId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        integrationsCommerceDel(request, externalBusinessId);
        return ok();

    }

    public abstract void integrationsCommerceDel(Http.Request request, String externalBusinessId) throws Exception;

    public Result integrationsCommerceGetHttp(Http.Request request, String externalBusinessId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationMetadata obj = integrationsCommerceGet(request, externalBusinessId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationMetadata integrationsCommerceGet(Http.Request request, String externalBusinessId) throws Exception;

    public Result integrationsCommercePatchHttp(Http.Request request, String externalBusinessId, IntegrationRequestPatch integrationRequestPatch) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationMetadata obj = integrationsCommercePatch(request, externalBusinessId, integrationRequestPatch);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationMetadata integrationsCommercePatch(Http.Request request, String externalBusinessId, IntegrationRequestPatch integrationRequestPatch) throws Exception;

    public Result integrationsCommercePostHttp(Http.Request request, IntegrationRequest integrationRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationMetadata obj = integrationsCommercePost(request, integrationRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationMetadata integrationsCommercePost(Http.Request request, IntegrationRequest integrationRequest) throws Exception;

    public Result integrationsGetByIdHttp(Http.Request request, String id) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationRecord obj = integrationsGetById(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationRecord integrationsGetById(Http.Request request, String id) throws Exception;

    public Result integrationsGetListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationsGetList200Response obj = integrationsGetList(request, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationsGetList200Response integrationsGetList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result integrationsLogsPostHttp(Http.Request request, IntegrationLogsRequest integrationLogsRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        IntegrationLogsSuccessResponse obj = integrationsLogsPost(request, integrationLogsRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract IntegrationLogsSuccessResponse integrationsLogsPost(Http.Request request, IntegrationLogsRequest integrationLogsRequest) throws Exception;

}
