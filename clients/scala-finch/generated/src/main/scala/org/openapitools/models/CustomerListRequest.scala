package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserListType

/**
 * 
 * @param name Customer list name.
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @param listUnderscoretype 
 * @param exceptions Customer list errors.
 */
case class CustomerListRequest(name: String,
                records: String,
                listUnderscoretype: Option[UserListType],
                exceptions: Option[Object]
                )

object CustomerListRequest {
    /**
     * Creates the codec for converting CustomerListRequest from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListRequest] = deriveEncoder
}
