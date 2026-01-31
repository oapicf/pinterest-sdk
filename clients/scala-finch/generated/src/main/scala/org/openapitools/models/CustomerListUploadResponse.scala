package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ErrorDetail
import org.openapitools.models.RecordCounts
import org.openapitools.models.UserListOperationType
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Advertiser ID.
 * @param creationUnderscoretime Customer List Upload creation_time. Epoch (seconds).
 * @param customerUnderscorelistUnderscoreid ID of the customer list associated with this upload.
 * @param errorUnderscorecounts Error counts by error code
 * @param id Customer List Upload ID.
 * @param operation 
 * @param recordUnderscorecounts 
 * @param state Workload processing state
 * @param updatedUnderscoretime Customer List Upload updated_time. Epoch (seconds).
 */
case class CustomerListUploadResponse(adUnderscoreaccountUnderscoreid: String,
                creationUnderscoretime: Int,
                customerUnderscorelistUnderscoreid: String,
                errorUnderscorecounts: Option[Seq[ErrorDetail]],
                id: String,
                operation: UserListOperationType,
                recordUnderscorecounts: Option[RecordCounts],
                state: String,
                updatedUnderscoretime: Int
                )

object CustomerListUploadResponse {
    /**
     * Creates the codec for converting CustomerListUploadResponse from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListUploadResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListUploadResponse] = deriveEncoder
}
