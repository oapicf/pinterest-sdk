package controllers;

import apimodels.Error;
import apimodels.OauthAccessTokenResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
public class OauthApiControllerImp extends OauthApiControllerImpInterface {
    @Override
    public OauthAccessTokenResponse oauthToken(Http.Request request, String grantType) throws Exception {
        //Do your magic!!!
        return new OauthAccessTokenResponse();
    }

}
