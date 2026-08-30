package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUpload.
  * @param adAccountId Advertiser ID.
  * @param creationTime Customer List Upload creation_time. Epoch (seconds).
  * @param customerListId ID of the customer list associated with this upload.
  * @param errorCounts Error counts by error code
  * @param id Customer List Upload ID.
  * @param recordCounts Record processing counts
  * @param updatedTime Customer List Upload updated_time. Epoch (seconds).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListUpload(
  adAccountId: String,
  creationTime: Int,
  customerListId: String,
  errorCounts: Option[List[ErrorDetail]],
  id: String,
  operation: UserListOperationType,
  recordCounts: Option[RecordCounts],
  state: WorkloadState,
  updatedTime: Int
)

object CustomerListUpload {
  implicit lazy val customerListUploadJsonFormat: Format[CustomerListUpload] = Json.format[CustomerListUpload]
}

