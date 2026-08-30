package controllers;

import apimodels.ConversionAccessToken;
import apimodels.OauthAccessToken;
import apimodels.PinterestLibError;
import apimodels.TokenGrantType;
import apimodels.TokenTypeHint;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthApiControllerImp extends OauthApiControllerImpInterface {
    @Override
    public ConversionAccessToken oauthConversionToken(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ConversionAccessToken();
    }

    @Override
    public OauthAccessToken oauthToken(Http.Request request, TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope) throws Exception {
        //Do your magic!!!
        return new OauthAccessToken();
    }

    @Override
    public void tokenRevoke(Http.Request request, String token, TokenTypeHint tokenTypeHint) throws Exception {
        //Do your magic!!!
    }

}
