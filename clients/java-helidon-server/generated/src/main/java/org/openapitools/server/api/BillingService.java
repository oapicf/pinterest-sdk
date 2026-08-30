package org.openapitools.server.api;

import org.openapitools.server.model.AdsCreditRedeem;
import org.openapitools.server.model.AdsCreditRedeemCreate;
import org.openapitools.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.server.model.BillingInvoiceDocumentType;
import org.openapitools.server.model.BillingInvoiceDownloadResponse;
import org.openapitools.server.model.BillingInvoiceSortField;
import org.openapitools.server.model.BillingInvoiceStatus;
import org.openapitools.server.model.BillingInvoicesGet200Response;
import org.openapitools.server.model.BillingProfilesGet200Response;
import java.util.HexFormat;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.SSIOAccount;
import org.openapitools.server.model.SSIOInsertionOrder;
import org.openapitools.server.model.SSIOInsertionOrderCreate;
import org.openapitools.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.server.model.SSIOInsertionOrderUpdate;
import org.openapitools.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.server.model.SsioOrderLinesGetByAdAccount200Response;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Billing'",
                             version = "7.24.0")
public interface BillingService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/ads_credit/redeem", this::adsCreditRedeem);
        rules.get("/ads_credit/discounts", this::adsCreditsDiscountsGet);
        rules.get("/billing_invoice/{billing_invoice_id}/download", this::billingInvoiceDownloadGet);
        rules.get("/billing_invoices", this::billingInvoicesGet);
        rules.get("/billing_profiles", this::billingProfilesGet);
        rules.get("/ssio/accounts", this::ssioAccountsGet);
        rules.post("/ssio/insertion_orders", this::ssioInsertionOrderCreate);
        rules.patch("/ssio/insertion_orders", this::ssioInsertionOrderEdit);
        rules.get("/ssio/insertion_orders/status", this::ssioInsertionOrdersStatusGetByAdAccount);
        rules.get("/ssio/insertion_orders/{pin_order_id}/status", this::ssioInsertionOrdersStatusGetByPinOrderId);
        rules.get("/ssio/order_lines", this::ssioOrderLinesGetByAdAccount);
    }


    /**
     * POST /ad_accounts/{ad_account_id}/ads_credit/redeem : Redeem ad credits.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsCreditRedeem(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ads_credit/discounts : Get ads credit discounts.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsCreditsDiscountsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download : Get download url for a billing invoice.
     *
     * @param request the server request
     * @param response the server response
     */
    void billingInvoiceDownloadGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/billing_invoices : Get billing invoices.
     *
     * @param request the server request
     * @param response the server response
     */
    void billingInvoicesGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/billing_profiles : Get billing profiles.
     *
     * @param request the server request
     * @param response the server response
     */
    void billingProfilesGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ssio/accounts : Get Salesforce account details including bill-to information..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioAccountsGet(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/ssio/insertion_orders : Create insertion order through SSIO..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioInsertionOrderCreate(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/ssio/insertion_orders : Edit insertion order through SSIO..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioInsertionOrderEdit(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ssio/insertion_orders/status : Get insertion order status by ad account id..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioInsertionOrdersStatusGetByAdAccount(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status : Get insertion order status by pin order id..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioInsertionOrdersStatusGetByPinOrderId(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ssio/order_lines : Get Salesforce order lines by ad account id..
     *
     * @param request the server request
     * @param response the server response
     */
    void ssioOrderLinesGetByAdAccount(ServerRequest request, ServerResponse response);
}
