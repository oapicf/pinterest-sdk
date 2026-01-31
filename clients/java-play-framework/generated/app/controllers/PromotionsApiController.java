package controllers;

import apimodels.Error;
import apimodels.PromotionCreateRequest;
import apimodels.PromotionResponse;
import apimodels.PromotionUpdateRequest;
import apimodels.PromotionsList200Response;
import apimodels.PromotionsResponse;

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
public class PromotionsApiController extends Controller {
    private final PromotionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PromotionsApiController(Config configuration, PromotionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result promotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodepromotionCreateRequest = request.body().asJson();
        List<@Valid PromotionCreateRequest> promotionCreateRequest;
        if (nodepromotionCreateRequest != null) {
            promotionCreateRequest = mapper.readValue(nodepromotionCreateRequest.toString(), new TypeReference<List<@Valid PromotionCreateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (PromotionCreateRequest curItem : promotionCreateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'PromotionCreateRequest' parameter is required");
        }
        return imp.promotionsCreateHttp(request, adAccountId, promotionCreateRequest);
    }

    @ApiAction
    public Result promotionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId) throws Exception {
        return imp.promotionsDeleteHttp(request, adAccountId, promotionId);
    }

    @ApiAction
    public Result promotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId) throws Exception {
        return imp.promotionsGetHttp(request, adAccountId, promotionId);
    }

    @ApiAction
    public Result promotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.promotionsListHttp(request, adAccountId, pageSize, order, bookmark);
    }

    @ApiAction
    public Result promotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodepromotionUpdateRequest = request.body().asJson();
        List<@Valid PromotionUpdateRequest> promotionUpdateRequest;
        if (nodepromotionUpdateRequest != null) {
            promotionUpdateRequest = mapper.readValue(nodepromotionUpdateRequest.toString(), new TypeReference<List<@Valid PromotionUpdateRequest>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (PromotionUpdateRequest curItem : promotionUpdateRequest) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'PromotionUpdateRequest' parameter is required");
        }
        return imp.promotionsUpdateHttp(request, adAccountId, promotionUpdateRequest);
    }

}
