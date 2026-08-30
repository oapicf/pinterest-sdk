@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class BillingApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adsCreditRedeem.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsCreditRedeemStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsCreditRedeem(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsCreditRedeemStubBuilder =
        AdsCreditRedeemStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ads_credit/redeem"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adsCreditsDiscountsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsCreditsDiscountsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsCreditsDiscountsGet(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsCreditsDiscountsGetStubBuilder =
        AdsCreditsDiscountsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ads_credit/discounts"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation billingInvoiceDownloadGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param billingInvoiceId path parameter billingInvoiceId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BillingInvoiceDownloadGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun billingInvoiceDownloadGet(adAccountId: StringValuePattern, billingInvoiceId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BillingInvoiceDownloadGetStubBuilder =
        BillingInvoiceDownloadGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("billing_invoice_id", billingInvoiceId)
            .configurer()
        )

    /**
     * Construct a stub for the operation billingInvoicesGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param sort query parameter sort pattern.
     * @param status query parameter status pattern.
     * @param documentType query parameter documentType pattern.
     * @param startDueDate query parameter startDueDate pattern.
     * @param endDueDate query parameter endDueDate pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BillingInvoicesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun billingInvoicesGet(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, sort: StringValuePattern? = null, status: StringValuePattern? = null, documentType: StringValuePattern? = null, startDueDate: StringValuePattern? = null, endDueDate: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BillingInvoicesGetStubBuilder =
        BillingInvoicesGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/billing_invoices"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { sort?.let { withQueryParam("sort", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .apply { documentType?.let { withQueryParam("document_type", it) } }
            .apply { startDueDate?.let { withQueryParam("start_due_date", it) } }
            .apply { endDueDate?.let { withQueryParam("end_due_date", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation billingProfilesGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param isActive query parameter isActive pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BillingProfilesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun billingProfilesGet(adAccountId: StringValuePattern, isActive: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BillingProfilesGetStubBuilder =
        BillingProfilesGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/billing_profiles"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { isActive?.let { withQueryParam("is_active", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioAccountsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioAccountsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioAccountsGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioAccountsGetStubBuilder =
        SsioAccountsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/accounts"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioInsertionOrderCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioInsertionOrderCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioInsertionOrderCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioInsertionOrderCreateStubBuilder =
        SsioInsertionOrderCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/insertion_orders"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioInsertionOrderEdit.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioInsertionOrderEditStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioInsertionOrderEdit(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioInsertionOrderEditStubBuilder =
        SsioInsertionOrderEditStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/insertion_orders"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioInsertionOrdersStatusGetByAdAccount.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioInsertionOrdersStatusGetByAdAccountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioInsertionOrdersStatusGetByAdAccount(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioInsertionOrdersStatusGetByAdAccountStubBuilder =
        SsioInsertionOrdersStatusGetByAdAccountStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioInsertionOrdersStatusGetByPinOrderId.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param pinOrderId path parameter pinOrderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioInsertionOrdersStatusGetByPinOrderIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: StringValuePattern, pinOrderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioInsertionOrdersStatusGetByPinOrderIdStubBuilder =
        SsioInsertionOrdersStatusGetByPinOrderIdStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("pin_order_id", pinOrderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation ssioOrderLinesGetByAdAccount.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param pinOrderId query parameter pinOrderId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SsioOrderLinesGetByAdAccountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ssioOrderLinesGetByAdAccount(adAccountId: StringValuePattern, pinOrderId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SsioOrderLinesGetByAdAccountStubBuilder =
        SsioOrderLinesGetByAdAccountStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ssio/order_lines"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { pinOrderId?.let { withQueryParam("pin_order_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )
}
