package controllers;

import apimodels.Error;
import apimodels.TermsOfService;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsOfServiceApiController extends Controller {
    private final TermsOfServiceApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TermsOfServiceApiController(Config configuration, TermsOfServiceApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result termsOfServiceGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valueincludeHtml = request.getQueryString("include_html");
        Boolean includeHtml;
        if (valueincludeHtml != null) {
            includeHtml = Boolean.valueOf(valueincludeHtml);
        } else {
            includeHtml = false;
        }
        String valuetosType = request.getQueryString("tos_type");
        String tosType;
        if (valuetosType != null) {
            tosType = valuetosType;
        } else {
            tosType = null;
        }
        return imp.termsOfServiceGetHttp(request, adAccountId, includeHtml, tosType);
    }

}
