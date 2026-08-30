package api

import play.api.libs.json._
import model.Error
import model.LeadForm
import model.LeadFormBatchUpdate
import model.LeadFormCreate
import model.LeadFormTest
import model.LeadFormTestCreate
import model.LeadFormsCreate200Response
import model.LeadFormsList200Response
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait LeadFormsApi {
  /**
    * Get lead form by id
    * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * @param leadFormId The ID of this lead form
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormGet(leadFormId: String, adAccountId: String): LeadForm

  /**
    * Create lead form test data
    * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate): LeadFormTest

  /**
    * Create lead forms
    * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsCreate(adAccountId: String, leadFormCreate: List[LeadFormCreate]): LeadFormsCreate200Response

  /**
    * List lead forms
    * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    */
  def leadFormsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): LeadFormsList200Response

  /**
    * Update lead forms
    * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsUpdate(adAccountId: String, leadFormBatchUpdate: List[LeadFormBatchUpdate]): LeadFormsCreate200Response
}
