package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUploadResponse.
  * @param adAccountId Advertiser ID.
  * @param creationTime Customer List Upload creation_time. Epoch (seconds).
  * @param customerListId ID of the customer list associated with this upload.
  * @param errorCounts Error counts by error code
  * @param id Customer List Upload ID.
  * @param state Workload processing state
  * @param updatedTime Customer List Upload updated_time. Epoch (seconds).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomerListUploadResponse(
  adAccountId: String,
  creationTime: Int,
  customerListId: String,
  errorCounts: Option[List[ErrorDetail]],
  id: String,
  operation: UserListOperationType,
  recordCounts: Option[RecordCounts],
  state: CustomerListUploadResponse.State.Value,
  updatedTime: Int
)

object CustomerListUploadResponse {
  implicit lazy val customerListUploadResponseJsonFormat: Format[CustomerListUploadResponse] = Json.format[CustomerListUploadResponse]

  // noinspection TypeAnnotation
  object State extends Enumeration {
    val NOTSTARTED = Value("NOT_STARTED")
    val RUNNING = Value("RUNNING")
    val PAUSED = Value("PAUSED")
    val SUCCEEDED = Value("SUCCEEDED")
    val FAILED = Value("FAILED")

    type State = Value
    implicit lazy val StateJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

