package api

import model.Error
import model.LeadFormArrayResponse
import model.LeadFormCreateRequest
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormUpdateRequest
import model.LeadFormsList200Response

/**
  * Provides a default implementation for [[LeadFormsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
class LeadFormsApiImpl extends LeadFormsApi {
  /**
    * @inheritdoc
    */
  override def leadFormGet(adAccountId: String, leadFormId: String): LeadFormResponse = {
    // TODO: Implement better logic

    LeadFormResponse(None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
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
  override def leadFormsCreate(adAccountId: String, leadFormCreateRequest: List[LeadFormCreateRequest]): LeadFormArrayResponse = {
    // TODO: Implement better logic

    LeadFormArrayResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): LeadFormsList200Response = {
    // TODO: Implement better logic

    LeadFormsList200Response(List.empty[LeadFormResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormsUpdate(adAccountId: String, leadFormUpdateRequest: List[LeadFormUpdateRequest]): LeadFormArrayResponse = {
    // TODO: Implement better logic

    LeadFormArrayResponse(None)
  }
}
