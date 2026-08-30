package controllers;

import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.Promotion;
import apimodels.PromotionBatchUpdate;
import apimodels.PromotionCreate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        JsonNode nodepromotionCreate = request.body().asJson();
        List<@Valid PromotionCreate> promotionCreate;
        if (nodepromotionCreate != null) {
            promotionCreate = mapper.readValue(nodepromotionCreate.toString(), new TypeReference<List<@Valid PromotionCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (PromotionCreate curItem : promotionCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'PromotionCreate' parameter is required");
        }
        return imp.promotionsCreateHttp(request, adAccountId, promotionCreate);
    }

    @ApiAction
    public Result promotionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.promotionsDeleteHttp(request, promotionId, adAccountId);
    }

    @ApiAction
    public Result promotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.promotionsGetHttp(request, promotionId, adAccountId);
    }

    @ApiAction
    public Result promotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.promotionsListHttp(request, adAccountId, bookmark, pageSize, order);
    }

    @ApiAction
    public Result promotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodepromotionBatchUpdate = request.body().asJson();
        List<@Valid PromotionBatchUpdate> promotionBatchUpdate;
        if (nodepromotionBatchUpdate != null) {
            promotionBatchUpdate = mapper.readValue(nodepromotionBatchUpdate.toString(), new TypeReference<List<@Valid PromotionBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (PromotionBatchUpdate curItem : promotionBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'PromotionBatchUpdate' parameter is required");
        }
        return imp.promotionsUpdateHttp(request, adAccountId, promotionBatchUpdate);
    }

}
