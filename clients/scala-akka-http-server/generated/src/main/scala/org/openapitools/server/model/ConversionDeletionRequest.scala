package org.openapitools.server.model

import java.time.LocalDate

/**
 * Conversion deletion request
 *
 * @param createdTime Timestamp when the conversion deletion request was succesfully created. for example: ''null''
 * @param processedTime Timestamp when the conversion deletion request was processed. for example: ''null''
 * @param requestId Unique identifier of the conversion deletion request for example: ''null''
 * @param status Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. for example: ''null''
*/
final case class ConversionDeletionRequest (
  createdTime: LocalDate,
  processedTime: Option[LocalDate] = None,
  requestId: String,
  status: ConversionDeletionRequestStatus
)

