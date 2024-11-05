package api

import play.api.libs.json._
import model.Error
import model.TargetingTemplateCreate
import model.TargetingTemplateGetResponseData
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait TargetingTemplateApi {
  /**
    * Create targeting templates
    * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param targetingTemplateCreate targeting template creation entity
    */
  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): TargetingTemplateGetResponseData

  /**
    * List targeting templates
    * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param includeSizing Include audience sizing in result or not
    * @param searchQuery Search keyword for targeting templates
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def targetingTemplateList(adAccountId: String, order: Option[String], includeSizing: Option[Boolean], searchQuery: Option[String], pageSize: Option[Int], bookmark: Option[String]): TargetingTemplateList200Response

  /**
    * Update targeting templates
    * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param targetingTemplateUpdateRequest Operation type and targeting template ID
    */
  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest): Unit
}
