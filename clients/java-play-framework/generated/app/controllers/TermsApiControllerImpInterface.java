package controllers;

import apimodels.Error;
import apimodels.RelatedTerms;

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
public abstract class TermsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result termsRelatedListHttp(Http.Request request, @NotNull List<String> terms) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        RelatedTerms obj = termsRelatedList(request, terms);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RelatedTerms termsRelatedList(Http.Request request, @NotNull List<String> terms) throws Exception;

    public Result termsSuggestedListHttp(Http.Request request, @NotNull String term,  @Min(1) @Max(10)Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<String> obj = termsSuggestedList(request, term, limit);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<String> termsSuggestedList(Http.Request request, @NotNull String term,  @Min(1) @Max(10)Integer limit) throws Exception;

}
