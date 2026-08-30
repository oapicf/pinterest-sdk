package api

import play.api.libs.json._
import model.Error
import model.PaginationOrder
import model.TargetingTemplate
import model.TargetingTemplateCreate
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequestReadOrUpdate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait TargetingTemplateApi {
  /**
    * Create targeting templates
    * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): TargetingTemplate

  /**
    * List targeting templates
    * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param includeSizing Include audience sizing in result or not
    * @param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
    */
  def targetingTemplateList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], includeSizing: Option[Boolean], searchQuery: Option[String]): TargetingTemplateList200Response

  /**
    * Update targeting templates
    * Update the targeting template given advertiser ID and targeting template ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate): Unit
}
