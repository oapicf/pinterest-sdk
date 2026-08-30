package api

import play.api.libs.json._
import model.CustomerListUpload
import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CustomerListUploadsApi {
  /**
    * Create customer list upload
    * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
    * @param customerListId Customer list ID.
    */
  def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): CustomerListUploadCreateResponse

  /**
    * Get customer list upload
    * Get the metadata for a given upload by its ID.
    * @param customerListId Customer list ID.
    * @param customerListUploadId Customer List Upload ID.
    */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUpload

  /**
    * Run customer list upload
    * Begin processing a customer list upload.
    * @param customerListId Customer list ID.
    * @param customerListUploadId Customer List Upload ID.
    */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUpload
}
