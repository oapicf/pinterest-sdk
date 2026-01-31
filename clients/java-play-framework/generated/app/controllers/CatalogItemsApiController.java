package controllers;

import apimodels.CatalogsItems;
import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsRequest;
import apimodels.Error;
import apimodels.ItemsBatchPostRequest;

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
public class CatalogItemsApiController extends Controller {
    private final CatalogItemsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogItemsApiController(Config configuration, CatalogItemsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result itemsBatchGet(Http.Request request,  @Pattern(regexp="^[a-zA-Z0-9]+$")String batchId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsBatchGetHttp(request, batchId, adAccountId);
    }

    @ApiAction
    public Result itemsBatchPost(Http.Request request) throws Exception {
        JsonNode nodeitemsBatchPostRequest = request.body().asJson();
        ItemsBatchPostRequest itemsBatchPostRequest;
        if (nodeitemsBatchPostRequest != null) {
            itemsBatchPostRequest = mapper.readValue(nodeitemsBatchPostRequest.toString(), ItemsBatchPostRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(itemsBatchPostRequest);
            }
        } else {
            throw new IllegalArgumentException("'ItemsBatchPostRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsBatchPostHttp(request, itemsBatchPostRequest, adAccountId);
    }

    @ApiAction
    public Result itemsPost(Http.Request request) throws Exception {
        JsonNode nodecatalogsItemsRequest = request.body().asJson();
        CatalogsItemsRequest catalogsItemsRequest;
        if (nodecatalogsItemsRequest != null) {
            catalogsItemsRequest = mapper.readValue(nodecatalogsItemsRequest.toString(), CatalogsItemsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsItemsRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsItemsRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsPostHttp(request, catalogsItemsRequest, adAccountId);
    }

}
