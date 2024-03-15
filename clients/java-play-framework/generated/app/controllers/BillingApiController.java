package controllers;

import apimodels.AdsCreditRedeemRequest;
import apimodels.AdsCreditRedeemResponse;
import apimodels.AdsCreditsDiscountsGet200Response;
import apimodels.BillingProfilesGet200Response;
import apimodels.Error;
import apimodels.SSIOAccountResponse;
import apimodels.SSIOCreateInsertionOrderRequest;
import apimodels.SSIOCreateInsertionOrderResponse;
import apimodels.SSIOEditInsertionOrderRequest;
import apimodels.SSIOEditInsertionOrderResponse;
import apimodels.SSIOInsertionOrderStatusResponse;
import apimodels.SsioInsertionOrdersStatusGetByAdAccount200Response;
import apimodels.SsioOrderLinesGetByAdAccount200Response;

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
public class BillingApiController extends Controller {
    private final BillingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BillingApiController(Config configuration, BillingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adsCreditRedeem(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadsCreditRedeemRequest = request.body().asJson();
        AdsCreditRedeemRequest adsCreditRedeemRequest;
        if (nodeadsCreditRedeemRequest != null) {
            adsCreditRedeemRequest = mapper.readValue(nodeadsCreditRedeemRequest.toString(), AdsCreditRedeemRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adsCreditRedeemRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdsCreditRedeemRequest' parameter is required");
        }
        return imp.adsCreditRedeemHttp(request, adAccountId, adsCreditRedeemRequest);
    }

    @ApiAction
    public Result adsCreditsDiscountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.adsCreditsDiscountsGetHttp(request, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result billingProfilesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valueisActive = request.getQueryString("is_active");
        Boolean isActive;
        if (valueisActive != null) {
            isActive = Boolean.valueOf(valueisActive);
        } else {
            throw new IllegalArgumentException("'is_active' parameter is required");
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
        return imp.billingProfilesGetHttp(request, adAccountId, isActive, bookmark, pageSize);
    }

    @ApiAction
    public Result ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.ssioAccountsGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodessIOCreateInsertionOrderRequest = request.body().asJson();
        SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest;
        if (nodessIOCreateInsertionOrderRequest != null) {
            ssIOCreateInsertionOrderRequest = mapper.readValue(nodessIOCreateInsertionOrderRequest.toString(), SSIOCreateInsertionOrderRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(ssIOCreateInsertionOrderRequest);
            }
        } else {
            throw new IllegalArgumentException("'SSIOCreateInsertionOrderRequest' parameter is required");
        }
        return imp.ssioInsertionOrderCreateHttp(request, adAccountId, ssIOCreateInsertionOrderRequest);
    }

    @ApiAction
    public Result ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodessIOEditInsertionOrderRequest = request.body().asJson();
        SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest;
        if (nodessIOEditInsertionOrderRequest != null) {
            ssIOEditInsertionOrderRequest = mapper.readValue(nodessIOEditInsertionOrderRequest.toString(), SSIOEditInsertionOrderRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(ssIOEditInsertionOrderRequest);
            }
        } else {
            throw new IllegalArgumentException("'SSIOEditInsertionOrderRequest' parameter is required");
        }
        return imp.ssioInsertionOrderEditHttp(request, adAccountId, ssIOEditInsertionOrderRequest);
    }

    @ApiAction
    public Result ssioInsertionOrdersStatusGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        return imp.ssioInsertionOrdersStatusGetByAdAccountHttp(request, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result ssioInsertionOrdersStatusGetByPinOrderId(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String pinOrderId) throws Exception {
        return imp.ssioInsertionOrdersStatusGetByPinOrderIdHttp(request, adAccountId, pinOrderId);
    }

    @ApiAction
    public Result ssioOrderLinesGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valuepinOrderId = request.getQueryString("pin_order_id");
        String pinOrderId;
        if (valuepinOrderId != null) {
            pinOrderId = valuepinOrderId;
        } else {
            pinOrderId = null;
        }
        return imp.ssioOrderLinesGetByAdAccountHttp(request, adAccountId, bookmark, pageSize, pinOrderId);
    }

}
