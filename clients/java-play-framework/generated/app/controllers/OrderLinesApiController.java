package controllers;

import apimodels.OrderLine;
import apimodels.OrderLinesList200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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
public class OrderLinesApiController extends Controller {
    private final OrderLinesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OrderLinesApiController(Config configuration, OrderLinesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result orderLinesGet(Http.Request request,  @Pattern(regexp="^\\d+$")String orderLineId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.orderLinesGetHttp(request, orderLineId, adAccountId);
    }

    @ApiAction
    public Result orderLinesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valueorder = request.getQueryString("order");
        PinterestLibPaginationOrder order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        return imp.orderLinesListHttp(request, adAccountId, bookmark, pageSize, order);
    }

}
