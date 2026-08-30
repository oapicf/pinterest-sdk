package controllers;

import apimodels.ConversionAccessToken;
import apimodels.OauthAccessToken;
import apimodels.PinterestLibError;
import apimodels.TokenGrantType;
import apimodels.TokenTypeHint;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
    public Result oauthConversionToken(Http.Request request) throws Exception {
        return imp.oauthConversionTokenHttp(request);
    }

    @ApiAction
    public Result oauthToken(Http.Request request) throws Exception {
        String[] valuecode = request.body().asMultipartFormData().asFormUrlEncoded().get("code");
        String code;
        if (valuecode != null) {
            code = valuecode[0];
        } else {
            code = null;
        }
        String[] valuecontinuousRefresh = request.body().asMultipartFormData().asFormUrlEncoded().get("continuous_refresh");
        String continuousRefresh;
        if (valuecontinuousRefresh != null) {
            continuousRefresh = valuecontinuousRefresh[0];
        } else {
            continuousRefresh = null;
        }
        String[] valuegrantType = request.body().asMultipartFormData().asFormUrlEncoded().get("grant_type");
        TokenGrantType grantType;
        if (valuegrantType != null) {
            grantType = valuegrantType[0];
        } else {
            throw new IllegalArgumentException("'grant_type' parameter is required");
        }
        String[] valueredirectUri = request.body().asMultipartFormData().asFormUrlEncoded().get("redirect_uri");
        String redirectUri;
        if (valueredirectUri != null) {
            redirectUri = valueredirectUri[0];
        } else {
            redirectUri = null;
        }
        String[] valuerefreshToken = request.body().asMultipartFormData().asFormUrlEncoded().get("refresh_token");
        String refreshToken;
        if (valuerefreshToken != null) {
            refreshToken = valuerefreshToken[0];
        } else {
            refreshToken = null;
        }
        String[] valuescope = request.body().asMultipartFormData().asFormUrlEncoded().get("scope");
        String scope;
        if (valuescope != null) {
            scope = valuescope[0];
        } else {
            scope = null;
        }
        return imp.oauthTokenHttp(request, grantType, code, continuousRefresh, redirectUri, refreshToken, scope);
    }

    @ApiAction
    public Result tokenRevoke(Http.Request request) throws Exception {
        String[] valuetoken = request.body().asMultipartFormData().asFormUrlEncoded().get("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken[0];
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        String[] valuetokenTypeHint = request.body().asMultipartFormData().asFormUrlEncoded().get("token_type_hint");
        TokenTypeHint tokenTypeHint;
        if (valuetokenTypeHint != null) {
            tokenTypeHint = valuetokenTypeHint[0];
        } else {
            tokenTypeHint = null;
        }
        return imp.tokenRevokeHttp(request, token, tokenTypeHint);
    }

}
