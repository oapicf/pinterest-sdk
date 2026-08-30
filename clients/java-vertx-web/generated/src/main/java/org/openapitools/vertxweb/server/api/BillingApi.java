package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsCreditRedeem;
import org.openapitools.vertxweb.server.model.AdsCreditRedeemCreate;
import org.openapitools.vertxweb.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.vertxweb.server.model.BillingInvoiceDocumentType;
import org.openapitools.vertxweb.server.model.BillingInvoiceDownloadResponse;
import org.openapitools.vertxweb.server.model.BillingInvoiceSortField;
import org.openapitools.vertxweb.server.model.BillingInvoiceStatus;
import org.openapitools.vertxweb.server.model.BillingInvoicesGet200Response;
import org.openapitools.vertxweb.server.model.BillingProfilesGet200Response;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.SSIOAccount;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrder;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderCreate;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.vertxweb.server.model.SSIOInsertionOrderUpdate;
import org.openapitools.vertxweb.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.vertxweb.server.model.SsioOrderLinesGetByAdAccount200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BillingApi  {
    Future<ApiResponse<AdsCreditRedeem>> adsCreditRedeem(String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate);
    Future<ApiResponse<AdsCreditsDiscountsGet200Response>> adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<BillingInvoiceDownloadResponse>> billingInvoiceDownloadGet(String adAccountId, String billingInvoiceId);
    Future<ApiResponse<BillingInvoicesGet200Response>> billingInvoicesGet(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, LocalDate startDueDate, LocalDate endDueDate);
    Future<ApiResponse<BillingProfilesGet200Response>> billingProfilesGet(Boolean isActive, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<SSIOAccount>> ssioAccountsGet(String adAccountId);
    Future<ApiResponse<SSIOInsertionOrder>> ssioInsertionOrderCreate(String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate);
    Future<ApiResponse<SSIOInsertionOrder>> ssioInsertionOrderEdit(String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate);
    Future<ApiResponse<SsioInsertionOrdersStatusGetByAdAccount200Response>> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<SSIOInsertionOrderStatusResponse>> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId);
    Future<ApiResponse<SsioOrderLinesGetByAdAccount200Response>> ssioOrderLinesGetByAdAccount(String adAccountId, String pinOrderId, String bookmark, Integer pageSize);
}
