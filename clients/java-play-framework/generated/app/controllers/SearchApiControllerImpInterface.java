package controllers;

import apimodels.Error;
import apimodels.PinsList200Response;
import apimodels.SearchPartnerPins200Response;
import apimodels.SearchUserBoardsGet200Response;

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
public abstract class SearchApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result searchPartnerPinsHttp(Http.Request request, @NotNull String term, @NotNull String countryCode, String bookmark, String locale,  @Min(1) @Max(50)Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SearchPartnerPins200Response obj = searchPartnerPins(request, term, countryCode, bookmark, locale, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchPartnerPins200Response searchPartnerPins(Http.Request request, @NotNull String term, @NotNull String countryCode, String bookmark, String locale,  @Min(1) @Max(50)Integer limit) throws Exception;

    public Result searchUserBoardsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String query) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SearchUserBoardsGet200Response obj = searchUserBoardsGet(request, adAccountId, bookmark, pageSize, query);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchUserBoardsGet200Response searchUserBoardsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String query) throws Exception;

    public Result searchUserPinsListHttp(Http.Request request, @NotNull String query,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        PinsList200Response obj = searchUserPinsList(request, query, adAccountId, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PinsList200Response searchUserPinsList(Http.Request request, @NotNull String query,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark) throws Exception;

}
