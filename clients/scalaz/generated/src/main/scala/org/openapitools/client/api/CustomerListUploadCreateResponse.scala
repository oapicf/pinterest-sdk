package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUploadCreateResponse._

case class CustomerListUploadCreateResponse (
  customerListUpload: CustomerListUpload,
s3MultipartUploadData: S3MultipartUploadData)

object CustomerListUploadCreateResponse {
  import DateTimeCodecs._

  implicit val CustomerListUploadCreateResponseCodecJson: CodecJson[CustomerListUploadCreateResponse] = CodecJson.derive[CustomerListUploadCreateResponse]
  implicit val CustomerListUploadCreateResponseDecoder: EntityDecoder[CustomerListUploadCreateResponse] = jsonOf[CustomerListUploadCreateResponse]
  implicit val CustomerListUploadCreateResponseEncoder: EntityEncoder[CustomerListUploadCreateResponse] = jsonEncoderOf[CustomerListUploadCreateResponse]
}
