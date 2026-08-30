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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingApiControllerImp extends BillingApiControllerImpInterface {
    @Override
    public AdsCreditRedeem adsCreditRedeem(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate) throws Exception {
        //Do your magic!!!
        return new AdsCreditRedeem();
    }

    @Override
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdsCreditsDiscountsGet200Response();
    }

    @Override
    public BillingInvoiceDownloadResponse billingInvoiceDownloadGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String billingInvoiceId) throws Exception {
        //Do your magic!!!
        return new BillingInvoiceDownloadResponse();
    }

    @Override
    public BillingInvoicesGet200Response billingInvoicesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, LocalDate startDueDate, LocalDate endDueDate) throws Exception {
        //Do your magic!!!
        return new BillingInvoicesGet200Response();
    }

    @Override
    public BillingProfilesGet200Response billingProfilesGet(Http.Request request, @NotNull Boolean isActive,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BillingProfilesGet200Response();
    }

    @Override
    public SSIOAccount ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new SSIOAccount();
    }

    @Override
    public SSIOInsertionOrder ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate) throws Exception {
        //Do your magic!!!
        return new SSIOInsertionOrder();
    }

    @Override
    public SSIOInsertionOrder ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate) throws Exception {
        //Do your magic!!!
        return new SSIOInsertionOrder();
    }

    @Override
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new SsioInsertionOrdersStatusGetByAdAccount200Response();
    }

    @Override
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception {
        //Do your magic!!!
        return new SSIOInsertionOrderStatusResponse();
    }

    @Override
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new SsioOrderLinesGetByAdAccount200Response();
    }

}
