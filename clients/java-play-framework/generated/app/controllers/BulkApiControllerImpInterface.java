package controllers;

import apimodels.BulkDownloadRequest;
import apimodels.BulkDownloadResponse;
import apimodels.BulkUpsertRequest;
import apimodels.BulkUpsertResponse;
import apimodels.BulkUpsertStatusResponse;
import apimodels.Error;

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
public abstract class BulkApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result bulkDownloadCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkDownloadRequest bulkDownloadRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BulkDownloadResponse obj = bulkDownloadCreate(request, adAccountId, bulkDownloadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BulkDownloadResponse bulkDownloadCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkDownloadRequest bulkDownloadRequest) throws Exception;

    public Result bulkRequestGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bulkRequestId, Boolean includeDetails) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BulkUpsertStatusResponse obj = bulkRequestGet(request, adAccountId, bulkRequestId, includeDetails);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BulkUpsertStatusResponse bulkRequestGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bulkRequestId, Boolean includeDetails) throws Exception;

    public Result bulkUpsertCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BulkUpsertResponse obj = bulkUpsertCreate(request, adAccountId, bulkUpsertRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BulkUpsertResponse bulkUpsertCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws Exception;

}
