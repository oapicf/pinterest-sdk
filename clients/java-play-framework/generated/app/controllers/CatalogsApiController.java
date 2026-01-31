package controllers;

import apimodels.Catalog;
import apimodels.CatalogsAvailableFilterValues;
import apimodels.CatalogsCreateRequest;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsLocale;
import apimodels.Country;
import apimodels.Error;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsApiController extends Controller {
    private final CatalogsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogsApiController(Config configuration, CatalogsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result catalogsAvailableFilterValues(Http.Request request) throws Exception {
        String valuecatalogId = request.getQueryString("catalog_id");
        String catalogId;
        if (valuecatalogId != null) {
            catalogId = valuecatalogId;
        } else {
            throw new IllegalArgumentException("'catalog_id' parameter is required");
        }
        String valuefeedId = request.getQueryString("feed_id");
        String feedId;
        if (valuefeedId != null) {
            feedId = valuefeedId;
        } else {
            feedId = null;
        }
        String valuecountry = request.getQueryString("country");
        Country country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuelanguage = request.getQueryString("language");
        CatalogsLocale language;
        if (valuelanguage != null) {
            language = valuelanguage;
        } else {
            language = null;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsAvailableFilterValuesHttp(request, catalogId, feedId, country, language, adAccountId);
    }

    @ApiAction
    public Result catalogsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsCreateRequest = request.body().asJson();
        CatalogsCreateRequest catalogsCreateRequest;
        if (nodecatalogsCreateRequest != null) {
            catalogsCreateRequest = mapper.readValue(nodecatalogsCreateRequest.toString(), CatalogsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsCreateRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsCreateHttp(request, catalogsCreateRequest, adAccountId);
    }

    @ApiAction
    public Result catalogsList(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsListHttp(request, bookmark, pageSize, adAccountId);
    }

}
