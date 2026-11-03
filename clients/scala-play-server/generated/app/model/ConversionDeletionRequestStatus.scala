package model

import play.api.libs.json._

/**
  * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionDeletionRequestStatus(
)

object ConversionDeletionRequestStatus {
  implicit lazy val conversionDeletionRequestStatusJsonFormat: Format[ConversionDeletionRequestStatus] = Json.format[ConversionDeletionRequestStatus]
}

