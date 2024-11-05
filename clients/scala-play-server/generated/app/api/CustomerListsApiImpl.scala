package api

import model.CustomerList
import model.CustomerListRequest
import model.CustomerListUpdateRequest
import model.CustomerListsList200Response
import model.Error

/**
  * Provides a default implementation for [[CustomerListsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class CustomerListsApiImpl extends CustomerListsApi {
  /**
    * @inheritdoc
    */
  override def customerListsCreate(adAccountId: String, customerListRequest: CustomerListRequest): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def customerListsGet(adAccountId: String, customerListId: String): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def customerListsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): CustomerListsList200Response = {
    // TODO: Implement better logic

    CustomerListsList200Response(List.empty[CustomerList], None)
  }

  /**
    * @inheritdoc
    */
  override def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest): CustomerList = {
    // TODO: Implement better logic

    CustomerList(None, None, None, None, None, None, None, None, None, None, None)
  }
}
