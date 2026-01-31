package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CustomerListUpload
import org.openapitools.models.S3MultipartUploadData

/**
 * 
 * @param customerUnderscorelistUnderscoreupload 
 * @param s3UnderscoremultipartUnderscoreuploadUnderscoredata 
 */
case class CustomerListUploadCreateResponse(customerUnderscorelistUnderscoreupload: CustomerListUpload,
                s3UnderscoremultipartUnderscoreuploadUnderscoredata: S3MultipartUploadData
                )

object CustomerListUploadCreateResponse {
    /**
     * Creates the codec for converting CustomerListUploadCreateResponse from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListUploadCreateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListUploadCreateResponse] = deriveEncoder
}
