package controllers;

import apimodels.Catalog;
import apimodels.CatalogCreate;
import apimodels.CatalogsAvailableFilterValues;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsLocale;
import apimodels.Country;
import apimodels.PinterestLibError;

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
        JsonNode nodecatalogCreate = request.body().asJson();
        CatalogCreate catalogCreate;
        if (nodecatalogCreate != null) {
            catalogCreate = mapper.readValue(nodecatalogCreate.toString(), CatalogCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogCreate);
            }
        } else {
            throw new IllegalArgumentException("'CatalogCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsCreateHttp(request, catalogCreate, adAccountId);
    }

    @ApiAction
    public Result catalogsList(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
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
        return imp.catalogsListHttp(request, adAccountId, bookmark, pageSize);
    }

}
