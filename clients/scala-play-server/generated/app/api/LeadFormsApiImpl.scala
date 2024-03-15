package api

import model.Error
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormsList200Response

/**
  * Provides a default implementation for [[LeadFormsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class LeadFormsApiImpl extends LeadFormsApi {
  /**
    * @inheritdoc
    */
  override def leadFormGet(adAccountId: String, leadFormId: String): LeadFormResponse = {
    // TODO: Implement better logic

    LeadFormResponse(None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): LeadFormTestResponse = {
    // TODO: Implement better logic

    LeadFormTestResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): LeadFormsList200Response = {
    // TODO: Implement better logic

    LeadFormsList200Response(List.empty[LeadFormResponse], None)
  }
}
