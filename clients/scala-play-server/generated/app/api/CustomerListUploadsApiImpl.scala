package api

import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.CustomerListUploadResponse
import model.Error

/**
  * Provides a default implementation for [[CustomerListUploadsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CustomerListUploadsApiImpl extends CustomerListUploadsApi {
  /**
    * @inheritdoc
    */
  override def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): CustomerListUploadCreateResponse = {
    // TODO: Implement better logic

    CustomerListUploadCreateResponse(CustomerListUpload("", 0, "", None, "", UserListOperationType(), None, "", 0), S3MultipartUploadData(None))
  }

  /**
    * @inheritdoc
    */
  override def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUploadResponse = {
    // TODO: Implement better logic

    CustomerListUploadResponse("", 0, "", None, "", UserListOperationType(), None, "", 0)
  }

  /**
    * @inheritdoc
    */
  override def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUploadResponse = {
    // TODO: Implement better logic

    CustomerListUploadResponse("", 0, "", None, "", UserListOperationType(), None, "", 0)
  }
}
