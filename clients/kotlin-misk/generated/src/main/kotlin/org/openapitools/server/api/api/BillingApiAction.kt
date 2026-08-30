package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.AdsCreditRedeem
import org.openapitools.server.api.model.AdsCreditRedeemCreate
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.api.model.BillingInvoiceDocumentType
import org.openapitools.server.api.model.BillingInvoiceDownloadResponse
import org.openapitools.server.api.model.BillingInvoiceSortField
import org.openapitools.server.api.model.BillingInvoiceStatus
import org.openapitools.server.api.model.BillingInvoicesGet200Response
import org.openapitools.server.api.model.BillingProfilesGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.SSIOAccount
import org.openapitools.server.api.model.SSIOInsertionOrder
import org.openapitools.server.api.model.SSIOInsertionOrderCreate
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.api.model.SSIOInsertionOrderUpdate
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BillingApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/ads_credit/redeem")
    @Description("Redeem ad credits")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsCreditRedeem(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adsCreditRedeemCreate: AdsCreditRedeemCreate
    ): AdsCreditRedeem {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ads_credit/discounts")
    @Description("Get ads credit discounts")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adsCreditsDiscountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): AdsCreditsDiscountsGet200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download")
    @Description("Get download url for a billing invoice")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun billingInvoiceDownloadGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("billing_invoice_id") billingInvoiceId: kotlin.String
    ): BillingInvoiceDownloadResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/billing_invoices")
    @Description("Get billing invoices")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun billingInvoicesGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "sort") sort: BillingInvoiceSortField, 
         @QueryParam(value = "status") status: BillingInvoiceStatus?, 
         @QueryParam(value = "document_type") documentType: BillingInvoiceDocumentType?, 
         @QueryParam(value = "start_due_date") startDueDate: java.time.LocalDate?, 
         @QueryParam(value = "end_due_date") endDueDate: java.time.LocalDate?
    ): BillingInvoicesGet200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/billing_profiles")
    @Description("Get billing profiles")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun billingProfilesGet(
         @QueryParam(value = "is_active") isActive: kotlin.Boolean, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BillingProfilesGet200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ssio/accounts")
    @Description("Get Salesforce account details including bill-to information.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioAccountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): SSIOAccount {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/ssio/insertion_orders")
    @Description("Create insertion order through SSIO.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioInsertionOrderCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody ssIOInsertionOrderCreate: SSIOInsertionOrderCreate
    ): SSIOInsertionOrder {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/ssio/insertion_orders")
    @Description("Edit insertion order through SSIO.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioInsertionOrderEdit(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody ssIOInsertionOrderUpdate: SSIOInsertionOrderUpdate
    ): SSIOInsertionOrder {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ssio/insertion_orders/status")
    @Description("Get insertion order status by ad account id.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioInsertionOrdersStatusGetByAdAccount(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): SsioInsertionOrdersStatusGetByAdAccount200Response {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")
    @Description("Get insertion order status by pin order id.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioInsertionOrdersStatusGetByPinOrderId(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @PathParam("pin_order_id") pinOrderId: kotlin.String
    ): SSIOInsertionOrderStatusResponse {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/ssio/order_lines")
    @Description("Get Salesforce order lines by ad account id.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun ssioOrderLinesGetByAdAccount(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "pin_order_id") pinOrderId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): SsioOrderLinesGetByAdAccount200Response {
        TODO()
    }
}
