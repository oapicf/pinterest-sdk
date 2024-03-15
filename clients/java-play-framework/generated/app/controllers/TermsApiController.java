package controllers;

import apimodels.Error;
import apimodels.RelatedTerms;

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
public class TermsApiController extends Controller {
    private final TermsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TermsApiController(Config configuration, TermsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result termsRelatedList(Http.Request request) throws Exception {
        String[] termsArray = request.queryString().get("terms");
        if (termsArray == null) {
            throw new IllegalArgumentException("'terms' parameter is required");
        }
        List<String> termsList = OpenAPIUtils.parametersToList("multi", termsArray);
        List<String> terms = new ArrayList<>();
        for (String curParam : termsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                terms.add(curParam);
            }
        }
        return imp.termsRelatedListHttp(request, terms);
    }

    @ApiAction
    public Result termsSuggestedList(Http.Request request) throws Exception {
        String valueterm = request.getQueryString("term");
        String term;
        if (valueterm != null) {
            term = valueterm;
        } else {
            throw new IllegalArgumentException("'term' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 4;
        }
        return imp.termsSuggestedListHttp(request, term, limit);
    }

}
