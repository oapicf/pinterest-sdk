package api

import play.api.libs.json._
import model.Error
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormsList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait LeadFormsApi {
  /**
    * Get lead form by id
    * Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormGet(adAccountId: String, leadFormId: String): LeadFormResponse

  /**
    * Create lead form test data
    * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    * @param leadFormTestRequest Subscription to create.
    */
  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): LeadFormTestResponse

  /**
    * Get lead forms
    * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def leadFormsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): LeadFormsList200Response
}
