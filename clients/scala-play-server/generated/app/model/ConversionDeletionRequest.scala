package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Conversion deletion request
  * @param createdTime Timestamp when the conversion deletion request was succesfully created.
  * @param processedTime Timestamp when the conversion deletion request was processed.
  * @param requestId Unique identifier of the conversion deletion request
  * @param status Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionDeletionRequest(
  createdTime: LocalDate,
  processedTime: Option[LocalDate],
  requestId: String,
  status: ConversionDeletionRequestStatus
)

object ConversionDeletionRequest {
  implicit lazy val conversionDeletionRequestJsonFormat: Format[ConversionDeletionRequest] = Json.format[ConversionDeletionRequest]
}

