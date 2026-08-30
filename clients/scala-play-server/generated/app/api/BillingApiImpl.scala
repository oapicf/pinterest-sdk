package api

import model.AdsCreditRedeem
import model.AdsCreditRedeemCreate
import model.AdsCreditsDiscountsGet200Response
import model.BillingInvoiceDocumentType
import model.BillingInvoiceDownloadResponse
import model.BillingInvoiceSortField
import model.BillingInvoiceStatus
import model.BillingInvoicesGet200Response
import model.BillingProfilesGet200Response
import model.Error
import java.time.LocalDate
import model.PaginationOrder
import model.SSIOAccount
import model.SSIOInsertionOrder
import model.SSIOInsertionOrderCreate
import model.SSIOInsertionOrderStatusResponse
import model.SSIOInsertionOrderUpdate
import model.SsioInsertionOrdersStatusGetByAdAccount200Response
import model.SsioOrderLinesGetByAdAccount200Response

/**
  * Provides a default implementation for [[BillingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class BillingApiImpl extends BillingApi {
  /**
    * @inheritdoc
    */
  override def adsCreditRedeem(adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate): AdsCreditRedeem = {
    // TODO: Implement better logic

    AdsCreditRedeem(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adsCreditsDiscountsGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdsCreditsDiscountsGet200Response = {
    // TODO: Implement better logic

    AdsCreditsDiscountsGet200Response(None, List.empty[AdsCreditDiscountsResponse])
  }

  /**
    * @inheritdoc
    */
  override def billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String): BillingInvoiceDownloadResponse = {
    // TODO: Implement better logic

    BillingInvoiceDownloadResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def billingInvoicesGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], sort: Option[BillingInvoiceSortField], status: Option[BillingInvoiceStatus], documentType: Option[BillingInvoiceDocumentType], startDueDate: Option[LocalDate], endDueDate: Option[LocalDate]): BillingInvoicesGet200Response = {
    // TODO: Implement better logic

    BillingInvoicesGet200Response(None, List.empty[BillingInvoice])
  }

  /**
    * @inheritdoc
    */
  override def billingProfilesGet(isActive: Boolean, adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): BillingProfilesGet200Response = {
    // TODO: Implement better logic

    BillingProfilesGet200Response(None, List.empty[BillingProfilesResponse])
  }

  /**
    * @inheritdoc
    */
  override def ssioAccountsGet(adAccountId: String): SSIOAccount = {
    // TODO: Implement better logic

    SSIOAccount(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrderCreate(adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate): SSIOInsertionOrder = {
    // TODO: Implement better logic

    SSIOInsertionOrder(None)
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrderEdit(adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate): SSIOInsertionOrder = {
    // TODO: Implement better logic

    SSIOInsertionOrder(None)
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): SsioInsertionOrdersStatusGetByAdAccount200Response = {
    // TODO: Implement better logic

    SsioInsertionOrdersStatusGetByAdAccount200Response(None, List.empty[SSIOInsertionOrderStatus])
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String): SSIOInsertionOrderStatusResponse = {
    // TODO: Implement better logic

    SSIOInsertionOrderStatusResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def ssioOrderLinesGetByAdAccount(adAccountId: String, pinOrderId: Option[String], bookmark: Option[String], pageSize: Option[Int]): SsioOrderLinesGetByAdAccount200Response = {
    // TODO: Implement better logic

    SsioOrderLinesGetByAdAccount200Response(None, List.empty[SSIOOrderLine])
  }
}
