package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Exception
import org.openapitools.models.UserListOperationType

/**
 * 
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @param operationUnderscoretype 
 * @param exceptions 
 */
case class CustomerListUpdateRequest(records: String,
                operationUnderscoretype: UserListOperationType,
                exceptions: Option[Exception]
                )

object CustomerListUpdateRequest {
    /**
     * Creates the codec for converting CustomerListUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListUpdateRequest] = deriveEncoder
}
