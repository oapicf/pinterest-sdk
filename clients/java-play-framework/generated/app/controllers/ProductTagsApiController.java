package controllers;

import apimodels.PinterestLibError;
import apimodels.ProductTagsBulkAddRequest;
import apimodels.ProductTagsBulkDeleteRequest;
import apimodels.ProductTagsError;
import apimodels.ProductTagsResponse;

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
public class ProductTagsApiController extends Controller {
    private final ProductTagsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ProductTagsApiController(Config configuration, ProductTagsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result productTagsBulkAdd(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId) throws Exception {
        JsonNode nodeproductTagsBulkAddRequest = request.body().asJson();
        ProductTagsBulkAddRequest productTagsBulkAddRequest;
        if (nodeproductTagsBulkAddRequest != null) {
            productTagsBulkAddRequest = mapper.readValue(nodeproductTagsBulkAddRequest.toString(), ProductTagsBulkAddRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productTagsBulkAddRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProductTagsBulkAddRequest' parameter is required");
        }
        return imp.productTagsBulkAddHttp(request, pinId, productTagsBulkAddRequest);
    }

    @ApiAction
    public Result productTagsBulkDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId) throws Exception {
        JsonNode nodeproductTagsBulkDeleteRequest = request.body().asJson();
        ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest;
        if (nodeproductTagsBulkDeleteRequest != null) {
            productTagsBulkDeleteRequest = mapper.readValue(nodeproductTagsBulkDeleteRequest.toString(), ProductTagsBulkDeleteRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(productTagsBulkDeleteRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProductTagsBulkDeleteRequest' parameter is required");
        }
        return imp.productTagsBulkDeleteHttp(request, pinId, productTagsBulkDeleteRequest);
    }

    @ApiAction
    public Result productTagsList(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId) throws Exception {
        return imp.productTagsListHttp(request, pinId);
    }

}
