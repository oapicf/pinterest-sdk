package controllers;

import apimodels.Error;
import apimodels.TermsOfService;

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
public abstract class TermsOfServiceApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result termsOfServiceGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean includeHtml, String tosType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TermsOfService obj = termsOfServiceGet(request, adAccountId, includeHtml, tosType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TermsOfService termsOfServiceGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean includeHtml, String tosType) throws Exception;

}
