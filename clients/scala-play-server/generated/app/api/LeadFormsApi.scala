package api

import play.api.libs.json._
import model.Error
import model.LeadFormArrayResponse
import model.LeadFormCreateRequest
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormUpdateRequest
import model.LeadFormsList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait LeadFormsApi {
  /**
    * Get lead form by id
    * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormGet(adAccountId: String, leadFormId: String): LeadFormResponse

  /**
    * Create lead form test data
    * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    * @param leadFormTestRequest Subscription to create.
    */
  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): LeadFormTestResponse

  /**
    * Create lead forms
    * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormCreateRequest List of lead forms to create, size limit [1, 30].
    */
  def leadFormsCreate(adAccountId: String, leadFormCreateRequest: List[LeadFormCreateRequest]): LeadFormArrayResponse

  /**
    * List lead forms
    * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def leadFormsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): LeadFormsList200Response

  /**
    * Update lead forms
    * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormUpdateRequest List of lead forms to update, size limit [1, 30].
    */
  def leadFormsUpdate(adAccountId: String, leadFormUpdateRequest: List[LeadFormUpdateRequest]): LeadFormArrayResponse
}
