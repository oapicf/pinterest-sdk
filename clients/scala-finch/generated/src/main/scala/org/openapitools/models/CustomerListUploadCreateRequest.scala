package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserListOperationType

/**
 * 
 * @param operation 
 * @param totalUnderscoreparts Number of parts to upload the file in.
 */
case class CustomerListUploadCreateRequest(operation: UserListOperationType,
                totalUnderscoreparts: Int
                )

object CustomerListUploadCreateRequest {
    /**
     * Creates the codec for converting CustomerListUploadCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListUploadCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListUploadCreateRequest] = deriveEncoder
}
