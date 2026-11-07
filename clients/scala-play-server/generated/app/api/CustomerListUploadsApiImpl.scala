package api

import model.CustomerListUpload
import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.Error

/**
  * Provides a default implementation for [[CustomerListUploadsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class CustomerListUploadsApiImpl extends CustomerListUploadsApi {
  /**
    * @inheritdoc
    */
  override def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): CustomerListUploadCreateResponse = {
    // TODO: Implement better logic

    CustomerListUploadCreateResponse(CustomerListUpload(null, 0, null, None, null, UserListOperationType(), None, WorkloadState(), 0), S3MultipartUploadData(None))
  }

  /**
    * @inheritdoc
    */
  override def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUpload = {
    // TODO: Implement better logic

    CustomerListUpload(null, 0, null, None, null, UserListOperationType(), None, WorkloadState(), 0)
  }

  /**
    * @inheritdoc
    */
  override def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUpload = {
    // TODO: Implement better logic

    CustomerListUpload(null, 0, null, None, null, UserListOperationType(), None, WorkloadState(), 0)
  }
}
