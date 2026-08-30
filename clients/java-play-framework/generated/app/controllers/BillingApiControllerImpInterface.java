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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class BillingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adsCreditRedeemHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsCreditRedeem obj = adsCreditRedeem(request, adAccountId, adsCreditRedeemCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsCreditRedeem adsCreditRedeem(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate) throws Exception;

    public Result adsCreditsDiscountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsCreditsDiscountsGet200Response obj = adsCreditsDiscountsGet(request, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result billingInvoiceDownloadGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String billingInvoiceId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BillingInvoiceDownloadResponse obj = billingInvoiceDownloadGet(request, adAccountId, billingInvoiceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillingInvoiceDownloadResponse billingInvoiceDownloadGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String billingInvoiceId) throws Exception;

    public Result billingInvoicesGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, LocalDate startDueDate, LocalDate endDueDate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BillingInvoicesGet200Response obj = billingInvoicesGet(request, adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillingInvoicesGet200Response billingInvoicesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, LocalDate startDueDate, LocalDate endDueDate) throws Exception;

    public Result billingProfilesGetHttp(Http.Request request, @NotNull Boolean isActive,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BillingProfilesGet200Response obj = billingProfilesGet(request, isActive, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillingProfilesGet200Response billingProfilesGet(Http.Request request, @NotNull Boolean isActive,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result ssioAccountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOAccount obj = ssioAccountsGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOAccount ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result ssioInsertionOrderCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOInsertionOrder obj = ssioInsertionOrderCreate(request, adAccountId, ssIOInsertionOrderCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOInsertionOrder ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate) throws Exception;

    public Result ssioInsertionOrderEditHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOInsertionOrder obj = ssioInsertionOrderEdit(request, adAccountId, ssIOInsertionOrderUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOInsertionOrder ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate) throws Exception;

    public Result ssioInsertionOrdersStatusGetByAdAccountHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SsioInsertionOrdersStatusGetByAdAccount200Response obj = ssioInsertionOrdersStatusGetByAdAccount(request, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result ssioInsertionOrdersStatusGetByPinOrderIdHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOInsertionOrderStatusResponse obj = ssioInsertionOrdersStatusGetByPinOrderId(request, adAccountId, pinOrderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception;

    public Result ssioOrderLinesGetByAdAccountHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SsioOrderLinesGetByAdAccount200Response obj = ssioOrderLinesGetByAdAccount(request, adAccountId, pinOrderId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

}
