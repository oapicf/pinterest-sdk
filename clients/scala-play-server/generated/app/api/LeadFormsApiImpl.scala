package api

import model.Error
import model.LeadForm
import model.LeadFormBatchUpdate
import model.LeadFormCreate
import model.LeadFormTest
import model.LeadFormTestCreate
import model.LeadFormsCreate200Response
import model.LeadFormsList200Response
import model.PaginationOrder

/**
  * Provides a default implementation for [[LeadFormsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class LeadFormsApiImpl extends LeadFormsApi {
  /**
    * @inheritdoc
    */
  override def leadFormGet(leadFormId: String, adAccountId: String): LeadForm = {
    // TODO: Implement better logic

    LeadForm(None, "", None, None, false, "", "", None, "", List.empty[LeadFormQuestion], None, None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate): LeadFormTest = {
    // TODO: Implement better logic

    LeadFormTest(None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormsCreate(adAccountId: String, leadFormCreate: List[LeadFormCreate]): LeadFormsCreate200Response = {
    // TODO: Implement better logic

    LeadFormsCreate200Response(List.empty[LeadFormsCreate200ResponseItemsInner])
  }

  /**
    * @inheritdoc
    */
  override def leadFormsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): LeadFormsList200Response = {
    // TODO: Implement better logic

    LeadFormsList200Response(None, List.empty[LeadForm])
  }

  /**
    * @inheritdoc
    */
  override def leadFormsUpdate(adAccountId: String, leadFormBatchUpdate: List[LeadFormBatchUpdate]): LeadFormsCreate200Response = {
    // TODO: Implement better logic

    LeadFormsCreate200Response(List.empty[LeadFormsCreate200ResponseItemsInner])
  }
}
