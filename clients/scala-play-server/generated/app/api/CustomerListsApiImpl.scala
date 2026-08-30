package api

import model.CustomerList
import model.CustomerListCreate
import model.CustomerListUpdateWithRequiredBody
import model.CustomerListsList200Response
import model.Error
import model.PaginationOrder

/**
  * Provides a default implementation for [[CustomerListsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CustomerListsApiImpl extends CustomerListsApi {
  /**
    * @inheritdoc
    */
  override def customerListsCreate(adAccountId: String, customerListCreate: CustomerListCreate): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, "", None, "", None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def customerListsGet(adAccountId: String, customerListId: String): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, "", None, "", None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def customerListsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], excludeNca: Option[Boolean]): CustomerListsList200Response = {
    // TODO: Implement better logic

    CustomerListsList200Response(None, List.empty[CustomerList])
  }

  /**
    * @inheritdoc
    */
  override def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, "", None, "", None, None, None, None, None, None)
  }
}
