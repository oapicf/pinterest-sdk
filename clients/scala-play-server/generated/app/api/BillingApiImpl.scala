package api

import model.AdsCreditRedeemRequest
import model.AdsCreditRedeemResponse
import model.AdsCreditsDiscountsGet200Response
import model.BillingInvoiceDownloadResponse
import model.BillingInvoicesGet200Response
import model.BillingProfilesGet200Response
import model.Error
import java.time.LocalDate
import model.SSIOAccountResponse
import model.SSIOCreateInsertionOrderRequest
import model.SSIOCreateInsertionOrderResponse
import model.SSIOEditInsertionOrderRequest
import model.SSIOEditInsertionOrderResponse
import model.SSIOInsertionOrderStatusResponse
import model.SsioInsertionOrdersStatusGetByAdAccount200Response
import model.SsioOrderLinesGetByAdAccount200Response

/**
  * Provides a default implementation for [[BillingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class BillingApiImpl extends BillingApi {
  /**
    * @inheritdoc
    */
  override def adsCreditRedeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest): AdsCreditRedeemResponse = {
    // TODO: Implement better logic

    AdsCreditRedeemResponse(None, None, None)
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
  override def billingInvoicesGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], sort: Option[String], order: Option[String], status: Option[String], documentType: Option[String], startDueDate: Option[LocalDate], endDueDate: Option[LocalDate]): BillingInvoicesGet200Response = {
    // TODO: Implement better logic

    BillingInvoicesGet200Response(None, List.empty[BillingInvoiceResponse])
  }

  /**
    * @inheritdoc
    */
  override def billingProfilesGet(adAccountId: String, isActive: Boolean, bookmark: Option[String], pageSize: Option[Int]): BillingProfilesGet200Response = {
    // TODO: Implement better logic

    BillingProfilesGet200Response(None, List.empty[BillingProfilesResponse])
  }

  /**
    * @inheritdoc
    */
  override def ssioAccountsGet(adAccountId: String): SSIOAccountResponse = {
    // TODO: Implement better logic

    SSIOAccountResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrderCreate(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): SSIOCreateInsertionOrderResponse = {
    // TODO: Implement better logic

    SSIOCreateInsertionOrderResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def ssioInsertionOrderEdit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): SSIOEditInsertionOrderResponse = {
    // TODO: Implement better logic

    SSIOEditInsertionOrderResponse(None)
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

    SSIOInsertionOrderStatusResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def ssioOrderLinesGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], pinOrderId: Option[String]): SsioOrderLinesGetByAdAccount200Response = {
    // TODO: Implement better logic

    SsioOrderLinesGetByAdAccount200Response(None, List.empty[SSIOOrderLine])
  }
}
