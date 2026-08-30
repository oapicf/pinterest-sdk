package api

import play.api.libs.json._
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

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait BillingApi {
  /**
    * Redeem ad credits
    * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreditRedeem(adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate): AdsCreditRedeem

  /**
    * Get ads credit discounts
    * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def adsCreditsDiscountsGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdsCreditsDiscountsGet200Response

  /**
    * Get download url for a billing invoice
    * Get download url for a billing invoice.
    * @param adAccountId Unique identifier of an ad account.
    * @param billingInvoiceId Unique identifier of a billing invoice.
    */
  def billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String): BillingInvoiceDownloadResponse

  /**
    * Get billing invoices
    * Get billing invoices in the advertiser account.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param sort Field of which to sort billing invoices
    * @param status Status of billing invoices to filter by
    * @param documentType Document type of billing invoices to filter by
    * @param startDueDate Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
    * @param endDueDate Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
    */
  def billingInvoicesGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], sort: Option[BillingInvoiceSortField], status: Option[BillingInvoiceStatus], documentType: Option[BillingInvoiceDocumentType], startDueDate: Option[LocalDate], endDueDate: Option[LocalDate]): BillingInvoicesGet200Response

  /**
    * Get billing profiles
    * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * @param isActive Return active billing profiles, if false return all billing profiles.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def billingProfilesGet(isActive: Boolean, adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): BillingProfilesGet200Response

  /**
    * Get Salesforce account details including bill-to information.
    *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioAccountsGet(adAccountId: String): SSIOAccount

  /**
    * Create insertion order through SSIO.
    *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioInsertionOrderCreate(adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate): SSIOInsertionOrder

  /**
    * Edit insertion order through SSIO.
    *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioInsertionOrderEdit(adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate): SSIOInsertionOrder

  /**
    * Get insertion order status by ad account id.
    *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): SsioInsertionOrdersStatusGetByAdAccount200Response

  /**
    * Get insertion order status by pin order id.
    *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param pinOrderId The pin order id associated with the ssio insertion order
    */
  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String): SSIOInsertionOrderStatusResponse

  /**
    * Get Salesforce order lines by ad account id.
    *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param pinOrderId The pin order id associated with the SSIO insertion order
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def ssioOrderLinesGetByAdAccount(adAccountId: String, pinOrderId: Option[String], bookmark: Option[String], pageSize: Option[Int]): SsioOrderLinesGetByAdAccount200Response
}
