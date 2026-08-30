
package org.openapitools.client.model

import java.time.LocalDate

case class ConversionDeletionRequest (
    /* Timestamp when the conversion deletion request was succesfully created. */
    _createdTime: LocalDate,
    /* Timestamp when the conversion deletion request was processed. */
    _processedTime: Option[LocalDate],
    /* Unique identifier of the conversion deletion request */
    _requestId: String,
    /* Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. */
    _status: ConversionDeletionRequestStatus
)
object ConversionDeletionRequest {
    def toStringBody(var_createdTime: Object, var_processedTime: Object, var_requestId: Object, var_status: Object) =
        s"""
        | {
        | "createdTime":$var_createdTime,"processedTime":$var_processedTime,"requestId":$var_requestId,"status":$var_status
        | }
        """.stripMargin
}
