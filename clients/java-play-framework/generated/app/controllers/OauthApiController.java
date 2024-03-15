package controllers;

import apimodels.Error;
import apimodels.OauthAccessTokenResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OauthApiController extends Controller {
    private final OauthApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OauthApiController(Config configuration, OauthApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result oauthToken(Http.Request request) throws Exception {
        String[] valuegrantType = request.body().asMultipartFormData().asFormUrlEncoded().get("grant_type");
        String grantType;
        if (valuegrantType != null) {
            grantType = valuegrantType[0];
        } else {
            throw new IllegalArgumentException("'grant_type' parameter is required");
        }
        return imp.oauthTokenHttp(request, grantType);
    }

}
