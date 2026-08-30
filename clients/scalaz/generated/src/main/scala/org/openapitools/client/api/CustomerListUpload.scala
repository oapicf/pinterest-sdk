package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUpload._

case class CustomerListUpload (
  /* Advertiser ID. */
  adAccountId: String,
/* Customer List Upload creation_time. Epoch (seconds). */
  creationTime: Integer,
/* ID of the customer list associated with this upload. */
  customerListId: String,
/* Error counts by error code */
  errorCounts: Option[List[ErrorDetail]],
/* Customer List Upload ID. */
  id: String,
operation: UserListOperationType,
/* Record processing counts */
  recordCounts: Option[RecordCounts],
state: WorkloadState,
/* Customer List Upload updated_time. Epoch (seconds). */
  updatedTime: Integer)

object CustomerListUpload {
  import DateTimeCodecs._

  implicit val CustomerListUploadCodecJson: CodecJson[CustomerListUpload] = CodecJson.derive[CustomerListUpload]
  implicit val CustomerListUploadDecoder: EntityDecoder[CustomerListUpload] = jsonOf[CustomerListUpload]
  implicit val CustomerListUploadEncoder: EntityEncoder[CustomerListUpload] = jsonEncoderOf[CustomerListUpload]
}
