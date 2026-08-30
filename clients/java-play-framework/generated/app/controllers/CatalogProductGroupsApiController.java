package controllers;

import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCountsVertical;
import apimodels.CatalogsProductGroupsCreateManyRequestItems;
import apimodels.CatalogsProductGroupsCreateRequestSchema;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequestSchema;
import apimodels.CatalogsVerticalProductGroup;
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
public class CatalogProductGroupsApiController extends Controller {
    private final CatalogProductGroupsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogProductGroupsApiController(Config configuration, CatalogProductGroupsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuepinMetrics = request.getQueryString("pin_metrics");
        Boolean pinMetrics;
        if (valuepinMetrics != null) {
            pinMetrics = Boolean.valueOf(valuepinMetrics);
        } else {
            pinMetrics = false;
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
        return imp.catalogsProductGroupPinsListHttp(request, productGroupId, adAccountId, pinMetrics, bookmark, pageSize);
    }

    @ApiAction
    public Result catalogsProductGroupsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsProductGroupsCreateRequestSchema = request.body().asJson();
        CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema;
        if (nodecatalogsProductGroupsCreateRequestSchema != null) {
            catalogsProductGroupsCreateRequestSchema = mapper.readValue(nodecatalogsProductGroupsCreateRequestSchema.toString(), CatalogsProductGroupsCreateRequestSchema.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupsCreateRequestSchema);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupsCreateRequestSchema' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsCreateHttp(request, catalogsProductGroupsCreateRequestSchema, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsCreateMany(Http.Request request) throws Exception {
        JsonNode nodecatalogsProductGroupsCreateManyRequestItems = request.body().asJson();
        List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems;
        if (nodecatalogsProductGroupsCreateManyRequestItems != null) {
            catalogsProductGroupsCreateManyRequestItems = mapper.readValue(nodecatalogsProductGroupsCreateManyRequestItems.toString(), new TypeReference<List<CatalogsProductGroupsCreateManyRequestItems>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (CatalogsProductGroupsCreateManyRequestItems curItem : catalogsProductGroupsCreateManyRequestItems) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupsCreateManyRequestItems' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsCreateManyHttp(request, catalogsProductGroupsCreateManyRequestItems, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsDeleteHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsDeleteMany(Http.Request request) throws Exception {
        String[] idArray = request.queryString().get("id");
        if (idArray == null) {
            throw new IllegalArgumentException("'id' parameter is required");
        }
        List<String> idList = OpenAPIUtils.parametersToList("csv", idArray);
        List<Integer> id = new ArrayList<>();
        for (String curParam : idList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                id.add(Integer.parseInt(curParam));
            }
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsDeleteManyHttp(request, id, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsGetHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsList(Http.Request request) throws Exception {
        String[] idArray = request.queryString().get("id");
        List<String> idList = OpenAPIUtils.parametersToList("csv", idArray);
        List<Integer> id = new ArrayList<>();
        for (String curParam : idList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                id.add(Integer.parseInt(curParam));
            }
        }
        String valuefeedId = request.getQueryString("feed_id");
        String feedId;
        if (valuefeedId != null) {
            feedId = valuefeedId;
        } else {
            feedId = null;
        }
        String valuecatalogId = request.getQueryString("catalog_id");
        String catalogId;
        if (valuecatalogId != null) {
            catalogId = valuecatalogId;
        } else {
            catalogId = null;
        }
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
        return imp.catalogsProductGroupsListHttp(request, id, feedId, catalogId, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsProductCountsGetHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        JsonNode nodecatalogsProductGroupsUpdateRequestSchema = request.body().asJson();
        CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema;
        if (nodecatalogsProductGroupsUpdateRequestSchema != null) {
            catalogsProductGroupsUpdateRequestSchema = mapper.readValue(nodecatalogsProductGroupsUpdateRequestSchema.toString(), CatalogsProductGroupsUpdateRequestSchema.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupsUpdateRequestSchema);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupsUpdateRequestSchema' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsUpdateHttp(request, productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId);
    }

    @ApiAction
    public Result productsByProductGroupFilterList(Http.Request request) throws Exception {
        JsonNode nodecatalogsListProductsByFilterRequest = request.body().asJson();
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest;
        if (nodecatalogsListProductsByFilterRequest != null) {
            catalogsListProductsByFilterRequest = mapper.readValue(nodecatalogsListProductsByFilterRequest.toString(), CatalogsListProductsByFilterRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsListProductsByFilterRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsListProductsByFilterRequest' parameter is required");
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuepinMetrics = request.getQueryString("pin_metrics");
        Boolean pinMetrics;
        if (valuepinMetrics != null) {
            pinMetrics = Boolean.valueOf(valuepinMetrics);
        } else {
            pinMetrics = false;
        }
        return imp.productsByProductGroupFilterListHttp(request, catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics);
    }

}
