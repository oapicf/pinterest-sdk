package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
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

@MiskTest(startService = true)
internal class BillingApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var billingApi: BillingApiAction

    /**
     * To test BillingApiAction.adsCreditRedeem
     */
    @Test
    fun `should handle adsCreditRedeem`() {
        val adAccountId = TODO()
        val adsCreditRedeemCreate = TODO()
        val response: AdsCreditRedeem = billingApi.adsCreditRedeem(adAccountId, adsCreditRedeemCreate)
    }

    /**
     * To test BillingApiAction.adsCreditsDiscountsGet
     */
    @Test
    fun `should handle adsCreditsDiscountsGet`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: AdsCreditsDiscountsGet200Response = billingApi.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)
    }

    /**
     * To test BillingApiAction.billingInvoiceDownloadGet
     */
    @Test
    fun `should handle billingInvoiceDownloadGet`() {
        val adAccountId = TODO()
        val billingInvoiceId = TODO()
        val response: BillingInvoiceDownloadResponse = billingApi.billingInvoiceDownloadGet(adAccountId, billingInvoiceId)
    }

    /**
     * To test BillingApiAction.billingInvoicesGet
     */
    @Test
    fun `should handle billingInvoicesGet`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val sort = TODO()
        val status = TODO()
        val documentType = TODO()
        val startDueDate = TODO()
        val endDueDate = TODO()
        val response: BillingInvoicesGet200Response = billingApi.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)
    }

    /**
     * To test BillingApiAction.billingProfilesGet
     */
    @Test
    fun `should handle billingProfilesGet`() {
        val isActive = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BillingProfilesGet200Response = billingApi.billingProfilesGet(isActive, adAccountId, bookmark, pageSize)
    }

    /**
     * To test BillingApiAction.ssioAccountsGet
     */
    @Test
    fun `should handle ssioAccountsGet`() {
        val adAccountId = TODO()
        val response: SSIOAccount = billingApi.ssioAccountsGet(adAccountId)
    }

    /**
     * To test BillingApiAction.ssioInsertionOrderCreate
     */
    @Test
    fun `should handle ssioInsertionOrderCreate`() {
        val adAccountId = TODO()
        val ssIOInsertionOrderCreate = TODO()
        val response: SSIOInsertionOrder = billingApi.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate)
    }

    /**
     * To test BillingApiAction.ssioInsertionOrderEdit
     */
    @Test
    fun `should handle ssioInsertionOrderEdit`() {
        val adAccountId = TODO()
        val ssIOInsertionOrderUpdate = TODO()
        val response: SSIOInsertionOrder = billingApi.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate)
    }

    /**
     * To test BillingApiAction.ssioInsertionOrdersStatusGetByAdAccount
     */
    @Test
    fun `should handle ssioInsertionOrdersStatusGetByAdAccount`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: SsioInsertionOrdersStatusGetByAdAccount200Response = billingApi.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)
    }

    /**
     * To test BillingApiAction.ssioInsertionOrdersStatusGetByPinOrderId
     */
    @Test
    fun `should handle ssioInsertionOrdersStatusGetByPinOrderId`() {
        val adAccountId = TODO()
        val pinOrderId = TODO()
        val response: SSIOInsertionOrderStatusResponse = billingApi.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)
    }

    /**
     * To test BillingApiAction.ssioOrderLinesGetByAdAccount
     */
    @Test
    fun `should handle ssioOrderLinesGetByAdAccount`() {
        val adAccountId = TODO()
        val pinOrderId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: SsioOrderLinesGetByAdAccount200Response = billingApi.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)
    }
}
