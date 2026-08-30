package controllers;

import apimodels.AdsCreditRedeem;
import apimodels.AdsCreditRedeemCreate;
import apimodels.AdsCreditsDiscountsGet200Response;
import apimodels.BillingInvoiceDocumentType;
import apimodels.BillingInvoiceDownloadResponse;
import apimodels.BillingInvoiceSortField;
import apimodels.BillingInvoiceStatus;
import apimodels.BillingInvoicesGet200Response;
import apimodels.BillingProfilesGet200Response;
import java.time.LocalDate;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.SSIOAccount;
import apimodels.SSIOInsertionOrder;
import apimodels.SSIOInsertionOrderCreate;
import apimodels.SSIOInsertionOrderStatusResponse;
import apimodels.SSIOInsertionOrderUpdate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        JsonNode nodeadsCreditRedeemCreate = request.body().asJson();
        AdsCreditRedeemCreate adsCreditRedeemCreate;
        if (nodeadsCreditRedeemCreate != null) {
            adsCreditRedeemCreate = mapper.readValue(nodeadsCreditRedeemCreate.toString(), AdsCreditRedeemCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adsCreditRedeemCreate);
            }
        } else {
            throw new IllegalArgumentException("'AdsCreditRedeemCreate' parameter is required");
        }
        return imp.adsCreditRedeemHttp(request, adAccountId, adsCreditRedeemCreate);
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
    public Result billingInvoiceDownloadGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String billingInvoiceId) throws Exception {
        return imp.billingInvoiceDownloadGetHttp(request, adAccountId, billingInvoiceId);
    }

    @ApiAction
    public Result billingInvoicesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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
        String valuesort = request.getQueryString("sort");
        BillingInvoiceSortField sort;
        if (valuesort != null) {
            sort = valuesort;
        } else {
            sort = DUE_DATE;
        }
        String valuestatus = request.getQueryString("status");
        BillingInvoiceStatus status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valuedocumentType = request.getQueryString("document_type");
        BillingInvoiceDocumentType documentType;
        if (valuedocumentType != null) {
            documentType = valuedocumentType;
        } else {
            documentType = null;
        }
        String valuestartDueDate = request.getQueryString("start_due_date");
        LocalDate startDueDate;
        if (valuestartDueDate != null) {
            startDueDate = LocalDate.parse(valuestartDueDate);
        } else {
            startDueDate = null;
        }
        String valueendDueDate = request.getQueryString("end_due_date");
        LocalDate endDueDate;
        if (valueendDueDate != null) {
            endDueDate = LocalDate.parse(valueendDueDate);
        } else {
            endDueDate = null;
        }
        return imp.billingInvoicesGetHttp(request, adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate);
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
        return imp.billingProfilesGetHttp(request, isActive, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        return imp.ssioAccountsGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodessIOInsertionOrderCreate = request.body().asJson();
        SSIOInsertionOrderCreate ssIOInsertionOrderCreate;
        if (nodessIOInsertionOrderCreate != null) {
            ssIOInsertionOrderCreate = mapper.readValue(nodessIOInsertionOrderCreate.toString(), SSIOInsertionOrderCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(ssIOInsertionOrderCreate);
            }
        } else {
            throw new IllegalArgumentException("'SSIOInsertionOrderCreate' parameter is required");
        }
        return imp.ssioInsertionOrderCreateHttp(request, adAccountId, ssIOInsertionOrderCreate);
    }

    @ApiAction
    public Result ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodessIOInsertionOrderUpdate = request.body().asJson();
        SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate;
        if (nodessIOInsertionOrderUpdate != null) {
            ssIOInsertionOrderUpdate = mapper.readValue(nodessIOInsertionOrderUpdate.toString(), SSIOInsertionOrderUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(ssIOInsertionOrderUpdate);
            }
        } else {
            throw new IllegalArgumentException("'SSIOInsertionOrderUpdate' parameter is required");
        }
        return imp.ssioInsertionOrderEditHttp(request, adAccountId, ssIOInsertionOrderUpdate);
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
        String valuepinOrderId = request.getQueryString("pin_order_id");
        String pinOrderId;
        if (valuepinOrderId != null) {
            pinOrderId = valuepinOrderId;
        } else {
            pinOrderId = null;
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
        return imp.ssioOrderLinesGetByAdAccountHttp(request, adAccountId, pinOrderId, bookmark, pageSize);
    }

}
