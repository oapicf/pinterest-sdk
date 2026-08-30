package api

import play.api.libs.json._
import model.AdAccountToAdAccountSharedAudience
import model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import model.AdAccountToBusinessSharedAudience
import model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.BusinessToAdAccountSharedAudience
import model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import model.BusinessToBusinessSharedAudience
import model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import model.Error
import model.Order
import model.SharedAudiencesForBusinessList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait AudienceSharingApi {
  /**
    * List accounts with access to an audience owned by an ad account
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    * @param audienceId Unique identifier of the audience to use to filter the results.
    * @param accountType Filter accounts by account type.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def adAccountsAudiencesSharedAccountsList(audienceId: String, accountType: AudienceAccountType, adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdAccountsAudiencesSharedAccountsList200Response

  /**
    * List accounts with access to an audience owned by a business
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    * @param businessId Unique identifier of the requesting business.
    * @param audienceId Unique identifier of the audience to use to filter the results.
    * @param accountType Filter accounts by account type.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, bookmark: Option[String], pageSize: Option[Int]): AdAccountsAudiencesSharedAccountsList200Response

  /**
    * List received audiences for a business
    * Get a list of received audiences for the given business.
    * @param businessId Unique identifier of the requesting business.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def sharedAudiencesForBusinessList(businessId: String, order: Option[Order], bookmark: Option[String], pageSize: Option[Int]): SharedAudiencesForBusinessList200Response

  /**
    * Update audience sharing between ad accounts
    * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody): AdAccountToAdAccountSharedAudience

  /**
    * Update audience sharing from an ad account to businesses
    * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToBusinessSharedAudience(adAccountId: String, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody): AdAccountToBusinessSharedAudience

  /**
    * Update audience sharing from a business to ad accounts
    * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToAdAccountSharedAudience(businessId: String, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody): BusinessToAdAccountSharedAudience

  /**
    * Update audience sharing between businesses
    * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToBusinessSharedAudience(businessId: String, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody): BusinessToBusinessSharedAudience
}
