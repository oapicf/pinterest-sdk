package controllers;

import apimodels.ConversionAccessToken;
import apimodels.OauthAccessToken;
import apimodels.PinterestLibError;
import apimodels.TokenGrantType;
import apimodels.TokenTypeHint;

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
public abstract class OauthApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result oauthConversionTokenHttp(Http.Request request) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionAccessToken obj = oauthConversionToken(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionAccessToken oauthConversionToken(Http.Request request) throws Exception;

    public Result oauthTokenHttp(Http.Request request, TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope) throws Exception {
        OauthAccessToken obj = oauthToken(request, grantType, code, continuousRefresh, redirectUri, refreshToken, scope);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OauthAccessToken oauthToken(Http.Request request, TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope) throws Exception;

    public Result tokenRevokeHttp(Http.Request request, String token, TokenTypeHint tokenTypeHint) throws Exception {
        tokenRevoke(request, token, tokenTypeHint);
        return ok();

    }

    public abstract void tokenRevoke(Http.Request request, String token, TokenTypeHint tokenTypeHint) throws Exception;

}
