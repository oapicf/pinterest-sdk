package api

import play.api.libs.json._
import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.AudiencesList200Response
import model.BusinessSharedAudience
import model.BusinessSharedAudienceResponse
import model.Error
import model.SharedAudience
import model.SharedAudienceResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait AudienceSharingApi {
  /**
    * List accounts with access to an audience owned by an ad account
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceId Unique identifier of the audience to use to filter the results.
    * @param accountType Filter accounts by account type.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def adAccountsAudiencesSharedAccountsList(adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): AdAccountsAudiencesSharedAccountsList200Response

  /**
    * List accounts with access to an audience owned by a business
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    * @param businessId Unique identifier of the requesting business.
    * @param audienceId Unique identifier of the audience to use to filter the results.
    * @param accountType Filter accounts by account type.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): AdAccountsAudiencesSharedAccountsList200Response

  /**
    * List received audiences for a business
    * Get a list of received audiences for the given business.
    * @param businessId Unique identifier of the requesting business.
    * @param bookmark Cursor used to fetch the next page of items
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def sharedAudiencesForBusinessList(businessId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int]): AudiencesList200Response

  /**
    * Update audience sharing between ad accounts
    * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience): SharedAudienceResponse

  /**
    * Update audience sharing from an ad account to businesses
    * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience): BusinessSharedAudienceResponse

  /**
    * Update audience sharing from a business to ad accounts
    * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience): SharedAudienceResponse

  /**
    * Update audience sharing between businesses
    * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience): BusinessSharedAudienceResponse
}
